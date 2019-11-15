package com.cd.interview.producer_consumer;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @Package: com.cd.interview.product
 * @ClassName: Product
 * @Author: fgq
 * @Description: 生产者
 * @Date: 2019/11/15 10:56
 */

public class Producer implements Runnable {

    private final Vector sharedQueue;
    private final int SIZE;

    public Producer(Vector sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.SIZE = size;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 7; i++) {
            System.out.println("Produced:" + i);
            try {
                produce(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void produce(int i) throws InterruptedException {

        //wait if queue is full
        while (sharedQueue.size() == SIZE) {
            synchronized (sharedQueue) {
                System.out.println("Queue is full " + Thread.currentThread().getName()
                        + " is waiting , size: " + sharedQueue.size());
                sharedQueue.wait();
            }
        }

        //producing element and notify consumers
        synchronized (sharedQueue) {
            sharedQueue.add(i);
            sharedQueue.notifyAll();
        }
    }
}