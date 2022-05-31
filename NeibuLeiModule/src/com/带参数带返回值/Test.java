package com.带参数带返回值;

/*Lambda表达式的使用前提
有一个接口
接口中有且仅有一个抽象方法*/
public class Test {
    public static void main(String[] args) {

        useCal(new Cal() {
            //方法重写，让ab相加
            @Override
            public int calNum(int a, int b) {
                return a + b;
            }
        });

        useCal((int a, int b) -> {
            return a + b;
        });
    }

    public static void useCal(Cal c) {
        int num = c.calNum(10, 20);
        System.out.println(num);
    }
}

interface Cal {
    int calNum(int a, int b);
}