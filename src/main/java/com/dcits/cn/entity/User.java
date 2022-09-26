package com.dcits.cn.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @Description：
 * @ClassName：User
 * @Author:Mryu7
 * @Date:2022/9/2613:16
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class User {

    private int id;
    private String name;
    private String dept;
    private Date createTime;
    private Date updateTime;


}
