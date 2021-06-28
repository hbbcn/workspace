package com.atguigu.io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *@ClassName PicTest
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/25 16:04
 *@Version 1.0
 */
public class PicTest{

    //图片的加密
    @Test
    public void test1(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("斗罗大陆.jpg");
            fos = new FileOutputStream("斗罗大陆2.jpg");

            byte[] buffer = new byte[20];
            int len;
            while((len = fis.read(buffer)) != 1){
                //字节数组进行修改
                //错误的
    //            for (byte b : buffer
    //                 ) {
    //                b = (byte)(b ^ 5);
    //            }
                //正确的
                for(int i = 0; i < len; i++){
                    buffer[i] = (byte)(buffer[i] ^ 5);
                }
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos != null){
                    fos.close();
                }
               if(fis != null){
                   fis.close();
               }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

  //图片解密
    @Test
    public void test2() {

            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream("斗罗大陆.jpg");
                fos = new FileOutputStream("斗罗大陆3.jpg");

                byte[] buffer = new byte[20];
                int len;
                while ((len = fis.read(buffer)) != 1) {
                    //字节数组进行修改
                    //错误的
                    //            for (byte b : buffer
                    //                 ) {
                    //                b = (byte)(b ^ 5);
                    //            }
                    //正确的
                    for (int i = 0; i < len; i++) {
                        buffer[i] = (byte) (buffer[i] ^ 5);
                    }
                    fos.write(buffer, 0, len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fos != null) {
                        fos.close();
                    }
                    if (fis != null) {
                        fis.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



