/**
 * @Title:ExceptionThrow.java
 * @Package:com.atguigu.throwstest
 * @Description:TODO(一句话描述该文件做了什么)
 * @author:30988
 * @time:2021年5月24日下午7:16:26
 */
package com.atguigu.throwstest;

import com.atguigu.myexception.MyException;

public class ExceptionThrow {


    public static void main(String[] args) {
        try {
            Students s = new Students();
            s.regist(-1002);
            System.out.println(s);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
    }


}


class Students {


    private int id;

    public void regist(int id) {

        if (id > 0) {
            this.id = id;
        } else {
//			System.out.println("你输入的数据非法");
            //手动抛出异常对象
            throw new RuntimeException("你输入的数据非法");
//		throw new MyException("你输入的数据非法");
        }
    }

    @Override
    public String toString() {
        return "Students [id=" + id + "]";
    }


}

