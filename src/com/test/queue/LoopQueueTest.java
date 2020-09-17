package com.test.queue;

import com.dataStructure.queue.LoopQueue;

public class LoopQueueTest {
    public static void main(String[] args) {
        LoopQueue<Integer> loopQueue = new LoopQueue<>(5);
        //添加元素
        loopQueue.enqueue(1);
        loopQueue.enqueue(2);
        loopQueue.enqueue(3);
        loopQueue.enqueue(4);
        System.out.println(loopQueue);
        //移除元素
        loopQueue.dequeue();
        loopQueue.dequeue();
        loopQueue.dequeue();
        System.out.println(loopQueue);

        loopQueue.enqueue(5);
        loopQueue.enqueue(6);
        System.out.println(loopQueue);
        //获得队头元素
        System.out.println(loopQueue.getFront());

    }
}
