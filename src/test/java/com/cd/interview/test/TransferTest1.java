package com.cd.interview.test;

/**
 * @Package: com.cd.interview.test
 * @ClassName: TransferTest1
 * @Author: fgq
 * @Description: 引用传递 传递的是地址的引用
 * @Date: 2019/10/9 10:16
 */
public class TransferTest1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);
        change(p1);
        System.out.println(p1);

        p1 = change(p1);
        System.err.println(p1);

        String s ="aaaa";
    }

    public static Person change(Person p2) {
        return new Person();
    }
}

    /**
     * Person类
     */
    class Person {

    }
