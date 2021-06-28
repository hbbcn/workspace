package com.atguigu.io;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *@ClassName FileInputOutputStreamTest
 *@Description
 * 测试FileInputStream和FileOutputStream
 *
 * 结论：
 * 1.对于文本文件（.txt,.java,.c,.cpp) 使用字符流处理
 * 2.对于非文本文件(.jpg,.mp4,.doc,.ppt)，使用字节流处理
 *@Author HuangQingbin
 *@Date 2021/6/25 13:31
 *@Version 1.0
 */
public class FileInputOutputStreamTest{

    @Test
    public void testFileInputStream() {
        FileInputStream fis = null;
        try {
            //1.造文件
            File file = new File("hello.txt");
            //造流
            fis = new FileInputStream(file);
            //3.读数据
            byte[] buffer = new byte[1];
            int len;//记录每次读取的字节个数
            while((len = fis.read(buffer)) != -1){
                String str = new String(buffer,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}

