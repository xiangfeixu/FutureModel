package com.feifei.data;

/**
 * 真实数据
 * @author xuxiangfei
 * @date 2019/3/13
 */
public class RealData implements Data {
    protected final String result;

    /**
     * 有参构造，过程缓慢，表征获取数据耗时，用sleep模拟
     * @param result
     */
    public RealData(String para) {
        StringBuilder sb = new StringBuilder();
        for (int i =0;i < 10;i++) {
            sb.append(para);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        result = sb.toString();
    }

    @Override
    public String getResult() {
        return result;
    }
}
