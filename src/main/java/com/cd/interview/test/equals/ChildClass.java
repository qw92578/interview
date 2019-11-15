package com.cd.interview.test.equals;

/**
 * @Package: com.cd.interview.test.equals
 * @ClassName: ChildClass
 * @Author: fgq
 * @Description:
 * @Date: 2019/11/12 15:16
 */
public class ChildClass extends FatherClass{
    public ChildClass() {
        System.out.println("ChildClass create");

    }

    public static void main(String[] args) {
        FatherClass f = new FatherClass();
        ChildClass c = new ChildClass();
    }
}
