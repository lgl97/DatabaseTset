package com.test;

import java.util.Random;

public class TestDemo {


    public void test1(){
        Random random = new Random();
        for (int i = 0;i < 10; i++){
            int a = random.nextInt();
            System.out.println(a);
        }
    }

}
