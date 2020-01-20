package com.zxj.nb.serivce;



import com.zxj.nb.entity.AdminEntity;
import com.zxj.nb.pojo.AdminPojo;

import java.util.List;

public interface IAdminService {

    public AdminPojo login(AdminEntity adminEntity);


    public List<AdminPojo> queryAdminList(AdminEntity adminEntity);


    public boolean delAdmins(String[] ids);


    public boolean addAdmin(AdminEntity adminEntity);
    public boolean deleAdmin(String id);
}

