package com.zxj.nb.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shop_customer")
public class CustomerPojo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int aid;
    private String aname;
    private String apass;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApass() {
        return apass;
    }

    public void setApass(String apass) {
        this.apass = apass;
    }
}
