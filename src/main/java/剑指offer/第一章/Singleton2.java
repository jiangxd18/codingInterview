package 剑指offer.第一章;


//饿汉式,在类初始化时进行实例化
public class Singleton2 {
    private static final Singleton2 instance = new Singleton2();

    private Singleton2(){}

    public static Singleton2 getInstance(){
        return instance;
    }
}
