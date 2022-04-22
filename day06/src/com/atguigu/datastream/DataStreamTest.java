package com.atguigu.datastream;

import org.junit.Test;

import java.io.*;

/**
 *@ClassName DataStreamTest
 *@Description  TODO
 *@Author hqb
 *@Date 2021/11/23 15:56
 *@Version 1.0
 */
public class DataStreamTest{

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        BufferedOutputStream buffer = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(buffer);
        byte b=3;
        int i=78;
        char ch='a';
        float f=4.5f;
        dos.writeByte(b);
        dos.writeInt(i);
        dos.writeChar(ch);
        dos.writeFloat(f);
        dos.close();

        FileInputStream fis = new FileInputStream("test.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);

        DataInputStream dis = new DataInputStream(bis);
        System.out.println(dis.readByte());
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readFloat());

        dis.close();
    }

    @Test
    public void test01() throws Exception {
        FileOutputStream fos = new FileOutputStream("test.txt");
        BufferedOutputStream buffer = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(buffer);
        byte b=3;
        int i=78;
        char ch='a';
        float f=4.5f;
        dos.writeByte(b);
        dos.writeInt(i);
        dos.writeChar(ch);
        dos.writeFloat(f);
        dos.close();

        FileInputStream fis = new FileInputStream("test.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);

        DataInputStream dis = new DataInputStream(bis);
        System.out.println(dis.readByte());
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readFloat());

        dis.close();
    }
}
