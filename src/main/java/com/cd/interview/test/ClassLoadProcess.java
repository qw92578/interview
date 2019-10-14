package com.cd.interview.test;

import java.io.File;
import java.util.StringTokenizer;

/**
 * @Package: com.cd.interview.test
 * @ClassName: ClassLoadProcess
 * @Author: fgq
 * @Description: 类的加载过程    --> 加载    -->验证     --> 准备    -->解析      --> 初始化
 *                                 1、加载：通过一个类的完全限定名 如（java.lang.String）找到该类，并利用.class(字节码文件)创建对象
 *
 *                                            2、验证：文件格式验证、元数据验证、字节码验证、符号引用验证
 *
 *                                                        3、准备阶段为类变量(即static修饰的字段变量)分配内存并且设置该类变量的初始值即0(如static int i=5;这里只将i初始化为0，
 *                                                        至于5的值将在初始化时赋值)，这里不包含用final修饰的static，因为final在编译的时候就会分配了，注意这里不会为实例变
 *                                                        量分配初始化，类变量会分配在方法区中，而实例变量是会随着对象一起分配到Java堆中。
 *
 *                                                                   4、解析:主要将常量池中的符号引用替换为直接引用的过程。符号引用就是一组符号来描述目标，可以是任何字面量，
 *                                                                      而直接引用就是直接指向目标的指针、相对偏移量或一个间接定位到目标的句柄。有类或接口的解析，字段解析，
 *                                                                      类方法解析，接口方法解析(这里涉及到字节码变量的引用，如需更详细了解，可参考《深入Java虚拟机》)。
 *                                                                                 5、类加载最后阶段，若该类具有超类，则对其进行初始化，执行静态初始化器和静态初始化成员变量
 *                                                                                      (如前面只初始化了默认值的static变量将会在这个阶段赋值，成员变量也将被初始化)。
 *
 * 作用：  类加载器的任务是根据一个类的全限定名来读取此类的二进制字节流到JVM中，然后转换为一个与目标类对应的java.lang.Class对象实例
 * @Date: 2019/10/14 9:47
 */
public class ClassLoadProcess {


    /**
     * final修饰的在编译成字节码(.class文件)的时候就 就会分配内存
     */
    public static final String str = "sss";

    /**
     * static 关键字修饰的类变量 在虚拟机准备阶段 分配内存区间并设置该变量的初始值0
     * 5
     */
    public static int i = 5;

    /**
     * java虚拟机中提供3中类加载器  启动（Bootstrap）类加载器、扩展（Extension）类加载器、系统（System）类加载器（也称应用类加载器）
     *      1、Bootstrap  启动类加载器主要加载的是JVM自身需要的类，这个类加载使用C++语言实现的，是虚拟机自身的一部分，它负责将 <JAVA_HOME>/lib路径下的核心类库或-Xbootclasspath参数
     *                    指定的路径下的jar包加载到内存中，注意必由于虚拟机是按照文件名识别加载jar包的，如rt.jar，如果文件名不被虚拟机识别，即使把jar包丢到lib目录下也是没有作用的
     *                    (出于安全考虑，Bootstrap启动类加载器只加载包名为java、javax、sun等开头的类)。
     *
     *      2、Extension   扩展类加载器是指Sun公司(已被Oracle收购)实现的sun.misc.Launcher$ExtClassLoader类，由Java语言实现的，是Launcher的静态内部类，它负责加载<JAVA_HOME>/lib/ext
     *                    目录下或者由系统变量-Djava.ext.dir指定位路径中的类库，开发者可以直接使用标准扩展类加载器。
     *
     *      3、System     也称应用程序加载器是指 Sun公司实现的sun.misc.Launcher$AppClassLoader。它负责加载系统类路径java -classpath或-D java.class.path 指定路径下的类库，也就是我们
     *                    经常用到的classpath路径，开发者可以直接使用系统类加载器，一般情况下该类加载是程序中默认的类加载器，通过ClassLoader#getSystemClassLoader()
     *                    该类：sun.misc.Launcher$ExtClassLoader  方法可以获取到该类加载器。
     *                    在Java的日常应用程序开发中，类的加载几乎是由上述3种类加载器相互配合执行的，在必要时，我们还可以自定义类加载器，需要注意的是，Java虚拟机对class文件采用的是按需加载的方式，也就是说当需要
     *                    使用该类时才会将它的class文件加载到内存生成class对象，而且加载某个类的class文件时，Java虚拟机采用的是双亲委派模式即把请求交由父类处理，它一种任务委派模式
     * ————————————————
     */
    //2、Extension拓展类
    //ExtClassLoader类中获取路径的代码
    private static File[] getExtDirs() {
        //加载<JAVA_HOME>/lib/ext目录中的类库
        String s = System.getProperty("java.ext.dirs");
        File[] dirs;
        if (s != null) {
            StringTokenizer st = new StringTokenizer(s, File.pathSeparator);
            int count = st.countTokens();
            dirs = new File[count];
            for (int i = 0; i < count; i++) {
                dirs[i] = new File(st.nextToken());
            }
        } else {
            dirs = new File[0];
        }
        return dirs;
    }


    public static void main(String[] args) throws Exception {
        File[] extDirs = getExtDirs();
        for (File extDir : extDirs) {

        }
        //获取系统类加载器  sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(ClassLoader.getSystemClassLoader());

        System.out.println(Class.forName("java.lang.Thread"));
    }
}
