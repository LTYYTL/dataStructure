package com.dataStructure;

import java.util.Arrays;

public class LoopQueue<E> implements Queue<E> {
    //属性
    private E[] data;
    private int front, tail;//队头、队尾指针
    private int size;//队列中存在的元素个数

    /**
     * 构造函数
     * @param capacity  队列容量
     */
    public LoopQueue(int capacity){
        //默认牺牲一个单元
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    /**
     * 默认构造函数，默认队列容量为10
     */
    public LoopQueue() {
        this(10);
    }
    //get和set方法
    public E[] getData() {
        return data;
    }

    public void setData(E[] data) {
        this.data = data;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override

    public int getSize() {
        return size;
    }

    /**
     * 队列长度
     * @return
     */
    public int getCapacity(){
        return data.length - 1;
    }

    /**
     * 判断队列是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    /**
     * 入队
     * @param e
     */
    @Override
    public void enqueue(E e) {
        //队列已满
        if((tail + 1) % data.length == front)
            resize(getCapacity() *2);
        data[tail] = e;
        //改变tail指向下一个位置
        tail = (tail + 1) % data.length;
        size++;
    }

    /**
     * 出队
     * @return
     */
    @Override
    public E dequeue() {
        if(isEmpty())
            throw  new IllegalArgumentException("Cannot dequeue from an empty queue.");

        E res = data[front];
        data[front] = null;//将出队位置赋值为null
        //改变front指向下一个位置
        front = (front + 1) % data.length;
        size--;
        //缩小队列容量
        if (size == getCapacity()/4 && getCapacity()/2 != 0)
            resize(getCapacity() / 2);
        return res;
    }

    /**
     * 获得队首元素
     */
    @Override
    public E getFront() {
        if (isEmpty())
            throw new IllegalArgumentException("Queue is empty.");
        return data[front];
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: size = %d, capacity = %d\n",size,getCapacity()));
        res.append("front [");

        for (int i = front; i != tail; i = (i+1) % data.length){
            res.append(data[i]);
            if ((i+1)% data.length != tail)
                res.append(", ");
        }

        res.append("] tail");

        return res.toString();
    }

    /**
     * 扩容
     * @param newCapacity
     */
    private void resize(int newCapacity){
        //默认牺牲一个单元
        E[] newData = (E[]) new Object[newCapacity + 1];
        for (int i = 0; i < size; i++){
            newData[i] = data[(i + front) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }
}
