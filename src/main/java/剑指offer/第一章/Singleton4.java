package 剑指offer.第一章;

/**
 * 静态内部类
 * 兼顾了懒汉式对内存的优化以及饿汉式的安全性(防止反射侵入)
 * 内部类不会在一个类加载时同时加载,也无法通过反射从外部类获取内部类的属性
 * 缺点：需要两个类去实现,虽然不会创建静态内部类对象，但是内部类对象会被创建，并且是在永久代
 * */
public class Singleton4 {

    private Singleton4(){}

    public static Singleton4 getInstance(){
        return InnerStaticClass.instance;
    }

    private static class InnerStaticClass{
        private static final Singleton4 instance = new Singleton4();
    }

}
