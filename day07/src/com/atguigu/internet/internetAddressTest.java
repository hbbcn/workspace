package com.atguigu.internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *@ClassName internetAddressTest
 *@Description
 * 一、网络编程中主要的问题：
 * 1.如何准确地定位网络上一台或多台主机：定位主机的特定的应用
 * 2.找到主机后如何可高效地进行数据的传输
 *
 *
 * 二、网络编程中的两个要素：
 * 1.对应问题一： IP和端口号
 * 2.对应问题二：提供网络通信协议：TCP/IP参考模型（应用层、传输层、网络层、物理+数据链路层）
 *
 * 三、IP和端口号
 *
 * 1.IP：唯一的标识 Internet上的计算机（通信实体）
 * 2.在java中使用InetAddress类代表IP
 * 3.IP分类：IPv4 和 IPv6 ；万维网 和 局域网
 * 4.域名：  www.bai.com  www.mi.com
 * 5.本地回路地址：127.0.0.1 对应着：Localhost
 * 6.如何实例化InetAddress：两个方法:getByName(String host) getLocalHost()
 *      两个常用方法：getHostName() / getHostAddress()
 *
 * 7.端口号：正在计算机上运行的进程。
 * 要求： 不同的进程又不同的端口号
 * 范围：被规定为一个16位的整数0~65535。
 * 8.端口号与IP地址的组合得出一个网络套接字：Socket
 *@Author HuangQingbin
 *@Date 2021/6/26 19:45
 *@Version 1.0
 */
public class internetAddressTest{

    public static void main(String[] args) {

        try {
            InetAddress inet1 = InetAddress.getByName("192.168.10.14");
            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.atguigu.com");
            System.out.println(inet2);


            //获取本地IP
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);

            System.out.println(localHost.getHostName());
            System.out.println(localHost.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}

