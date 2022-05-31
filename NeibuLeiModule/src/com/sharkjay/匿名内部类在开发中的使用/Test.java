package com.sharkjay.匿名内部类在开发中的使用;
//当发现某个方法需要，接口或抽象类的子类对象，我们就可以传递一个匿名内部类过去，来简化传统的代码
public class Test {
    public static void main(String[] args) {

        goSwimming(new Swimming() {
            //方法重写，编译看左边，执行看右边重写的内容
            @Override
            public void swim() {
                System.out.println("游泳");
            }
        });

        //使用Lambda表达式
        /*通过Lambda表达式实现
            理解: 对于Lambda表达式, 对匿名内部类进行了优化*/
        goSwimming(() -> System.out.println("游泳"));
    }


    public static void goSwimming(Swimming s){
        //调用接口中的抽象方法
        s.swim();
    }
}

//创建接口
interface Swimming{

    public abstract void swim();
}

