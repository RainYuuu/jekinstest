package com.dcits.cn.mapper;

import com.dcits.cn.entity.User;
import org.springframework.stereotype.Repository;


import java.util.Date;

/**
 * @Description：
 * @ClassName：TestMapperImpl
 * @Author:Mryu7
 * @Date:2022/9/2613:20
 */

@Repository
public class TestMapperImpl implements TestMapper {
    @Override
    public User returnUser() {

        User user = new User().setId(1).setDept("开发部").setName("张三").setCreateTime(new Date()).setUpdateTime(new Date());
        return user;
    }
}
