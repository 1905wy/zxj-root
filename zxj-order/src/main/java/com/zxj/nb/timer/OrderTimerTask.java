package com.zxj.nb.timer;

;
import com.zxj.nb.serivce.IOrderService;

import java.util.Timer;
import java.util.TimerTask;


public class OrderTimerTask extends TimerTask {


    private IOrderService orderService;


    private Timer timer;


    private String oid;

    public OrderTimerTask() {

    }


    public OrderTimerTask(IOrderService orderService, Timer timer , String oid) {
        this.orderService = orderService;
        this.timer = timer;
        this.oid = oid;
    }


    @Override
    public void run() {



        boolean bl = orderService.cancelOrder(oid);

        if(bl){
            timer.cancel();
        }
    }
}
