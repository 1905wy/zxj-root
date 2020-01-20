package com.zxj.nb.impl;


import com.zxj.nb.mapper.OrderMapper;
import com.zxj.nb.pojo.GoodsPojo;
import com.zxj.nb.pojo.OrderDetailPojo;
import com.zxj.nb.pojo.OrderPojo;
import com.zxj.nb.serivce.IOrderService;
import com.zxj.nb.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements IOrderService {


    OrderMapper orderMapper;

    @Override
    public OrderPojo create(int aid, String[] gids, Map<String, GoodsPojo> shopCar) {

        //构建订单信息
        OrderPojo orderPojo = new OrderPojo();
        orderPojo.setAid(aid);
        orderPojo.setAddressId(1);
        orderPojo.setOid(StringUtils.uuid());


        float total = getTotalPrice(gids,shopCar);
        orderPojo.setOtotal(total);

        //保存订单信息
        boolean flag = orderMapper.createOrder(orderPojo);

        if(flag){ //创建订单成功,给这个订单添加订单详情


            List<OrderDetailPojo> details = createOrderDetails(gids,shopCar,orderPojo.getOid());


            boolean bl = orderMapper.createOrderDetails(details);

            if(bl){

                orderPojo.setDetails(details);


                for(String gid:gids){
                    shopCar.remove(gid);
                }

                return orderPojo;//返回
            }
        }

        return null;
    }


    @Override
    public boolean cancelOrder(String oid) {
        return orderMapper.cancelOrder(oid);
    }

    @Override
    public boolean apaySuccess(String oid) {
        return orderMapper.apaySuccess(oid);
    }


    private List<OrderDetailPojo> createOrderDetails(String[] gids, Map<String, GoodsPojo> shopCar, String oid) {

        List<OrderDetailPojo> list = new ArrayList<OrderDetailPojo>();

        GoodsPojo gp;
        OrderDetailPojo odp;
        for(String gid : gids){
            gp = shopCar.get(gid);
            odp = new OrderDetailPojo();

            odp.setOdid(StringUtils.uuid());
            odp.setOid(oid);
            odp.setGoodsPojo(gp);
            odp.setOdnumber(gp.getNumber());
            odp.setOdprice(gp.getGprice() * gp.getGdiscount());

            list.add(odp);
        }

        return list;
    }


    private float getTotalPrice(String[] gids, Map<String, GoodsPojo> shopCar) {

        float total = 0.0f;

        GoodsPojo gp;
        for(String gid : gids){
            gp = shopCar.get(gid);
            total += gp.getGprice() * gp.getGdiscount() * gp.getNumber();
        }

        return total;
    }
}
