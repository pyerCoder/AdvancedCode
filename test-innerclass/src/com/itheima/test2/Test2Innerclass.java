package com.itheima.test2;

public class Test2Innerclass {
    /*
        私有的成员内部类
     */
    public static void main(String[] args) {
//        Outer.Inner oi = new Outer().new Inner();
        Outer o = new Outer();
        o.method();
    }

}

class Outer {
    private class Inner {
        public void show() {
            System.out.println("inner..show");
        }
    }
    public void  method(){
        Inner i = new Inner();
        i.show();
    }
}