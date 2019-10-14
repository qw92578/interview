package com.cd.interview.test;

/**
 * @Package: com.cd.interview.test
 * @ClassName: StringTest
 * @Author: fgq
 * @Description:
 * @Date: 2019/10/14 9:09
 */
public class StringTest {

    public static void main(String[] args) {
       //这个方法调用的是String 总的改方法
        //         * public static String valueOf(int i) {
        //         * return Integer.toString(i);
        //         * }
        String s = "a";



        String str=new String("a");
        System.err.println("s:"+s+"   str:"+str);

        /**
         * 最终储存在private final char value[];中
         */
    }
}
