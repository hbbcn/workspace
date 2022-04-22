package com.hbb.factory.abstract1.huawei;

import com.hbb.factory.abstract1.*;

/**
 *@ClassName XiaoMiFactory
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/22 20:12
 *@Version 1.0
 */
public class XiaoMiFactory implements IProductFactory {


    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new XiaoMiRouter();
    }
}

