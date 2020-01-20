package com.zxj.nb.mapper;


import com.zxj.nb.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import org.springframework.data.repository.query.Param;

public interface UserMapper  {
    @Select("SELECT * FROM t_user WHERE uid = #{uid}")
    public UserEntity selectUserById(Integer uid);

    // 添加用户
    @Insert("insert into t_user(uname, upass) values(#{uname}, #{upass})")
    public void addUser(UserEntity userEntity);

    @Select("select uname, upass from t_user where uname=#{uname}")
    public UserEntity findByUsername(@Param("name") String name);




}
