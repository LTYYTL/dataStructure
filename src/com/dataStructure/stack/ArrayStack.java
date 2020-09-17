package com.dataStructure.stack;

import com.dataStructure.array.Array;

/**
 * 基于MyArray，实现接口Stack<E>
 */
public class ArrayStack<E> implements Stack<E> {

    private Array<E> array;

    /**
     * 构造函数
     */
    public ArrayStack(int capacity){
        array = new Array<>(capacity);
    }

    /**
     * 默认构造函数，调用MyArray的默认构造方法
     */
    public ArrayStack(){
        array = new Array<>();
    }

    /**
     * get方法
     * @return
     */
    public Array<E> getArray() {
        return array;
    }

    /**
     * set方法
     * @param array
     */
    public void setArray(Array<E> array) {
        this.array = array;
    }

    /**
     * 获得栈的大小
     * @return
     */
    @Override
    public int getSize() {
        return array.getSize();
    }

    /**
     * 判断栈是否为空
     */
    @Override
    public boolean isEmpty() {
        return array.getSize() == 0;
    }

    /**
     * 添加元素
     * @param e
     */
    @Override
    public void push(E e) {
        //将末尾作为栈顶
        array.addLast(e);
    }

    /**
     * 删除元素
     * @return
     */
    @Override
    public E pop() {
        //后进先出，从末尾开始删除
        return array.removeLast();
    }

    /**
     * 查看栈顶元素
     * @return
     */
    @Override
    public E peek() {
        //最后进栈元素在末尾
        return array.getLast();
    }

    /**
     * 获得所有元素
     * @return
     */
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append("[");
        for (int i = 0; i< array.getSize(); i++){
            res.append(array.get(i));
            if (i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] top");
        return res.toString();
    }
}
