package com.example.demo.web;

import com.example.demo.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author: SJH
 * @ClassName: UserController
 * @Description:
 */
@RestController
public class UserController {
    @RequestMapping(value = "getRedishc")
    @Cacheable(value = "user-key")
    public User user() {
        User user = new User("aa@126.com", "aa", "aa123456", "aa", "123");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }

}
