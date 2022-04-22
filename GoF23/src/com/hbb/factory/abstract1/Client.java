package com.hbb.factory.abstract1;

import com.hbb.factory.abstract1.huawei.XiaoMiFactory;
import com.hbb.factory.abstract1.xiaomi.HuaWeiFactory;

/**
 *@ClassName Client
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/22 20:15
 *@Version 1.0
 */
public class Client{
    public static void main(String[] args) {
        System.out.println("========小米系列产品========");
        //小米工厂
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        IphoneProduct iphoneProduct = xiaoMiFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendMS();

        IRouterProduct iRouterProduct = xiaoMiFactory.routerProduct();
        iRouterProduct.openWife();


        System.out.println("========华为系列产品========");
        //小米工厂
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        IphoneProduct huaWeiProduct = huaWeiFactory.iphoneProduct();
        huaWeiProduct.callup();
        huaWeiProduct.sendMS();

        IRouterProduct huaWeiRouterProduct = huaWeiFactory.routerProduct();
        huaWeiRouterProduct.openWife();

    }


}

