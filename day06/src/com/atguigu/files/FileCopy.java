package com.atguigu.files;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *@ClassName FileCopy
 *@Description  TODO
 *@Author hqb
 *@Date 2021/9/25 14:46
 *@Version 1.0
 */
public class FileCopy{

    public static void copyFileNew(){
        Path path = Paths.get("D:\\IDEA_javacode\\workspace\\day06\\src\\hello.txt");
        try {

            Files.copy(path,new FileOutputStream(new File("D://b.txt")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        copyFileNew();
    }

}

