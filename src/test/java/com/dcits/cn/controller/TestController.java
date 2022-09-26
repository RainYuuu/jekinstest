package com.dcits.cn.controller;

import com.dcits.cn.entity.User;
import com.dcits.cn.service.TestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description：
 * @ClassName：TestController
 * @Author:Mryu7
 * @Date:2022/9/2617:59
 */
@SpringBootTest
public class TestController {


    @Autowired
    private TestService testService;


    @Test
    public String test1(){

        User user = testService.returnUser();

        if(user==null){
            return "{\"code:1\",\"msg:失败\"}";
        }else{
            return "{\"code:2\",\"msg:成功\"}";
        }

    }
}
