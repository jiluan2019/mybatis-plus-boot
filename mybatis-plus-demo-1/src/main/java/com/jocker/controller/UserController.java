package com.jocker.controller;


import com.jocker.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author zhuolin
 * @since 2019-06-28
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/getOne")
    public Object getOne(Long id) {
        return userService.getById(id);
    }

}
