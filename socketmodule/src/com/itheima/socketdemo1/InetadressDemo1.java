package com.itheima.socketdemo1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetadressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("Proinsiass-MacBook-Pro.local");
        InetAddress address = InetAddress.getByName("test");
        String hostName = address.getHostName();
        System.out.println(hostName);

        String ip = address.getHostAddress();
        System.out.println(ip);
    }
}
