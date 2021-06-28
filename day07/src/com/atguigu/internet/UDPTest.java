package com.atguigu.internet;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 *@ClassName UDPTest
 *@Description  TODO
 * UDP协议的网络编程
 *@Author HuangQingbin
 *@Date 2021/6/27 13:12
 *@Version 1.0
 */
public class UDPTest{

   @Test
    public void sender() throws IOException {

       DatagramSocket socket = new DatagramSocket();

       String str = "我是UDP方式发送的导弹";
       byte[] data = str.getBytes();
       InetAddress inet = InetAddress.getLocalHost();
       DatagramPacket packet = new DatagramPacket(data,0,data.length,inet,9090);

       socket.send(packet);
       socket.close();
}

   //接收端
   @Test
   public void receiver() throws IOException {
      DatagramSocket socket = new DatagramSocket(9090);

      byte[] bytes = new byte[10];

      System.out.println("_______________");
      DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length);

      socket.receive(packet);
      System.out.println(new String(packet.getData(),0,packet.getLength()));
   }
}

