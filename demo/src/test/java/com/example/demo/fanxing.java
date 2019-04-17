package com.example.demo;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: SJH
 * @ClassName: fanxing
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class fanxing {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("5546");
        list.add("adasd");
        list.add(10);
        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i);
            System.out.println("name="+s);
        }
    }
}
