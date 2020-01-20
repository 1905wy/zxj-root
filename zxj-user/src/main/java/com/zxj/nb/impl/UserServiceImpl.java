package com.zxj.nb.impl;


import com.zxj.nb.entity.UserEntity;
import com.zxj.nb.mapper.UserMapper;
import com.zxj.nb.serivce.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    UserMapper userMapper ;

    @Override
    public UserEntity selectUserById(Integer userId) {
        return userMapper.selectUserById(userId);

    }

    @Override
    public void regist(UserEntity userEntity) {
        userMapper.addUser(userEntity);
    }

    @Override
    public UserEntity login(String name, String password) {
        UserEntity userEntity = userMapper.findByUsername(name);
        if(userEntity != null && userEntity.getUpass().equals(password)){
            return userEntity;
        }
        return null;
    }

}
