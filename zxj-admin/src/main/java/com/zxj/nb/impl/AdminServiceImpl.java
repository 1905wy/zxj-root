package com.zxj.nb.impl;


import com.github.pagehelper.PageHelper;
import com.zxj.nb.entity.AdminEntity;
import com.zxj.nb.mapper.AdminMapper;
import com.zxj.nb.pojo.AdminPojo;
import com.zxj.nb.serivce.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService {


    AdminMapper adminMapper;

    public AdminPojo login(AdminEntity adminEntity) {
        return adminMapper.loginQueryAuth(adminEntity);
    }


    public List<AdminPojo> queryAdminList(AdminEntity adminEntity) {

        PageHelper.startPage(adminEntity.getPageNum(), adminEntity.getPageSize());

        return adminMapper.queryAdminList(adminEntity);
    }


    public boolean delAdmins(String[] ids){
        return adminMapper.delAdmins(ids);
    }


    public boolean addAdmin(AdminEntity adminEntity){


        int ap = adminMapper.addAdmin(adminEntity);


        boolean bl = adminMapper.bindRoles(adminEntity.getAid() , adminEntity.getRoleids());

        return bl;
    }


    public boolean deleAdmin(String id) {
        return adminMapper.deleAdmin(id);
    }
}

