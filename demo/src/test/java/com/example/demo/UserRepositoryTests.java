package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author: SJH
 * @ClassName: UserRepositoryTests
 * @Description:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateInstance = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        String format = dateInstance.format(date);

        userRepository.save(new User("aa1", "aa@126.com", "aa", "aa123456",format));
        userRepository.save(new User("bb2", "bb@126.com", "bb", "bb123456",format));
        userRepository.save(new User("cc3", "cc@126.com", "cc", "cc123456",format));

        //Assert.assertEquals(9, userRepository.findAll().size());
        Assert.assertEquals("bb2", userRepository.findByUserNameOrEmail("bb", "xx@126.com").getNickName());
        userRepository.delete(userRepository.findByUserName("aa"));
    }
}
