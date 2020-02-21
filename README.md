# 剑指offer
该部分记录剑指offer用例
## 第一章
### 1. 单例模式
|  模式   | 特点 | 源码 |
|  ----  | ----  | ---- | 
| 懒汉式  | 内存友好 | [懒汉式](https://github.com/jiangxd18/codingInterview/blob/master/src/main/java/%E5%89%91%E6%8C%87offer/%E7%AC%AC%E4%B8%80%E7%AB%A0/Singleton.java) |
| 饿汉式  | 线程安全 | [饿汉式](https://github.com/jiangxd18/codingInterview/blob/master/src/main/java/%E5%89%91%E6%8C%87offer/%E7%AC%AC%E4%B8%80%E7%AB%A0/Singleton2.java) |
| 枚举类方式  | 线程安全，并且无法通过反射重复创建对象 | [枚举类方式](https://github.com/jiangxd18/codingInterview/blob/master/src/main/java/%E5%89%91%E6%8C%87offer/%E7%AC%AC%E4%B8%80%E7%AB%A0/Singleton3.java) |
| 静态内部类  | 线程安全、反射无侵入、内存友好，但是需要两个类支持 | [静态内部类](https://github.com/jiangxd18/codingInterview/blob/master/src/main/java/%E5%89%91%E6%8C%87offer/%E7%AC%AC%E4%B8%80%E7%AB%A0/Singleton4.java) |
