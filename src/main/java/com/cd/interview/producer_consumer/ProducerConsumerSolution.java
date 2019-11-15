package com.cd.interview.producer_consumer;

import java.util.Vector;

/**
 * @Package: com.cd.interview.producer_consumer
 * @ClassName: ProducerConsumerSolution
 * @Author: fgq
 * @Description: 测试生成消费者   只要记住在同步块中调用 wait() 和 notify()方法，如果阻塞，通过循环来测试等待条件
 * @Date: 2019/11/15 11:08
 */
public class ProducerConsumerSolution {

    public static void main(String[] args) {
        Vector sharedQueue = new Vector();
        int size = 4;
        Thread prodThread = new Thread(new Producer(sharedQueue, size), "Producer");
        Thread consThread = new Thread(new Consumer(sharedQueue, size), "Consumer");
        prodThread.start();
        consThread.start();
    }
}
