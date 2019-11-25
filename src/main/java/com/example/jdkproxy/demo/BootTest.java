package com.example.jdkproxy.demo;

/**
 * @author liutianqi
 * @date 2019/11/24
 */
public class BootTest {
    public static void main(String[] args) {

        // 动态代理实现
        JDKDynamicProxy reflectionHandler = new JDKDynamicProxy(new PrintCImpl());
        PrintC proxy = reflectionHandler.getProxy();
        proxy.doSomething();
    }
}
