package com.atguigu.iotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName FileInOutputTest
 * @Description TODO
 * @Author hqb
 * @Date 2022/4/6 19:45
 * @Version 1.0
 */
public class FileInOutputTest {
    public static void main(String[] args) throws Exception {
//        File file = new File("day06\\src\\hello.txt");
//        File file1 = new File("day06\\src\\helloTest.txt");
//        FileOutputStream fos = new FileOutputStream(file1);
//        FileInputStream fis = new FileInputStream(file);
//        byte[] bytes = new byte[1];
//        int len = 0;
//        while ((len = (fis.read(bytes))) != -1){
//            fos.write(bytes,0,len);
//            String s = new String(bytes, 0, len);
//            System.out.print(s);

        //写出,把java程序中的数据写到文件中，没有文件会自动创建文件
//        File file1 = new File("day06\\src\\test.txt");
//        FileOutputStream fos = new FileOutputStream(file1);
//        byte[] bytes = new byte[]{'a', 'b'};
//        fos.write(bytes);
//        fos.write(33);
//        fos.close();
//        System.out.println(bytes[0]);

        //读入，把文件中的数据读到java程序中
/*        File file2 = new File("day06\\src\\test.txt");
        FileInputStream inputStream = new FileInputStream(file2);
        byte[] bytes1 =  new byte[5];

        int len = 0;
        while ((len = inputStream.read(bytes1)) != -1){
            //错误的输出方法：  ab!helloworldwo
//            System.out.print(new String(bytes1));
            System.out.print(new String(bytes1,0,len));
        }*/

        //文件文本的复制
        File file = new File("day06\\src\\hello.txt");
        String name = file.getName();
        System.out.println(name);
        File file1 = new File("D:\\excel");
        FileInputStream inputStream = new FileInputStream(file);
        FileOutputStream outputStream = new FileOutputStream(file1);

        byte[] bytes = new byte[5];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
            System.out.print(new String(bytes,0,len));
        }

        inputStream.close();
        outputStream.close();


    }


}

