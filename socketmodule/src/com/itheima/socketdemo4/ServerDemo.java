package com.itheima.socketdemo4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket(10000);

        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);

        // 把当前计算机绑定一个组播地址，表示添加到这一组中
        ms.joinGroup(InetAddress.getByName("224.0.1.0")); // 绑定失败如何解决，当虚拟机是JDK1.8时
        
        ms.receive(dp);

        byte[] data = dp.getData();
        int length = dp.getLength();
        System.out.println(new String(data,0,length));
        ms.close();
    }
}
