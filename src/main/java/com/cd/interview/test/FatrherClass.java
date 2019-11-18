package com.cd.interview.test;

/**
 * @Package: com.cd.interview.test
 * @ClassName: HahaClass
 * @Author: fgq
 * @Description:
 * @Date: 2019/11/18 8:45
 */
public class FatrherClass {

    static {
        System.err.println("父的静态代码块");
    }
    {
        System.err.println("父代码块");
    }

    public FatrherClass() {
        System.err.println("父无参构造");
    }

    public void fatherMethod() {
        System.err.println("父类的方法");
    }
}
