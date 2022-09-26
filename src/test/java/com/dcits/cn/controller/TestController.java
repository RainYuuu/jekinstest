package com.dcits.cn.controller;

import com.dcits.cn.App;
import com.dcits.cn.entity.User;
import com.dcits.cn.service.TestService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @Description：
 * @ClassName：TestController
 * @Author:Mryu7
 * @Date:2022/9/2617:59
 */
@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class TestController {


    @Autowired
    private TestService testService;


    @Test
    public void test1(){

        User user1 = testService.returnUser();
//        System.out.println(user1);
//
//        User user = new User()
//                .setId(1)
//                .setDept("kaifa")
//                .setName("zhangsan")
//                .setCreateTime(new Date())
//                .setUpdateTime(new Date());

        Assertions.assertNull(user1);
//            Assertions.assertNotNull(user1);
    }
}
