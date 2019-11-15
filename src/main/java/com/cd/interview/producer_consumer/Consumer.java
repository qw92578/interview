package com.cd.interview.producer_consumer;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @Package: com.cd.interview.consumer
 * @ClassName: Consumer
 * @Author: fgq
 * @Description: 消费者
 * @Date: 2019/11/15 10:58
 */
public class Consumer implements Runnable {

    private final Vector sharedQueue;
    private final int SIZE;

    public Consumer(Vector sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.SIZE = size;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            try {
                System.out.println("Consumer: " + consume());
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private int consume() throws InterruptedException {

        //wait if queue is empty
        while (sharedQueue.isEmpty()) {
            synchronized (sharedQueue) {
                System.out.println("Queue is empty " + Thread.currentThread().getName()
                        + " is waiting , size: " + sharedQueue.size());
                sharedQueue.wait();
            }
        }

        //otherwise consume element and notify waiting producer
        synchronized (sharedQueue) {
            sharedQueue.notifyAll();
            return (Integer) sharedQueue.remove(0);
        }
    }
}
