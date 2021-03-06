package com.zxj.nb.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name ="shop_admin")
public class AdminPojo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int aid;
    private String aname;
    private String aacount;
    private String apass;
    private String aphone;
    private short astatus;

    private List<RolePojo> roles;

    public List<RolePojo> getRoles() {
        return roles;
    }

    public void setRoles(List<RolePojo> roles) {
        this.roles = roles;
    }

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

    public String getAacount() {
        return aacount;
    }

    public void setAacount(String aacount) {
        this.aacount = aacount;
    }

    public String getApass() {
        return apass;
    }

    public void setApass(String apass) {
        this.apass = apass;
    }

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone;
    }

    public short getAstatus() {
        return astatus;
    }

    public void setAstatus(short astatus) {
        this.astatus = astatus;
    }
}
