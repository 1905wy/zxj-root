package com.zxj.nb.mapper;



import com.zxj.nb.pojo.OrderDetailPojo;
import com.zxj.nb.pojo.OrderPojo;

import java.util.List;

public interface OrderMapper {


    public boolean createOrder(OrderPojo orderPojo);


    public boolean createOrderDetails(List<OrderDetailPojo> detais);


    public boolean cancelOrder(String oid);


    public boolean apaySuccess(String oid);

}
