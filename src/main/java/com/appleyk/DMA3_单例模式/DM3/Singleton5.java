package com.appleyk.DMA3_单例模式.DM3;

/**
 * 类加载时就创建实例
 * 
 */
public class Singleton5 {

    private static final Singleton5 instance = new Singleton5();
    
    // 私有构造器，防止外部new实例
    private Singleton5(){}



    public static Singleton5 getInstance(){
        return instance;
    }

    public void show(){
        System.out.println("你好，我是单例模式五！");
    }


}
