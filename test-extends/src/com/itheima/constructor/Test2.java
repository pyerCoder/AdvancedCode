package com.itheima.constructor;

public class Test2 {
    public static void main(String[] args) {
        Zi z = new Zi();
    }
}

class Fu {
    int age;

    // 空参数构造方法
 /*   public Fu(){
        System.out.println("父类空参构造方法");
    }*/

    // 带参构造方法
    public Fu(int age){
        this.age=age;
    }
}

class Zi extends Fu {
    public Zi(){
//        this() && super() 都要求占用第一行，二者只能存一
//        super(); // 是否还会存在呢？如果this()存在了？
        this(10);
    }

    public Zi(int age){
//        super(); // 默认系统自动带上
        super(age); // 父类没有空参构造方法，子类可以使用有参构造方法调用父类有参构造方法即可

    }
}
