package com.cd.interview.test;

/**
 * @Package: com.cd.interview.test
 * @ClassName: ThreadClass
 * @Author: fgq
 * @Description: 线程 实现方式1 继承线程类
 * @Date: 2019/10/9 10:38
 */
public class ThreadClass1 extends Thread{

    public static void main(String[] args) {
        ThreadClass1 threadClass1 = new ThreadClass1();
        threadClass1.run();
    }
}
