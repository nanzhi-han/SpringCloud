package com.example.springaop;

/**
 * @author: SJH
 * @ClassName: UserServiceImpl
 * @Description:
 */
public class UserServiceImpl implements UserService {
    @Override
    public void login() {
        System.out.println("login触发");
    }
}
