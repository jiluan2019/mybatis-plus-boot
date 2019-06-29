package com.jocker.service.impl;

import com.jocker.entity.User;
import com.jocker.mapper.UserMapper;
import com.jocker.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* <p>
    * 用户表 服务实现类
    * </p>
*
* @author zhuolin
* @since 2019-06-28
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
