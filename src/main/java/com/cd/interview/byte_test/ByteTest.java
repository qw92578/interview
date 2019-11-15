package com.cd.interview.byte_test;

/**
 * @Package: com.cd.interview.byte_test
 * @ClassName: ByteTest
 * @Author: fgq
 * @Description:
 * @Date: 2019/11/15 11:22
 */
public class ByteTest {

    /**
     * += 隐式的将加操作的结果类型强制转换为持有结果的类型。如果两这个整型相加，
     * 如 byte、short 或者 int，首先会将它们提升到 int 类型，然后在执行加法操作。
     * 如果加法操作的结果比 a 的最大值要大，则 a+b 会出现编译错误，但是 a += b 没问题
     * @param args
     */
    public static void main(String[] args) {
        byte a = 127;

        byte b = 127;

        b = a + b; // error : cannot convert from int to byte

        b += a; // ok


    }

}
