package com.hbb.factory.method_test01;

import java.net.SocketTimeoutException;

/**
 *@ClassName Huawei
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/31 15:06
 *@Version 1.0
 */
public class Huawei implements Car{

    @Override
    public void name() {
        System.out.println("得到华为手机");
    }
}

