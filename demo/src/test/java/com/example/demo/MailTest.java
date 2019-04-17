package com.example.demo;

import com.example.email.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: SJH
 * @ClassName: MailTest
 * @Description: 邮件测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {

    @Autowired
    private MailService mailService;

    @Test
    public void test() throws Exception {
        mailService.sendSimpleMail("1518005255@qq.com","test simple mail"," hello this is simple mail");
    }


}
