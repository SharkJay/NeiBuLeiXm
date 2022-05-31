package com.无参有返回值;

import java.util.Random;

public class RandomNumDemo {
    public static void main(String[] args) {

        useRandomNum(new RandomNum() {
            @Override
            public int getnumber() {
                Random random = new Random();
                int result = random.nextInt(10) + 1;
                return result;
            }
        });

        //Lamdba
        useRandomNum(()->{
            Random random = new Random();
            int result = random.nextInt(10) + 1;
            return result;
        });
    }

    //编写使用方法，参数列表为接口的实现类对象
    public static void useRandomNum(RandomNum randomNum){
        //调用接口中的抽象方法并且接收返回值
        int result = randomNum.getnumber();
        System.out.println(result);
    }
}

interface RandomNum{
    //定义抽象方法，返回值为int 类型
    int getnumber();
}