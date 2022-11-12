package com.itheima.myniodemo3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;


public class Client {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("127.0.0.1",10000));

        ByteBuffer byteBuffer1 = ByteBuffer.wrap("吃俺老孙一棒".getBytes());

        socketChannel.write(byteBuffer1);
        socketChannel.shutdownOutput();
        System.out.println("数据已经写给服务器！");

        ByteBuffer byteBuffer2 = ByteBuffer.allocate(1024);
        int len;
        while ((len=socketChannel.read(byteBuffer2))!=-1){
            byteBuffer2.flip();
            System.out.println(new String(byteBuffer2.array(),0,len));
            byteBuffer2.clear();
        }
        socketChannel.close();
    }
}
