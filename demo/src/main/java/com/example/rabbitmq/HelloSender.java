package com.example.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: SJH
 * @ClassName: HelloSender
 * @Description: 发送者
 */
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello"+new Date();
        System.out.println("Sender:"+context);
        this.amqpTemplate.convertAndSend("hello",context);
    }
}
