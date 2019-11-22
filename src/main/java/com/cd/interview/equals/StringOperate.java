package com.cd.interview.equals;

import java.io.UnsupportedEncodingException;

/**
 * @Package: com.cd.interview.equals
 * @ClassName: StringOperate
 * @Author: fgq
 * @Description: 利用递归实现字符串反转
 * @Date: 2019/11/11 14:28
 */
public class StringOperate {
    /**
     * str.substring(1) 拼接上第一位 str.charAt(0) 一直操作
     * 比如 123  第一次成为 231   第二次 23 第三次 3
     *
     * @param originStr
     * @return
     */
    public static String reverse(String originStr) {
        if (originStr == null || originStr.length() <= 1) {
            return originStr;
        }
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }

    // StringBuffer  方法
    public static String reverse1(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "fangguanqgiang";
//        System.err.println(reverse(str));
//        System.out.println(reverse1(str));

        //冒泡排序
//        bulubulu(new int[]{1, 11, 9, 3});

        //选择排序
        selectionSort(new int[]{1, 33, 2, 4});

        //
        int a = 012;
        int b = 6;
        System.err.println(a + b);
        String str1 = "aa";
        String b1 = new String("aa");
        System.err.println(str1 == b1);
    }

    /**
     * 冒泡排序
     *
     * @param arr
     * @return
     */
    public static int[] bulubulu(int arr[]) {
        int temp;
        //外层控循环次数
        for (int i = 0; i < arr.length; i++) {
            //内层控制比较次数
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    //前面比后面大  将后面的赋值前面
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i : arr) {
            System.err.println(i);
        }
        return arr;

    }


    /**
     * 冒泡排序,升序排列
     * 数组当中比较小的数值向下沉，数值比较大的向上浮！
     */
    public static int[] bubbleSort(int[] arr) {
        // 外层for循环控制循环次数
        for (int i = 0; i < arr.length; i++) {
            int tem = 0;
            // 内层for循环控制相邻的两个元素进行比较
            for (int j = i + 1; j < arr.length; j++) {
                //前面大于后面
                if (arr[i] > arr[j]) {
                    //将后面的赋值给临时遍历
                    tem = arr[j];
                    //前面赋值给后面
                    arr[j] = arr[i];
                    //临时变量赋值给前面
                    arr[i] = tem;
                }
            }
        }
        for (int i : arr) {
            System.err.println(i);
        }
        return arr;
    }

    /**
     * 选择排序
     *
     * @param array
     * @return
     */
    public static int[] selectionSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                //找到最小的数
                if (array[j] < array[minIndex]) {
                    //将最小数的索引保存
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        for (int i : array) {
            System.err.println(i);
        }
        return array;
    }

}
