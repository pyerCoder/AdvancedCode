package com.itheima.test6;

public class TestInterface {
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        // 如果直接父类，接口中出现类相同的方法声明，
        // 但是代码逻辑不一样，那么优先使用直接父类
        // 的代码逻辑...
        ii.show();

    }
}

class InterImpl extends Fu implements Inter{

}
