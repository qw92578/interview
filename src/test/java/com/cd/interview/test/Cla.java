package com.cd.interview.test;

/**
 * @Package: com.cd.interview.test
 * @ClassName: Cla
 * @Author: fgq
 * @Description: 计算 常见的
 * @Date: 2019/10/9 11:20
 */
public class Cla {

    public static void main(String[] args) {
//        shortTest();

//        roundTets();


    }


    /**
     * round方法返回与参数最接近的长整数，参数加1/2后求其floor.
     */
    private static void roundTets() {
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));
    }


    private static void shortTest() {
        /**
         * s1 = s1 + 1
         * s1+1  返回的是int   s1是short  需要强制类型转换
         */
        short s1 = 1;
//        s1 =  s1 + 1;


        /**
         * short s1 = 1; s1 += 1;（可以正确编译，+=内置运算符运算时可自动变换数据类型）
         * +=
         */
        short s2 = 1;
        s2 +=  1;
        System.err.println(s2);
    }


}
