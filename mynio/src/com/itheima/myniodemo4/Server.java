package com.itheima.myniodemo4;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

        serverSocketChannel.bind(new InetSocketAddress(10000));
        serverSocketChannel.configureBlocking(false);

        while (true) {
            SocketChannel socketChannel = serverSocketChannel.accept();
            if (socketChannel != null) {
                System.out.println("此时有客户端来连接了！");
                socketChannel.configureBlocking(false);

                // 获取客户端传递过来的数据，并把数据放在byteBuffer1这个缓冲区中
                ByteBuffer byteBuffer1 = ByteBuffer.allocate(1024);
//                socketChannel.read(byteBuffer1);
                int len;
                // 针对于缓冲区来讲
                    // 如果 从添加数据 ---> 获取数据 flip
                    // 如果 从获取数据 ---> 添加数据 clear
                // while ((len = socketChannel.read(byteBuffer1)) != -1) {
                while ((len = socketChannel.read(byteBuffer1)) > 0) {
//                    System.out.println(len);
                    System.out.println("服务端接收发送数据");
                    byteBuffer1.flip();
                    System.out.println(new String(byteBuffer1.array(), 0, len));
                    byteBuffer1.clear();
                }

                System.out.println("接收数据完毕，准备开始往客户端回写数据");
                ByteBuffer byteBuffer2 = ByteBuffer.wrap("哎呀，真疼啊！".getBytes());
                socketChannel.write(byteBuffer2);

                socketChannel.close();
            }
        }
    }
}
