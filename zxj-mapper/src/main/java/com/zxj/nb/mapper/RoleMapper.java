package com.zxj.nb.mapper;



import com.zxj.nb.entity.RoleEntity;
import com.zxj.nb.pojo.RolePojo;

import java.util.List;

public interface RoleMapper {
    /**
     * 根据条件查询所有的角色
     * @param roleEntity
     * @return
     */
    public List<RolePojo> queryRoles(RoleEntity roleEntity);
}
