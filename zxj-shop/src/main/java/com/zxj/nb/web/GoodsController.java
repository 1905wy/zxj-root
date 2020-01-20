package com.zxj.nb.web;


import com.zxj.nb.entity.GoodsEntity;
import com.zxj.nb.serivce.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GoodsController {

    @Autowired
    IGoodsService goodsService;

    @RequestMapping("queryGoodsList")
    public ModelAndView queryGoodsList() {
        ModelAndView mav = new ModelAndView();
        List<GoodsEntity> list = goodsService.queryGoodsList();
        mav.addObject("list", list);
        mav.setViewName("goodslist");
        return mav;
    }

    @RequestMapping(value = "add")
    public String add(GoodsEntity goodsEntity) {
        goodsService.insertGoods(goodsEntity);
        return "forward:goodslist";
    }

    @RequestMapping(value = "update")
    public String update(GoodsEntity goodsEntity) {
        goodsService.updateGoods(goodsEntity);
        return "forward:goodslist";
    }


    @RequestMapping(value = "delete")
    public String delete(Integer gid) {
        goodsService.deleteGoods(gid);
        return "forward:goodslist";
    }

}
