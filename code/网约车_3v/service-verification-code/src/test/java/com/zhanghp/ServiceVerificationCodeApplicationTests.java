package com.zhanghp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class ServiceVerificationCodeApplicationTests {

    @Test
    void contextLoads() {
        System.out.println((int) (Math.random() * Math.pow(10, 6)));
    }

    @Test
    void comp() {
        // 老师的方案
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String code = String.valueOf((int) ((Math.random() * 9 + 1) * Math.pow(10, 5)));
        }
        long end = System.currentTimeMillis();
        System.out.println("老师：" + (end - start));
        // 我自己想出的方案（比老师的快）
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String code2 = String.valueOf((int) (Math.random() * Math.pow(10, 6)));
        }
        end = System.currentTimeMillis();
        System.out.println("我：" + (end - start));
        // 老师同事的方案
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String code3 = (Math.random() + "").substring(2, 8);
        }
        end = System.currentTimeMillis();
        System.out.println("老师同事：" + (end - start));
    }

    @Test
    void math() {
        for (int i = 0; i < 10; i++) {
            double a = Math.random();
            System.out.println(a);
        }

    }

    @Test
    void math2() {
        String substring = (Math.random() + "").substring(2, 8);
        System.out.println(substring);
        String i1 = String.valueOf((int) (Math.random() * Math.pow(10, 6)));
        System.out.println(i1);
    }
}
