package com.cd.interview.test;

/**
 * @Package: com.cd.interview.test
 * @ClassName: AbstractClass
 * @Author: fgq
 * @Description: 测试创建抽象类
 * @Date: 2019/10/9 9:41
 */
public abstract class AbstractClass {

    /**
     * 而抽象类则可以同时包含抽象和非抽象的方法。
     */


    public AbstractClass() {
        System.err.println("构造方法");
    }

    /**
     * 抽象方法
     */
    abstract void test();

    /**
     * 非抽象方法
     */
    public static void test2(){
        System.err.println("sdad");
    }
}
