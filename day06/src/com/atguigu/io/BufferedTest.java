package com.atguigu.io;

import org.junit.Test;

import javax.xml.transform.Source;
import java.io.*;

/**
 *@ClassName BufferedTest
 *@Description
 * 处理流之一：缓冲流的使用
 *
 * 1.缓冲流：
 * BufferedInputStream
 * BufferedOutputStream
 * BufferedReader
 * BufferedWriter
 *
 * 2.缓冲流的作用：提高流的读取和，写入的速度
 *      提高读写速度的原因：内部提供了一个缓冲区
 *
 * 3.处理流，就是“套接”在已有的流的基础上。
 *@Author HuangQingbin
 *@Date 2021/6/25 13:57
 *@Version 1.0
 */
public class BufferedTest{
/*
实现非文本文件的复制
 */
    @Test
    public void BufferStreamTest(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //1.造文件
            File srcFile = new File("斗罗大陆.jpg");
            File destFile = new File("斗罗大陆1.jpg");
            //2.造流
            //2.1 造节点流
//            FileInputStream fis = new FileInputStream(srcFile);
//            FileOutputStream fos = new FileOutputStream(destFile);
            FileInputStream fis = new FileInputStream("hello.txt");
            FileOutputStream fos = new FileOutputStream("hello3.txt");
            //2.2 造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.复制的细节：读取，读入
            byte[] buffer = new byte[10];
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {

        } finally {
            //4.资源关闭
            //要求1：先关闭外层的流，在关闭内层的流

            try {
                if(bis != null){
                    bis.close();
                }
                if (bis != null){
                    bos.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        //说明：在关闭外层流的同时，内层流也会自动关闭。对于内层流的关闭我们阿可以省略
//        fos.close();
//        fis.close();

    }

    //实现文件复制的方法
    public void copyFileWithBUffered(String srcPath,String destPath){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.造文件
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);
            //2.造流
            //2.1 造节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);
            //2.2 造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.复制的细节：读取，读入
            byte[] buffer = new byte[10];
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {

        } finally {
            //4.资源关闭
            //要求1：先关闭外层的流，在关闭内层的流

            try {
                if(bis != null){
                    bis.close();
                }
                if (bis != null){
                    bos.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }

    @Test
    public void testCopyFileWithBuffered(){

        long start = System.currentTimeMillis();

        String srcPath = "C:\\users\\Administrator\\Desktop\\01-视频.avi";
        String destPath = "C:\\users\\Administrator\\Desktop\\02-视频.avi";

        copyFileWithBUffered(srcPath,destPath);

        long end = System.currentTimeMillis();
        System.out.println("复制操作花费的时间" + (end - start));

    }
    /*
    使用BufferedReader和BufferedWiter实现文本文件的复制
     */
    @Test
    public void testBufferedReaderBufferedWriter(){
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            //创建文件和相应的流
            br = new BufferedReader(new FileReader(new File("hello.txt")));
            bw = new BufferedWriter(new FileWriter(new File("hello4.txt")));

            //读写操作
            //方式一：使用char[]数组
//            char[] cubf = new char[5];
//            int len;
//            while((len = br.read(cubf)) != -1){
//                bw.write(cubf,0,len);
//
//            }
            //方式二：使用String
            String data;
            while ((data = br.readLine()) != null){
//                bw.write(data + "\n");//data不包含换行符
                //或者
                bw.write(data);//data不包含换行符
                bw.newLine();//提供换行符
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        //关闭资源
            try {
                if(bw != null){
                    bw.close();
                }
                if(br != null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

