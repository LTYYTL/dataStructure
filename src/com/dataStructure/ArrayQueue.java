package com.dataStructure;

/**
 * 基于MyArray,实现Queue<E>接口
 * @param <E>
 */
public class ArrayQueue<E> implements Queue<E> {
    private Array<E> array;

    /**
     * 构造方法
     * @param capacity  队列长度
     */
    public ArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    /**
     * 无参构造方法，默认队列长度为10
     */
    public ArrayQueue(){
        array = new Array<>();
    }

    /**
     * get和set
     */
    public Array<E> getArray() {
        return array;
    }

    public void setArray(Array<E> array) {
        this.array = array;
    }

    /**
     * 获取队列长度
     * @return
     */
    @Override
    public int getSize() {
        return array.getSize();
    }

    /**
     * 判断队列是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return array.getSize() == 0;
    }

    /**
     * 入队
     * @param e
     */
    @Override
    public void enqueue(E e) {
        //先进后出，将入队元素放在尾部
        array.addLast(e);
    }

    /**
     * 出队
     * @return
     */
    @Override
    public E dequeue() {
        //先进后出，删除头部元素
        return array.removeFirst();
    }

    /**
     * 查看队首元素
     * @return
     */
    @Override
    public E getFront() {
        //队首元素即数组第一个元素
        return array.getFirst();
    }

    /**
     * 获取所有元素
     * @return
     */
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");

        for (int i = 0; i < array.getSize(); i++){
            res.append(array.get(i));
            if (i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] tail");

        return res.toString();
    }
}
