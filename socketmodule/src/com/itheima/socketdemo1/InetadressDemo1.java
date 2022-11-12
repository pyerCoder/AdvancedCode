package com.itheima.socketdemo1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetadressDemo1 {
    // static InetAddress getByName(String host)
    //                      确定主机名称的IP地址，主机名称可以是机器名称，也可以是IP地址
    // String getHostName() 获取此IP地址的主机名。
    // String getHostAddress() 返回文本显示中的IP地址字符串。
    public static void main(String[] args) throws UnknownHostException {
        System.setProperty("java.net.preferIPv4Stack" , "true");
        InetAddress address = InetAddress.getByName("Proinsiass-MacBook-Pro.local");
//        InetAddress address = InetAddress.getByName("test");

        String hostName = address.getHostName();
        System.out.println("主机名为：" + hostName);

        String ip = address.getHostAddress();
        System.out.println("IP为：" + ip);
    }
}
