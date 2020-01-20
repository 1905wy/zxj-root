package com.zxj.nb.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shop_order_detail")
public class OrderDetailPojo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String odid;
    private String oid;
    private String gid;
    private float odprice;
    private int odnumber;

    private GoodsPojo goodsPojo;

    public String getOdid() {
        return odid;
    }

    public void setOdid(String odid) {
        this.odid = odid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public float getOdprice() {
        return odprice;
    }

    public void setOdprice(float odprice) {
        this.odprice = odprice;
    }

    public int getOdnumber() {
        return odnumber;
    }

    public void setOdnumber(int odnumber) {
        this.odnumber = odnumber;
    }

    public GoodsPojo getGoodsPojo() {
        return goodsPojo;
    }

    public void setGoodsPojo(GoodsPojo goodsPojo) {
        this.goodsPojo = goodsPojo;
    }
}
