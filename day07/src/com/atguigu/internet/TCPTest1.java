package com.atguigu.internet;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *@ClassName TCPTest1
 *@Description
 * 例1：客户端发送信息给服务端
 *
 *@Author HuangQingbin
 *@Date 2021/6/26 21:09
 *@Version 1.0
 */
public class TCPTest1{

    //客户端
    @Test
    public void client()  {
        Socket scoket = null;
        OutputStream os = null;
        try {
            //1.创建Socket对象，指明服务器段的ip和端口号
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            scoket = new Socket(inet,8899);
            //2.获取一个输出流，用于输出数据
            os = scoket.getOutputStream();
            //3.写数据操作
            os.write("你好，我是客户端mm".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //资源关闭
            if(os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
           if(scoket != null){
               try {
                   scoket.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }

        }
    }

    //服务端
    @Test
    public void server() throws IOException {

        //1.创建服务段的ServerScoket,指明自己的端口号
        ServerSocket ss = new ServerSocket(8899);
        //2.调用accept();表示接受客户端的socket
        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();
        //不建议这样写，可能会乱码
//        byte[] buffer = new byte[20];
//        int len;
//        while((len = is.read(buffer)) != -1){
//            String str = new String(buffer,0,len);
//            System.out.println(str);
//        }
        //4.读取输入流中的数据
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[5];
        int len;
        while((len = is.read(buffer)) != -1){
            baos.write(buffer,0,len);
        }
        System.out.println(baos.toString());

        //关闭资源

        baos.close();
        is.close();
        socket.close();
        ss.close();
    }
}

