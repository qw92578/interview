package com.cd.interview.test;

/**
 * @Package: com.cd.interview.test
 * @ClassName: DeadLock
 * @Author: fgq
 * @Description: 死锁  互相等待对方释放资源才能执行
 * @Date: 2019/10/9 10:45
 */
public class DeadLock {

    public static void main(String[] args) {
        DieLock dl1 = new DieLock(true);
        DieLock dl2 = new DieLock(false);

        dl1.start();
        dl2.start();
    }
}

/**
 * 理想状态下dl1线程为true从if执行先打出"if objA"然后再接着打出"if objB"之后释放A、B的锁对象，之后dl2线程执行else语句打出"else objB"，"else objA"。
 * 非理想状态下dl1先打出"if objA"，之后线程dl2执行打出"else objB"，然后1、2线程的锁对象A和B都处于被锁的状态，两个线程争夺锁对象发生死锁现象。
 */
class DieLock extends Thread {
    private boolean flag;

    public DieLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (MyLock.objA) {
                System.out.println("if objA");
                synchronized (MyLock.objB) {
                    System.out.println("if objB");
                }
            }
        } else {
            synchronized (MyLock.objB) {
                System.out.println("else objB");
                synchronized (MyLock.objA) {
                    System.out.println("else objA");
                }
            }
        }
    }
}

