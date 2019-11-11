package com.cd.interview.test;

/**
 * @Package: com.cd.interview.test
 * @ClassName: Sort
 * @Author: fgq
 * @Description: 排序
 * @Date: 2019/10/15 10:41
 */
public class Sort {


    public static void main(String[] args) {
        int[] arr = {5,9,10};
        bubbleSort(arr);
    }

    /**
     * 冒泡排序
     *      基本思想：两个数比较大小，较大的数下沉，较小的数冒起来。
     *
     * 过程：
     *      比较相邻的两个数据，如果第二个数小，就交换位置。
     *      从后向前两两比较，一直到比较最前两个数据。最终最小数被交换到起始的位置，这样第一个最小数的位置就排好了。
     *      继续重复上述过程，依次将第2.3...n-1个最小数排好位置。
     * @param arr
     */
    public static void bubbleSort(int [] arr){
        int temp;//临时变量
        //表示趟数，一共arr.length-1次。
        for(int i=0; i<arr.length-1; i++){
            for(int j=arr.length-1; j>i; j--){

                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }}

}
