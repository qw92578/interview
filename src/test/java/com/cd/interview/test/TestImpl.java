package com.cd.interview.test;

/**
 * @Package: com.cd.interview
 * @ClassName: test
 * @Author: fgq
 * @Description: 加载过程
 * 1. 父类的静态变量
 * 2 父类的静态代码块
 * 3 子类的静态变量
 * 4 子类的静态代码块
 * 5 父类的非静态变量
 * 6 父类的非静态代码块
 * 7 父类的构造方法
 * 8 子类的非静态变量
 * 9 子类的非静态代码块
 * 10 子类的构造方法
 * @Date: 2019/10/9 9:29
 */
public class TestImpl extends FatrherClass {
    @Override
    public void fatherMethod() {
        System.out.println("子类重写父类的方法");
    }

    static {
        System.out.println("子静态代码块");
    }

    {
        System.out.println("子代码块");
    }

    public TestImpl() {
        super.fatherMethod();
        System.out.println("子类的无参构造");
    }

    public static final String S = "静态变量";


    public static void staMethod() {
        System.err.println("静态方法");
    }


    /**
     * 如果在一个类中定义了多个同名的方法，它们或有不同的参数个数或有不同的参数类型，
     * 则称为方法的重载(Overloading)。Overloaded的方法是可以改变返回值的类型。
     *
     * @param a
     * @return
     */
    public String TestImpl(String a) {
        System.err.println("重载");
        return null;
    }

    public static void main(String[] args) {
        TestImpl son = new TestImpl();
//        FatrherClass fatrherClass = new FatrherClass();
            son.fatherMethod();
    }

    /**
     * 重写Overriding是父类与子类之间多态性的一种表现
     *
     * @param s
     */
//    @Override
//    public void fatherMethod(String s) {
//        System.err.println("父类的方法");
//    }
}
