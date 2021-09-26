package com.atguigu.io;

import org.junit.After;
import org.junit.Test;

import java.io.*;

/**
 * @ClassName FileReaderWriterTest
 * @Description 一、流的分类
 * 1.操纵数据单位：字节流、字符流
 * 2.数据的流向：输入流、输出流
 * 3.流的角色：节点流、处理流
 * 二、流的体系结构
 * 抽象基类                 节点流                                                    缓冲流（处理流的一种）
 * InputStream              FileInputStream  (reade(byte[] buffer))                  BufferedInputStream (read(byte[] buffer))
 * OutputStream             FileOutputStream  (write(byte[] buffer,0,len)            BufferedOutputStream (write(byte[] buffer,0,len)) /flush
 * Reader                   FileReader  (read(char[] cbuf))                          BufferedReader (read(char[] cbuf) /readLine())
 * Writer                   FileWriter   (write(char[] cbuf,0,len)                   BufferWriter (write(char[] cbuf,0,len)) / flush
 * @Author HuangQingbin
 * @Date 2021/6/22 17:25
 * @Version 1.0
 */
public class FileReaderWriterTest {

    @After
    public void tearDown() throws Exception {

    }

    /*
    将当前下的hello.txt文件内容读入程序中，并输出到控制台

    说明点：
    1.read()的理解：返回读入的一个字符。如果达到文件结尾，返回-1
    2.异常的处理：为了保证流资源一定可以执行关闭操作。需要使用try-catch-finally进行处理
    3.读入的文件一定要存在，否则就会报FileNotFoundException。
    */
    @Test
    public void testFileReader() {

        //1.实例化File类的对象，指明要操作的文件
        FileReader fr = null;
        try {
            File file = new File("hello.txt");
            //2.提供具体的流
            fr = new FileReader(file);
            //数据的读
            // read(): 返回读入的一个字符，如果达到文件末尾，返回-1
//            int read = fr.read();
//            while (read != -1){
//            System.out.print((char)read);
//
//        }
            //优化
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭操作
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test() throws Exception {
        File file = new File("src\\hello.txt");

        FileInputStream fs  = new FileInputStream(file);

        byte[] buffer = new byte[5];
        int len;
        while((len = fs.read()) != -1){
            System.out.println((char)len);

        }


    }



    //对read()操纵升级：使用read的重载方法
    @Test
    public void testFileReader1() {
        //1.File类的实例化
        File file = new File("hello.txt");
        FileReader fr = null;

        try {
            //2.FileReader流的实例化
            fr = new FileReader(file);
            //3. 读入的操作
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {

                //错误写法
//                            for (int i = 0; i < cbuf.length; i++) {
//                                System.out.print(cbuf[i]);
//                            }
                //正确写法
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuf[i]);
                }
//
                //方式二
                //错误写法：对应这方式一的错误写法
//               String str = new String(cbuf);
//               System.out.print(str);

                //正确的写法
//               String str = new String(cbuf,0,len);
//               System.out.print(str);
            }
        } catch (IOException e) {


        } finally {
            //4.资源的关闭
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {

            }

        }
    }

    //从内存中写出数据到硬盘文件中
    /*
    说明：输出操作，对应的File可以不存在.
            File如果不存在，再输出的过程中，会自动创建文件
            如果存在,
                如果流使用的构造器是：FileWriter(file,false) / FileWriter(file)对原有文件进行覆盖
                如果流使用的构造器是：FileWriter(file,ture): 不会对原有的文件进行覆盖，而是在原有文件基础上追加内容
     */
    @Test
    public void testFileWriter() throws IOException {
        File file = new File("hello1.txt");
        FileWriter fw = new FileWriter(file, false);

        fw.write("I watch T V \n");
        fw.write("You need to  have a dream");
        fw.close();
    }

    @Test
    public void testFileReaderWriter() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File类的对象，指明读入和写出的文件
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");
            //2.创建输入流和输出流的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //3.数据的读入和写出操作
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源.
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Test
    public void test0() throws FileNotFoundException {
        File file = new File("hello.txt");

        FileOutputStream fs = new FileOutputStream(file);

    }

}

