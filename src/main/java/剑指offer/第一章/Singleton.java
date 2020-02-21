package 剑指offer.第一章;

//懒汉式,只有调用时才会去加载
public class Singleton {

    private static Singleton instance = null;

    private Singleton(){}

    //适用于单线程
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //适用于多线程,加同步锁。效率低
    public static synchronized Singleton getInstance2(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //双重检查加锁
    public static Singleton getInstance3(){
        //先判断对象存在与否,如果不存在则枷锁
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

