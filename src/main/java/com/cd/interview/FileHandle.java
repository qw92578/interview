package com.cd.interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Package: com.cd.interview
 * @ClassName: FileHandle
 * @Author: fgq
 * @Description: 文件读取
 * @Date: 2019/11/6 11:15
 */
public class FileHandle {
    public static void main(String[] args) {
            File file = new File("E://test.txt");
        FileInputStream is = null;
        try {
            is = new FileInputStream(file);
            byte[] b = new byte[1024];


            int a = is.read(b);

            String[] str = new String(b, 0, a).split("");

            int count = 0;

            for (int i = 0; i < str.length; i++) {

                if ("a".equals(str[i])) {
                    count++;
                }
            }

            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("文件不存在");
        }finally {
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
