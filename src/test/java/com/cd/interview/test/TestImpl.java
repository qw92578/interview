package com.cd.interview.test;

/**
 * @Package: com.cd.interview
 * @ClassName: test
 * @Author: fgq
 * @Description:
 * @Date: 2019/10/9 9:29
 */
public class TestImpl implements TestServer {

    static {
        System.err.println("静态代码块");
    }

    {
        System.err.println("代码块");
    }

    public TestImpl() {
        System.err.println("类的无参构造");
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
        TestImpl test = new TestImpl();
    }

    /**
     * 重写Overriding是父类与子类之间多态性的一种表现
     *
     * @param s
     */
    @Override
    public void fatherMethod(String s) {
        System.err.println("父类的方法");
    }
}
