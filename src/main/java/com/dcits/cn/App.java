package com.dcits.cn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Description：
 * @ClassName：App
 * @Author:Mryu7
 * @Date:2022/9/2613:29
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})

public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
