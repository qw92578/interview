package com.cd.interview.class_load;

import java.lang.reflect.Method;

/**
 * @Package: com.cd.interview.class_load
 * @ClassName: User
 * @Author: fgq
 * @Description: 测试获取类对象和获取类的对象  应用在反射中
 * @Date: 2019/11/18 9:34
 */
public class User {

    public String name;
    private int age;

    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    private User(int age) {
        this.age = age;

    }

    public User(String name) {
//        super();
        this.name = name;
    }

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }

    public void exit() {
        System.out.println(name + "退出系统");
    }

    public void login(String username, String password) {
        System.out.println("用户名:" + username);
        System.out.println("密码:" + password);
    }

    private String CheckInfo() {
        return "年龄:" + age;
    }

}

class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        /**
         * 第一种方式 Class.forName 源码
         */
        Class<?> user1 = Class.forName("com.cd.interview.class_load.User");
        System.err.println(user1);

        /**
         *第二种方式  .class 字节码
         */
        Class user2 = User.class;
        System.err.println(user1 == user2);

        /**
         * 第三种方式 类的对象.getClass
         */

        User user = new User();
        Class user3 = user.getClass();
        System.err.println(user1 == user3);

        User user4 = new User();
        /**
         * 类的对象创建多次个数不一致
         */
        System.err.println(user == user4);

        /**
         * 获取类对象之后就可以对类进行一些创建对象、调用方法、访问成员变量的操作了
         */

        /**
         * 创建对象
         */
        Object o = user1.newInstance();
        System.err.println(o);

        Method[] methods = user1.getMethods();
        for (Method method : methods) {
            System.err.println("方法："+ method);
        }

    }
}
