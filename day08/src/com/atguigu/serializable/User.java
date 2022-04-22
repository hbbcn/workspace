package com.atguigu.serializable;

import java.io.Serializable;

/**
 *@ClassName User
 *@Description  TODO
 *@Author hqb
 *@Date 2021/10/24 19:27
 *@Version 1.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = 543795793875L;
    private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

