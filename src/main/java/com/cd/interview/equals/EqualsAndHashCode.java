package com.cd.interview.equals;

/**
 * @Package: com.cd.interview.equals
 * @ClassName: EqualsAndHashCode
 * @Author: fgq
 * @Description: equals和hashCode的理解
 * @Date: 2019/11/11 10:43
 */
public class EqualsAndHashCode {
    public static void main(String[] args) {
        String str = "abc";
        System.err.println("hashCode值："+str.hashCode());
        System.out.println(str.equals("abc"));

        System.out.println(Integer.hashCode(1));

        System.err.println(Double.hashCode(1));

//        System.err.println((n &（1<<3））>>3);
        int n =2;
        System.out.println((n & (1 << 3)) >> 3);

        Double d = 0.11;
        d.hashCode();


        //二进制： 0000 0000
        //十进制：128 64 32 16 8 4 2 1

        // 2 : 0000 0010
        // 1 : 0000 0001
        // 3 : 0000 0011

        // 1<<3二进制在右边加3个o     0000 1000  结果  8
        // 2 & 8   先都转换成二进制
//            0000 0010
//            0000 1000
//                ||    &运算 都为1的时候才为1
//            0000 0000
//                ||
//                0

        //十进制转8进制
//        10 -> 2   0000 1010
//           -> 8   12   8^1 + ^1
        System.out.println("-16>>2运算的结果是 :"+((-11)>>2));


    }
}
