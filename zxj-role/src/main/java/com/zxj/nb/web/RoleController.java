package com.zxj.nb.web;


import com.github.pagehelper.PageInfo;
import com.zxj.nb.anno.AuthAnno;
import com.zxj.nb.code.ResponseResult;
import com.zxj.nb.entity.AdminEntity;
import com.zxj.nb.pojo.AdminPojo;
import com.zxj.nb.pojo.AuthPojo;
import com.zxj.nb.pojo.RolePojo;
import com.zxj.nb.serivce.IAdminService;
import com.zxj.nb.serivce.IRoleService;
import com.zxj.nb.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Controller
@SessionAttributes({"admin","authstring","auths"})
public class RoleController {


    @Autowired
    IRoleService roleService;


    @RequestMapping("jumpAdminAdd")
    public String jumpAdminAdd(ModelMap map){

        //查询所有角色;放到页面去展示;
        List<RolePojo> roles = roleService.queryRoles(null);

        map.addAttribute("roles",roles);

        return "adminadd";
    }


}







