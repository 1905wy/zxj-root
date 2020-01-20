package com.zxj.nb.mapper;



import com.zxj.nb.entity.AdminEntity;
import com.zxj.nb.pojo.AdminPojo;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdminMapper {

    /**
     * 管理员登录
     * @param adminEntity
     * @return
     */
    public AdminPojo login(AdminEntity adminEntity);


    public AdminPojo loginQueryAuth(AdminEntity adminEntity);


    public AdminPojo queryAuthById(int aid);


    public List<AdminPojo> queryAdminList(AdminEntity adminEntity);

    public boolean delAdmins(String[] ids);


    public int addAdmin(AdminEntity adminEntity);

    public boolean bindRoles(@Param("aid") int aid, @Param("roles") int[] roles);

    public boolean deleAdmin(String id);



}
