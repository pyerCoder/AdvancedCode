package com.itheima.test7;

import com.itheima.test6.Inter;

public interface InterC extends InterA,InterB {
    @Override
    default void method() {
        System.out.println("InterC接口，解决代码逻辑冲突问题，重写method方法");
    }
}
