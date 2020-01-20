package com.zxj.nb.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zxj.nb.entity.UserEntity;
import com.zxj.nb.serivce.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    IUserService userService;
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/userhello")
    public ModelAndView getIndex(){
        ModelAndView mav = new ModelAndView("hello");
        UserEntity userEntity = userService.selectUserById(1);
        mav.addObject("hello", "Hello Spring Boot!!!");
        mav.addObject("userEntity", userEntity);
        return mav;
    }
    @RequestMapping("/hello")
    public ModelAndView gIndex(){
        ModelAndView mav = new ModelAndView();
        UserEntity userEntity = userService.selectUserById(1);
        mav.addObject("hello", "Hello Spring Boot!!!");
        mav.addObject("userEntity", userEntity);
        mav.setViewName("hello");
        return mav;
    }

    @RequestMapping("/regist")
    public String regist(){
        return "regist";
    }

    @RequestMapping("/doRegist")
    public String doRegist( UserEntity userEntity){
        System.out.println(userEntity.getUname());
        userService.regist(userEntity);
        return "success";
    }

    @RequestMapping("/login")
    public String login( UserEntity userEntity){
        userEntity = userService.login(userEntity.getUname(),userEntity.getUpass());
        if(userEntity != null){
            return "success";
        }
        System.out.println(userEntity);
        return "fail";
    }

}

