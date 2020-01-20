package com.zxj.nb.serivce;



import com.zxj.nb.pojo.GoodsPojo;
import com.zxj.nb.pojo.OrderPojo;

import java.util.Map;

public interface IOrderService {


    public OrderPojo create(int aid, String[] gids, Map<String, GoodsPojo> shopCar);


    public boolean cancelOrder(String oid);


    public boolean apaySuccess(String oid);

}
