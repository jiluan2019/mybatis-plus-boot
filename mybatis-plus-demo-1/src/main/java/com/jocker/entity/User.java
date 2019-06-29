package com.jocker.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;



import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* 用户表
*
* @author zhuolin
* @since 2019-06-28
*/
@Data
public class User implements Serializable {


    /**
     * 用户表id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    /**
     * 真实姓名
     */
    @TableField("real_name")
    private String realName;

    /**
     * 登陆密码
     */
    private String password;

    /**
     * 电话
     */
    private String phone;



}
