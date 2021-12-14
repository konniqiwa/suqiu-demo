package com.suqiu.suqiuuser.service.impl;

import com.suqiu.suqiuuser.entity.User;
import com.suqiu.suqiuuser.mapper.UserMapper;
import com.suqiu.suqiuuser.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author suqiu
 * @since 2021-12-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
