package com.有参无返回值抽象方法的练习;

/*定义一个接口(Flyable)，里面定义一个抽象方法：void fly(String s);
定义一个测试类(FlyableDemo)，在测试类中提供两个方法
一个方法是：useFlyable(Flyable f)
一个方法是主方法，在主方法中调用useFlyable方法*/
public class Test3 {
    public static void main(String[] args) {
        //匿名内部类方法
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println("我是匿名内部类的fly方法！" + s);
            }
        });

        //Lamdba方法
        useFlyable((String s) -> {
            System.out.println("我是Lamdba的fly方法！" + s);
        });

    }

    //方法，参数列表为接口的实现类对象
    public static void useFlyable(Flyable flyable) {
        //实现类对象调用接口中的fly方法
        flyable.fly("s参数");
    }
}

//创建接口
interface Flyable {
    //定义抽象方法
    public abstract void fly(String s);
}