package com.Lambda表达式的标准格式;
/*Lambda表达式的使用前提
有一个接口
接口中有且仅有一个抽象方法

(形式参数) -> {代码块}
形式参数：如果有多个参数，参数之间用逗号隔开；如果没有参数，留空即可
->：由英文中画线和大于符号组成，固定写法。代表指向动作
代码块：是我们具体要做的事情，也就是以前我们写的方法体内容*/
public class test2{
    public static void main(String[] args) {

        //匿名内部类方法
        useEatable(new test2Inter() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类的show方法！");
            }
        });

        //Lambda方法
        useEatable(()-> System.out.println("我是Lamdba的show方法"));

    }

    public static void useEatable(test2Inter t2){
        t2.show();
    }
}
