package com.itheima.demo;

import java.math.BigDecimal;

public class MyBigDecimalDemo4 {
    public static void main(String[] args) {
        // public BigDecimal divide (另一个BigDecimal对象，精确几位，舍入模式) 除法

        BigDecimal bd1 = new BigDecimal("10.0");
        BigDecimal bd2 = new BigDecimal("3.0");

        /* BigDecimal devide = bd1.divide(bd2);
            System.out.println(divide);*/

        // 参数一：表示参数运算的另一个对象
        // 参数二：表示小数点后精确到多少位
        // 参数三：舍入模式
                    // 进一法 BigDecimal.ROUND_UP
                    // 去尾法 BigDecimal.ROUND_FLOOR
                    // 四舍五入 BigDecimal.ROUND_HALF_UP
        BigDecimal divide = bd1.divide(bd2,2,BigDecimal.ROUND_UP);
        System.out.println(divide);
        System.out.println();

    }
}
