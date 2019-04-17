package com.example.demo.service.impl;

import com.example.demo.mapper.UserInfoDao;
import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoServie;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: SJH
 * @ClassName: UserInfoServiceImpl
 * @Description:
 */
@Service
public class UserInfoServiceImpl implements UserInfoServie {

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}
