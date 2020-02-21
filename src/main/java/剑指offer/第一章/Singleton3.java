package 剑指offer.第一章;

//枚举方式,好处是能够防止反射创建多次用例
public enum Singleton3 {
    SINGLE;

    private Singleton3(){}

    public void function(){
        System.out.println("Add some functions");
    }
}
