package com.cd.interview.gc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Package: com.cd.interview.gc
 * @ClassName: Gc_Test
 * @Author: fgq
 * @Description: 垃圾回收之内存泄漏
 * @Date: 2019/11/21 15:29
 */
public class Gc_Test {


    /**
     * 长什么周期的对象持有端生命周期对象的引用
     * 端生命周期的对象不用了，长什么周期对象还对其进行引用 而导致不能被回收
     * <p>
     * 通俗地说，就是程序员可能创建了一个对象，以后一直不再使用这个对象，
     * 这个对象却一直被引用，即这个对象无用但是却无法被垃圾回收器回收的，
     * 这就是java中可能出现内存泄露的情况，
     * <p>
     * 例如，缓存系统，我们加载了
     * 一个对象放在缓存中(例如放在一个全局map对象中)，然后一直不再使用它，
     * 这个对象一直被缓存引用，但却不再被使用。
     *
     * @param args
     */
    public static void main(String[] args) {
        System.err.println("这样会内存泄漏吗");
    }

    static {
        for (int i = 0; i < 10000; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("a", new Person("xiaopang", 16));
            map.put("b", new Person("daxiong", 18));
        }
    }
}

class Person implements Serializable {
    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
