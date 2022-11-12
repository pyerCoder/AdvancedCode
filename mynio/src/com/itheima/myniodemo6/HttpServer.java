package com.itheima.myniodemo6;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

public class HttpServer {
    public static void main(String[] args) throws IOException {
        // 1、打开服务端通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 2、让这个通道绑定一个端口
        serverSocketChannel.bind(new InetSocketAddress(10000));
        // 3、设置通道为非阻塞
        serverSocketChannel.configureBlocking(false);
        // 4、打开一个选择器
        Selector selector = Selector.open();

        // 5、绑定选择器和服务端通道
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            // 选择器会监视客户端通道的状态
            // 6、返回值就表示此时有多少个客户端来连接
            int count = selector.select();
            if (count != 0) {
                // 7、会遍历所有的服务端通道，看谁准备好了，谁准备好了，就让谁去连接。
                // 获取所有服务端通道的令牌，并将它们都放到一个集合中，将集合返回
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = selectionKeys.iterator();
                while (iterator.hasNext()) {
                    // selectionKey 依次表示每一个服务端通道的令牌
                    SelectionKey selectionKey = iterator.next();
                    if (selectionKey.isAcceptable()) {
                        // 获取连接
                        AcceptHandler acceptHandler = new AcceptHandler();
                        acceptHandler.connSocketChannel(selectionKey);

                    } else if (selectionKey.isReadable()) {
                        // 读取数据
                        HttpRequest httpRequest = new HttpRequest();
                        httpRequest.parse(selectionKey);
                        System.out.println("http请求的数据为：" + httpRequest);

                        // 响应数据
                        HttpResponse httpResponse = new HttpResponse();
                        httpResponse.setHttpRequest(httpRequest);
                        httpResponse.sendStaticResource(selectionKey);

                    }
                // 任务处理完毕以后，将SelectionKey从集合中移除
                iterator.remove();
            }
        }
    }


}
}
