package com.zxj.nb.web;


import com.zxj.nb.pojo.CustomerPojo;
import com.zxj.nb.pojo.GoodsPojo;
import com.zxj.nb.pojo.OrderPojo;
import com.zxj.nb.serivce.IOrderService;
import com.zxj.nb.timer.OrderTimerTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

@Controller
public class OrderController {

    public static Map<String,Timer> map = new HashMap<>();

    @Autowired
    IOrderService orderService;


    @RequestMapping("createOrder")
    public ModelAndView createOrder(String[] goodsIds, HttpSession session){

        ModelAndView mv = new ModelAndView("login");


        CustomerPojo customerPojo = (CustomerPojo) session.getAttribute("customer");
        if(null == customerPojo){
            return mv;
        }


        Map<String, GoodsPojo> shopCar = (Map<String, GoodsPojo>) session.getAttribute("shopCar");
        if(null == shopCar){
            mv.setViewName("index");
            return mv;
        }


        OrderPojo orderPojo = orderService.create(customerPojo.getAid(), goodsIds, shopCar);


        Timer timer = new Timer();
        OrderTimerTask ott = new OrderTimerTask(orderService,timer,orderPojo.getOid());


        timer.schedule(ott,30000); // 30*60*1000

        map.put(orderPojo.getOid(),timer);


        session.setAttribute("shopCar",shopCar);

        mv.addObject("orderPojo",orderPojo);
        mv.setViewName("apay");
        return mv;
    }


    @RequestMapping("apay")
    public String apay(String oid){

        boolean bl = orderService.apaySuccess(oid);


        map.get(oid).cancel();
        map.remove(oid);

        return "success";
    }

}
