package com.cd.interview.test;

/**
 * @Package: com.cd.interview.test
 * @ClassName: AbstractInterface
 * @Author: fgq
 * @Description: 测试创建抽象接口
 * @Date: 2019/10/9 9:41
 */
public interface AbstractInterface {
    /**
     * 接口中所有的方法隐含的都是抽象的。而抽象类则可以同时包含抽象和非抽象的方法。
     *
     * 类可以实现很多个接口，但是只能继承一个抽象类
     */

    /**
     * 接口中的方法
     * @return
     */
    public abstract String test();

}
