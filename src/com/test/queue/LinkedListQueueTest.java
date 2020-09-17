package com.test.queue;

import com.dataStructure.queue.LinkedListQueue;

public class LinkedListQueueTest {
    public static void main(String[] args) {
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        //入队
        linkedListQueue.enqueue(1);
        linkedListQueue.enqueue(2);
        linkedListQueue.enqueue(3);
        linkedListQueue.enqueue(4);
        linkedListQueue.enqueue(5);
        //获得长度
        System.out.println(linkedListQueue.getSize());
        System.out.println(linkedListQueue);
        //出队
        linkedListQueue.dequeue();
        linkedListQueue.dequeue();
        //获得队首元素
        System.out.println(linkedListQueue.getFront());
        System.out.println(linkedListQueue);
    }
}
