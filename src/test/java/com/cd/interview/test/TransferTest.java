package com.cd.interview.test;

/**
 * @Package: com.cd.interview.test
 * @ClassName: TransferTest
 * @Author: fgq
 * @Description: 值传递  传递的是储存单元中的值 ，而不是储存单元的引用
 * @Date: 2019/10/9 10:16
 */
public class TransferTest {
    public static void main(String[] args) {
        int num = 1;
        System.out.println("changeNum()方法调用之前：num = " + num);
        changeNum(num);
        System.out.println("changeNum()方法调用之后：num = " + num);

        int i = changeNum2(num);
        System.out.println("changeNum2()方法调用之后：num = " + i);

    }

    public static void changeNum(int x) {
        x = 2;
    }

    public static int changeNum2(int x) {
        return 2;
    }
}
