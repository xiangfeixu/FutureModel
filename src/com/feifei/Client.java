package com.feifei;

import com.feifei.data.Data;
import com.feifei.data.FutureData;
import com.feifei.data.RealData;

/**
 * 客户端
 * 获取FutureData，开启构造RealData的线程，并很快返回futureData
 * @author xuxiangfei
 * @date 2019/3/13
 */
public class Client {
    public Data request (final String queryStr) {
        final FutureData futureData = new FutureData();
        new Thread() {
            @Override
            public void run() {
                RealData realData = new RealData(queryStr);
                futureData.setResult(realData);
            }
        }.start();
        return futureData;
    }
}
