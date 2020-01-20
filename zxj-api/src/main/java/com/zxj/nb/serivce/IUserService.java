package com.zxj.nb.serivce;



import com.zxj.nb.entity.UserEntity;


import java.util.List;

public interface IUserService {
    UserEntity selectUserById(Integer uid);

    // 用户注册
    void regist(UserEntity userEntity);

    // 用户登录
    UserEntity login(String name, String password);

}
