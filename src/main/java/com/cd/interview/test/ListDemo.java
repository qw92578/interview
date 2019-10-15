package com.cd.interview.test;

import java.util.*;

/**
 * @Package: com.cd.interview.test
 * @ClassName: ListDemo
 * @Author: fgq
 * @Description: list复习
 * @Date: 2019/10/14 14:28
 */
public class ListDemo {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        System.err.println("list: " + list);

        List v = new Vector();
        v.add(1);
        v.add(3);
        v.add(2);
        System.err.println("v: " + v);

        List link = new LinkedList();
        link.add(3);
        link.add(1);
        link.add(2);
        System.err.println("link: " + link);

//        Map hashMap = new HashMap();
//
//        Map hashTable = new Hashtable();
//
//        Map treeMap = new TreeMap();
    }
}
