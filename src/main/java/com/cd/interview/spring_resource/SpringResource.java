package com.cd.interview.spring_resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Package: com.cd.interview.spring_resource
 * @ClassName: SpringResource
 * @Author: fgq
 * @Description: Spring5.1.x源码解析
 * @Date: 2019/11/18 10:57
 */
public class SpringResource {

    public static void main(String[] args) {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
//        DefaultListableBeanFactory defaultListableBeanFactory;
        DefaultListableBeanFactory d = new DefaultListableBeanFactory();

        List list = new ArrayList();
        Queue<String> strings = new ArrayDeque<>();
        LinkedHashMap map = new LinkedHashMap();
        LinkedList<String> linkedList = new LinkedList<>();

        Map concurrentHashMap = new ConcurrentHashMap();
    }
}
