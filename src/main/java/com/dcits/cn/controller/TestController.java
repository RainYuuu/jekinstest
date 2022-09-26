package com.dcits.cn.controller;

import com.dcits.cn.entity.User;
import com.dcits.cn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：
 * @ClassName：TestController
 * @Author:Mryu7
 * @Date:2022/9/2613:15
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;


    @GetMapping("/test")
    public String testJekins(){

        User user = testService.returnUser();

        if(user==null){
            return "创建user失败";
        }else{
            return "创建成功  \n"+user;
        }

    }

}
