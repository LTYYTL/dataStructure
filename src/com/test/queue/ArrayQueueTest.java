package com.test.queue;

import com.dataStructure.queue.ArrayQueue;

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(5);
        //入队操作
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        System.out.println(arrayQueue);
        //获得队列长度
        System.out.println(arrayQueue.getSize());
        //出队操作
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        //获得队首元素
        System.out.println(arrayQueue.getFront());
        //移除四个元素后的队列，基于MyArray会有缩容操作
        System.out.println(arrayQueue);

    }
}
