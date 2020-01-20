package com.zxj.nb.serivce;



import com.zxj.nb.entity.RoleEntity;
import com.zxj.nb.pojo.RolePojo;

import java.util.List;

public interface IRoleService {

    public List<RolePojo> queryRoles(RoleEntity roleEntity);

}

