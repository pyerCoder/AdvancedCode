package com.itheima.myniodemo1;

import java.nio.ByteBuffer;

public class CreateByteBufferDemo1 {
    public static void main(String[] args) {
        // method1();

        // method2();

        // method3();
    }

    private static void method3() {
        ByteBuffer byteBuffer3 = ByteBuffer.wrap("aaa".getBytes());
        for (int i = 0; i < 3; i++) {
            System.out.println(byteBuffer3.get());

        }
    }

    private static void method2() {
        byte [] bytes = {97,98,99};
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(bytes);
        // 缓冲区的长度3
        // 缓冲区里面的内容就是字节数组里面的内容
        for (int i = 0; i < 3; i++) {
            System.out.println(byteBuffer2.get());
        }
//            System.out.println(byteBuffer2.get());
    }

    private static void method1() {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(5);
        // get
        for (int i = 0; i < 5; i++) {
            byte b = byteBuffer1.get();
            System.out.println(b);

        }
//        System.out.println(byteBuffer1.get());
    }
}
