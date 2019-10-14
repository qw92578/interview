package com.cd.interview.test;

/**
 * @Package: com.cd.interview.test
 * @ClassName: NativeTest
 * @Author: fgq
 * @Description: 本地接口调用JNI(java native interface)
 * @Date: 2019/10/14 11:01
 */
public class NativeTest {
    static {
        System.loadLibrary("HelloNative");
    }

    public static native void sayHello();

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        NativeTest.sayHello();
    }
}
