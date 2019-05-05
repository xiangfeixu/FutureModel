package com.feifei;


import com.feifei.data.Data;

/**
 * 系统入口启动类
 */
public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        Data data = client.request("name");
        System.out.println(System.currentTimeMillis()+":请求完毕！！！");
        try {
            Thread.sleep(2000);
            System.out.println("正在进行其他业务逻辑");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(":要获取的真实数据="+ data.getResult()+System.currentTimeMillis());

        System.out.println("第一次提交代码");
    }
}
