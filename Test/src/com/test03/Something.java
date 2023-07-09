package com.test03;

/**
 * @BelongsProject: workspace
 * @BelongsPackage: com.test03
 * @Author: hqb
 * @CreateTime: 2022/11/1 15:26
 * @Description: TODO
 * @Version: 1.0
 */
public class Something {
    public static void main(String[] args){
        final Other o=new Other();
        new Something().addOne(o);//1
    }
    public void addOne( Other o){
        o.i++;//2
        o = new Other();//3
    }
}
class Other{
    public int i;
}

