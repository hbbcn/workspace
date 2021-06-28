package com.atguigu.internet;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


/**
 *@ClassName TCPTest3
 *@Description  TODO
 *
 * 实现TCP的网络编程
 * 例题2：从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。
 * 并关闭相应的连接。
 *@Author HuangQingbin
 *@Date 2021/6/27 9:49
 *@Version 1.0
 */
public class TCPTest3{

    /*
        这里涉及到的异常，应该使用try-catch-finally
     */
    @Test
    public void client()  {
        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        ByteArrayOutputStream baos = null;

        try {
            //1.
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet,8081);

            //2.
            os = socket.getOutputStream();
            //3.
            fis = new FileInputStream(new File("斗罗大陆.jpg"));
            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1){
                os.write(buffer,0,len);

            }
            socket.shutdownOutput();

            //5.接受来自服务器段的数据，并显示到控制台上
            InputStream is = socket.getInputStream();
            baos = new ByteArrayOutputStream();

            byte[] bf = new byte[5];
            int len1;
            while ((len1 = is.read(bf)) != -1){
                baos.write(bf,0,len1);
            }
            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null){
                    fis.close();
                }
                if(os != null){
                    os.close();
                }
               if(socket != null){
                   socket.close();
               }
               if (baos != null){
                   baos.close();
               }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }




    }

    @Test
    public void server() throws IOException {
        //1.
        ServerSocket ss = new ServerSocket(8081);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        FileOutputStream fis = new FileOutputStream("斗罗大陆3.jpg");
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1){
                fis.write(buffer,0,len);
        }
        //6.服务器段给予客户端反馈
        OutputStream os = socket.getOutputStream();
        os.write("你好，美女，照片我已经收到".getBytes());
        //7.
        fis.close();
        is.close();
        ss.close();
        socket.close();
        os.close();
    }
}

