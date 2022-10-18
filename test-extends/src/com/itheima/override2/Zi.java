package com.itheima.override2;

public class Zi extends Fu {
    @Override // 注解：检查当前方法是否是一个正确的重写方法
    public void show() {
//        super.show(); // ide默认生成，可自行按需决定是否保留
    }

    @Override
    public void method() {
        super.method();
    }
}
