package com.atguigu.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @BelongsProject: workspace
 * @BelongsPackage: com.atguigu.io
 * @Author: hqb
 * @CreateTime: 2022/11/1 16:25
 * @Description: TODO
 * @Version: 1.0
 */
public class TestIO {
    public static void main(String []args){
        String str ="文件写入练习";
        FileWriter fw = null; //1
        try{
            fw = new FileWriter("c:\\mytext.txt"); //2

        }catch(IOException e){ //4
            e.printStackTrace();
        }finally{
//此处省略关闭流
        }
    }
}

