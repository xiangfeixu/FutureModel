package com.feifei.data;

/**
 * @author xuxiangfei
 * @date 2019/3/13
 */
public class FutureData implements Data {
    protected RealData realData = null;
    protected boolean isReady = false;

    @Override
    public synchronized String getResult() {
        while (!isReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return realData.result;
    }

    public synchronized void setResult(RealData realData) {
        if (isReady) {
            return;
        }
        this.realData = realData;
        isReady = true;
        notifyAll();

    }
}
