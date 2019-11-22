package com.cd.interview.collection_map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Package: com.cd.interview.list_map
 * @ClassName: ListDemo
 * @Author: fgq
 * @Description: TreeSet分析
 * @Date: 2019/11/20 8:34
 */
public class TreeSetTest {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(7);
//        list.add(3);
//        list.add(4);
//        list.add(41);
//        list.add(5);
//        Vector<Integer> vector = new Vector<>();
//
//        /**
//         * TreeSet 自动排序
//         */
//        Set<Integer> treeSet = new TreeSet<Integer>();
//        treeSet.addAll(list);
//        treeSet.forEach(i ->{
////            System.err.print(i+",");
//        });
//
////        System.err.println("=====");
//        Set<Integer> hashSet = new HashSet<>();
////        hashSet.addAll(list);
//        hashSet.add(1);
//        hashSet.add(0);
//        hashSet.add(11);
//        hashSet.add(2);
//        hashSet.add(9);
//        hashSet.forEach(i ->{
////            System.err.print(i+",");
//        });

        Person p1 = new Person("小强q",18);
        Person p2 = new Person("小胖qqqq",16);


        Set<Person> pSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object obj1, Object obj2) {
                Person p1 = (Person) obj1;
                Person p2 = (Person) obj2;
                if (p1.getName().length() > p2.getName().length()) {
                    return 1;
                }else {
                    return -1;
                }
            }
        });

        pSet.add(p1);
        pSet.add(p2);

        pSet.forEach(p ->{
            System.err.println(p);
        });


//        TreeSet<Person> ts = new TreeSet<>();
//        ts.add(new Person("张十三", 11));
//        ts.add(new Person("李四", 12));
//        ts.add(new Person("王五", 15));
//        ts.add(new Person("赵六", 21));


//        System.err.println(ts);


    }
}

class Person{
//class Person implements Comparator{
    private String name;

    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 为什么返回0，只会存一个元素，返回-1会倒序存储，返回1会怎么存就怎么取呢？原因在于TreeSet底层其实是一个二叉树机构，
     * 且每插入一个新元素(第一个除外)都会调用compareTo()方法去和上一个插入的元素作比较，并按二叉树的结构进行排列。
     *
     * 如果将compareTo()返回值写死为0，元素值每次比较，都认为是相同的元素，这时就不再向TreeSet中插入除第一个外的新元素。所以TreeSet中就只存在插入的第一个元素。
     * 如果将compareTo()返回值写死为1，元素值每次比较，都认为新插入的元素比上一个元素大，于是二叉树存储时，会存在根的右侧，读取时就是正序排列的。
     * 如果将compareTo()返回值写死为-1，元素值每次比较，都认为新插入的元素比上一个元素小，于是二叉树存储时，会存在根的左侧，读取时就是倒序序排列的。
     *
     * @param obj
     * @return
     */
//    @Override
//    public int compareTo(Object obj) {
////        Person p = (Person)obj;
////        return 0;                //当compareTo方法返回0的时候集合中只有一个元素
////        return 1;                //当compareTo方法返回正数的时候集合会怎么存就怎么取
////        return -1;                //当compareTo方法返回负数的时候集合会倒序存储
//        Person p = (Person)obj;
//
//        return 1;
//    }

//    @Override
//    public int compare(Object o1, Object o2) {
//        return 0;
//    }
}
