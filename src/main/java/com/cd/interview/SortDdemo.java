package com.cd.interview;

/**
 * @Package: com.cd.interview
 * @ClassName: SortDdemo
 * @Author: fgq
 * @Description: 排序
 * @Date: 2019/11/6 11:14
 */
public class SortDdemo {

    public static void main(String[] args) {
        String s1 = new StringBuilder("go").append("od").toString();
        System.out.println(s1.intern() == s1);
        String s2 = new StringBuilder("ja").append("va").toString();
        System.out.println(s2.intern() == s2);

        /**
         * Math.round(11.5)的返回值是12，Math.round(-11.5)的返回值是-11。四舍五入的原理是在参数上加0.5然后进行下取整。
         */
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));

        int[] arr = {1,2,3};


        System.out.println(arr.length);

        String string = "aaaa";
        System.out.println(string.length());
    }


}
