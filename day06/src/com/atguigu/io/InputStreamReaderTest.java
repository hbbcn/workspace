package com.atguigu.io;

import org.junit.Test;

import java.io.*;

/**
 *@ClassName InputStreamReaderTest
 *@Description
 * 处理流之二：转换流的使用
 * 1.转换流;属于字符流
 * InputStreamReader: 将一个字节的输入流转换为字符的的输入流
 * OutputStreamWriter: 将一个字符的输出流转换为字节的输出流
 *
 * 2.作用：提供字节路与字符类之间的转换
 *
 * 3.解码： 字节、字节数组 ----->字符数组、字符串
 *   编码： 字符数组、字符串----->字节、字节数组
 *
 * 4.字符集
 * ASCII: 美国标准信息交换码
 *      用一个字节的七位可以表示
 * GBK： 中国的中文编码表升级，融合了更多的中文文字符号。最多两个字节编码
 * Unicode: 国际标准码，融合了目前人类使用的所有字符。为每个字符分配唯一的字符码。所有的文字都有两个字节来表示。
 * UTF-8：变长的编码方式，可用1-4个字节来表示一个字符。
 *@Author HuangQingbin
 *@Date 2021/6/25 17:39
 *@Version 1.0
 */
public class InputStreamReaderTest{

    @Test
    public void test1() throws IOException {

        FileInputStream fis = new FileInputStream("hello.txt");
        //InputStreamReader isr = new InputStreamReader(fis);//使用系统默认的字符集
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");
        char[] cbuf = new char[5];
        int len;
        while((len = isr.read(cbuf)) != -1 ){
            String str = new String(cbuf, 0, len);
//            System.out.print(cbuf); 输出结果不对
            System.out.print(str);
        }
        isr.close();
    }
   /*
   综合使用InputStreamReader和OutputStreamWriter
    */
    @Test
    public void test2() throws IOException {
        File file = new File("hello.txt");
        File file1 = new File("hello_gbk.txt");

        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file1);

        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
        //2.读写过程
        char[] cbuf = new char[5];
        int len;
        while ((len = isr.read(cbuf)) != -1){
            osw.write(cbuf,0,len);

        }

        //3.关闭资源
        isr.close();
        osw.close();

    }
}

