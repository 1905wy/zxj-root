package com.zxj.nb.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name =  "t_user")
public class UserPojo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int uid;
    private String uname;
    private String upass;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }
}