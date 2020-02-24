# 剑指offer
⚔️该部分记录剑指offer用例
## 第一章
### 1. 单例模式
|  模式   | 特点 | 源码 |
|  ----  | ----  | ---- | 
| 懒汉式  | 内存友好 | [懒汉式](https://github.com/jiangxd18/codingInterview/blob/master/src/main/java/%E5%89%91%E6%8C%87offer/%E7%AC%AC%E4%B8%80%E7%AB%A0/Singleton.java) |
| 饿汉式  | 线程安全 | [饿汉式](https://github.com/jiangxd18/codingInterview/blob/master/src/main/java/%E5%89%91%E6%8C%87offer/%E7%AC%AC%E4%B8%80%E7%AB%A0/Singleton2.java) |
| 枚举类方式  | 线程安全，并且无法通过反射重复创建对象 | [枚举类方式](https://github.com/jiangxd18/codingInterview/blob/master/src/main/java/%E5%89%91%E6%8C%87offer/%E7%AC%AC%E4%B8%80%E7%AB%A0/Singleton3.java) |
| 静态内部类  | 线程安全、反射无侵入、内存友好，但是需要两个类支持 | [静态内部类](https://github.com/jiangxd18/codingInterview/blob/master/src/main/java/%E5%89%91%E6%8C%87offer/%E7%AC%AC%E4%B8%80%E7%AB%A0/Singleton4.java) |
## 第二章
### 2. 二维数组中的查找
💡 一开始比较的数字只能取左下角和右上角的数字，左下角数字只要上移（当前位置数字大于目标值）或右移（当前位置数字小于目标值）;右上角也同理。如果取其他位置的数字，相当于需要遍历整个矩阵了，效率不如取左下角和右上角数字。

|  源码   | leetCode | 牛客 |
|  ----  | ----  | ---- | 
|  [二维数组中的查找](https://github.com/jiangxd18/codingInterview/blob/master/src/main/java/%E5%89%91%E6%8C%87offer/%E7%AC%AC%E4%BA%8C%E7%AB%A0/Solution.java)   | / | [二维数组中的查找](https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking) |
