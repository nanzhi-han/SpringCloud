package com.example.demo.service;

import com.example.demo.model.UserInfo;

/**
 * @author: SJH
 * @ClassName: UserInfoServie
 * @Description:
 */
public interface UserInfoServie {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
