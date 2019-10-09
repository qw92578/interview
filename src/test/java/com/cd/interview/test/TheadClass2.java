package com.cd.interview.test;

/**
 * @Package: com.cd.interview.test
 * @ClassName: TreadClass2
 * @Author: fgq
 * @Description: 线程实现方式2  实现Runnable 接口 并重新方法
 * @Date: 2019/10/9 10:41
 */
public class TheadClass2 implements Runnable {
    @Override
    public void run() {
        System.err.println("继承runnable接口的run方法");
    }
}
