package com.boot.dubbo.provider.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.boot.duboo.domian.UserInfo;
import com.boot.duboo.domian.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public List<UserInfo> getUserById(long id) {
        UserInfo userInfo1 = new UserInfo(1L,"张三二哥",12,"北京");
        UserInfo userInfo2 = new UserInfo(2L,"李四二哥",13,"上海");
        return Arrays.asList(userInfo1,userInfo2);
    }
}
