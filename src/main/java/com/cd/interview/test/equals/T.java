package com.cd.interview.test.equals;

/**
 * @Package: com.cd.interview.test.equals
 * @ClassName: T
 * @Author: fgq
 * @Description:
 * @Date: 2019/11/12 15:03
 */
public class T {
    static boolean foo(char c) {
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
        int i =0;
        for (foo('A');foo('B') && (i<2);foo('C')) {
            i++;
            foo('D');
        }
    }
}
