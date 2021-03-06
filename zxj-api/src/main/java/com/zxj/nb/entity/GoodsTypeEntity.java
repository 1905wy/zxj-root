package com.zxj.nb.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shop_goods_type")
public class GoodsTypeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int tid;
    private String tname;
    private String timage;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTimage() {
        return timage;
    }

    public void setTimage(String timage) {
        this.timage = timage;
    }
}
