package com.zxj.nb.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shop_order")
public class OrderPojo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String oid;
    private int aid;
    private int addressId;
    private int ostatus;
    private Date odate;
    private float ototal;


    List<OrderDetailPojo> details = new ArrayList<>();

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getOstatus() {
        return ostatus;
    }

    public void setOstatus(int ostatus) {
        this.ostatus = ostatus;
    }

    public Date getOdate() {
        return odate;
    }

    public void setOdate(Date odate) {
        this.odate = odate;
    }

    public float getOtotal() {
        return ototal;
    }

    public void setOtotal(float ototal) {
        this.ototal = ototal;
    }

    public List<OrderDetailPojo> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetailPojo> details) {
        this.details = details;
    }
}
