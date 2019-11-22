package com.cd.interview.servlet_test;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Package: com.cd.interview.servlet_test
 * @ClassName: LifeCycleTest
 * @Author: fgq
 * @Description: Servlet什么周期
 * @Date: 2019/11/22 8:48
 */
public class LifeCycleTest implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.err.println("初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.err.println("运行销毁方法");
    }

    public static void main(String[] args) {
        LifeCycleTest lifeCycleTest = new LifeCycleTest();
        //初始化Servlet 生命周期
    }
}
