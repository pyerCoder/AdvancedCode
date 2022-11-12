package com.itheima.myniodemo1;

import java.nio.ByteBuffer;

public class ByteBufferDemo2 {
    public static void main(String[] args) {
        // int position() 当前要操作的索引
        // int limit() 最多能操作到哪个索引
        // int capacity() 缓冲区的总长度

        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.capacity());
        System.out.println(byteBuffer.limit());
        System.out.println("++++++++++++++++++++++");
        // put(byte b) 一次添加一个字节
//        byteBuffer.put((byte) 97);
//        System.out.println(byteBuffer.position());
//        System.out.println(byteBuffer.capacity());
//        System.out.println(byteBuffer.limit());
//        System.out.println("++++++++++++++++++++++");


        // put(byte[] src) 一次添加一个字节数组
//        byteBuffer.put("aaa".getBytes());
//        System.out.println(byteBuffer.position());
//        System.out.println(byteBuffer.capacity());
//        System.out.println(byteBuffer.limit());
//        System.out.println("++++++++++++++++++++++");

        // position(int newPosition) 修改position
//        byteBuffer.position(1);
        // limit(int newLimit) 修改limit
//        byteBuffer.limit(5);

//        System.out.println(byteBuffer.position());
//        System.out.println(byteBuffer.capacity());
//        System.out.println(byteBuffer.limit());

//        System.out.println("++++++++++++++++++++++");

        byteBuffer.put("0123456789".getBytes());
        // int remaining() 还有多少能操作
        System.out.println(byteBuffer.remaining());
        // boolean hasRemaining() 是否还有能操作的
        System.out.println(byteBuffer.hasRemaining());


    }
}
