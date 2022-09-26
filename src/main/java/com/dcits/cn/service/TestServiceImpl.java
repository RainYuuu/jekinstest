package com.dcits.cn.service;

import com.dcits.cn.entity.User;
import com.dcits.cn.mapper.TestMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description：
 * @ClassName：TestServiceImpl
 * @Author:Mryu7
 * @Date:2022/9/2613:19
 */

@Service
public class TestServiceImpl implements TestService{



    @Autowired
    private TestMapper testMapper;


    @Override
    public User returnUser() {
        return  testMapper.returnUser();
    }
}
