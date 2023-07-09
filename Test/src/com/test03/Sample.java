package com.test03;

/**
 * @BelongsProject: workspace
 * @BelongsPackage: com.test03
 * @Author: hqb
 * @CreateTime: 2022/11/1 15:37
 * @Description: TODO
 * @Version: 1.0
 */
public class Sample {
    public static void main(String[] args) {
        Base base= new Child();
        base.methodB();
    }

}

class Base {
    public void method(){
        System.out.print ("Base method");

    }
    public void methodB(){
        System.out.print ("Child methodB");
    }
}
class Child extends Base{
    public void methodB(){
        System.out.print ("Child methodB");
    }
}

