package com.mobai.designpattern.单例;

public class Singleton {

    // 一个单例类只有一个实例
    private static Singleton_instance singleton_instance;

    // 私有构造函数，需要该类自行实现构建
    private Singleton(){}

    // 提供一个全局的静态方法 全局都能访问
    public static Singleton_instance getInstance(){
        if (singleton_instance == null){
            singleton_instance = new Singleton_instance();
        }
        return singleton_instance;
    }

}

class Singleton_instance{
}
