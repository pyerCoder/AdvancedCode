package com.itheima.test2;

public class Test2Polymorphic {
    /*
            多态的成员访问特点：

                    成员变量：编译看左边，运行看左边

                    成员方法：编译看左边，运行看右边
     */
    public static void main(String[] args) {

        Fu f = new Zi();
        System.out.println(f.num);
        f.method();
        Zi zi = new Zi();
        System.out.println(zi.num);
        zi.method();

    }
}

class Fu {
    int num = 10;

    public void method(){
        System.out.println("Fu...method");
    }
}


class Zi extends Fu {
    int num = 20;

    @Override
    public void method() {
        System.out.println("Zi...method");
    }
}