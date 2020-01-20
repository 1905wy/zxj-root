package com.zxj.nb.impl;

import com.github.pagehelper.PageHelper;
import com.zxj.nb.entity.RoleEntity;
import com.zxj.nb.mapper.RoleMapper;
import com.zxj.nb.pojo.RolePojo;
import com.zxj.nb.serivce.IRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {


    RoleMapper roleMapper;

    /**
     * 根据条件查询所有的角色
     * @param roleEntity
     * @return
     */
    public List<RolePojo> queryRoles(RoleEntity roleEntity){

        if(null != roleEntity){
            PageHelper.startPage(roleEntity.getPageNum(),roleEntity.getPageSize());
        }

        return roleMapper.queryRoles(roleEntity);
    }

}
