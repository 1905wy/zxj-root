package com.zxj.nb.entity;

import com.zxj.nb.pojo.GoodsTypePojo;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shop_goods")
public class GoodsEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String gid;
    private String gname;
    private String gimage;
    private float gprice;
    private String gdesc;
    private float gdiscount;
    private int isdelete;
    private int glabel = -1;
    private int gsex = -1;
    private int gtype;

    private int number = 1;

    private float pricemin = -1;
    private float pricemax = -1;

    private int pageNum = 1;
    private int pageSize = 5;

    private GoodsTypePojo goodsType;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public float getPricemin() {
        return pricemin;
    }

    public void setPricemin(float pricemin) {
        this.pricemin = pricemin;
    }

    public float getPricemax() {
        return pricemax;
    }

    public void setPricemax(float pricemax) {
        this.pricemax = pricemax;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGimage() {
        return gimage;
    }

    public void setGimage(String gimage) {
        this.gimage = gimage;
    }

    public float getGprice() {
        return gprice;
    }

    public void setGprice(float gprice) {
        this.gprice = gprice;
    }

    public String getGdesc() {
        return gdesc;
    }

    public void setGdesc(String gdesc) {
        this.gdesc = gdesc;
    }

    public float getGdiscount() {
        return gdiscount;
    }

    public void setGdiscount(float gdiscount) {
        this.gdiscount = gdiscount;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    public int getGlabel() {
        return glabel;
    }

    public void setGlabel(int glabel) {
        this.glabel = glabel;
    }

    public int getGsex() {
        return gsex;
    }

    public void setGsex(int gsex) {
        this.gsex = gsex;
    }

    public int getGtype() {
        return gtype;
    }

    public void setGtype(int gtype) {
        this.gtype = gtype;
    }

    public GoodsTypePojo getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsTypePojo goodsType) {
        this.goodsType = goodsType;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}

