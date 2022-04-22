package com.hbb.factory.abstract1.xiaomi;

import com.hbb.factory.abstract1.*;

/**
 *@ClassName HuaWeiFactory
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/22 20:14
 *@Version 1.0
 */
public class HuaWeiFactory implements IProductFactory {

    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new HuaWeiRouter();
    }
}

