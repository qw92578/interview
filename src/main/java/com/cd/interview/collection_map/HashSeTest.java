package com.cd.interview.collection_map;

import java.util.*;

/**
 * @Package: com.cd.interview.collection_map
 * @ClassName: HashSeTest
 * @Author: fgq
 * @Description: HashSet分析
 * @Date: 2019/11/20 9:51
 */
public class HashSeTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(3);

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(list);
//        System.err.println(hashSet);

        HashSet<String> set = new HashSet<String>();
        set.add("语文");
        set.add("数学");
        set.add("英语");
        set.add("历史");
        set.add("政治");
        set.add("地理");
        set.add("生物");
        set.add("化学");

        System.err.println(set);
        // 1   0000 0001
        // 3   0000 0011
        //&    0000 0000  ==>0

        System.out.println(1 & 3); //1
        System.out.println(1 << 3); //8
        System.out.println((double)(1 >> 3)); //0.25

        Map<String,Object> map = new HashMap<>();
        map.put("1",1);
        map.put("1",2);
        System.err.println(map);



    }
}
