package com.dataStructure.stack;

import com.dataStructure.linkedList.LinkedList;

/**
 * 基于链表，实现Stack接口
 * @param <E>
 */
public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> linkedList;

    public LinkedListStack() {
        this.linkedList = new LinkedList<>();
    }

    /**
     * 获取栈大小
     * @return
     */
    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    /**
     * 判断栈是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    /**
     * 入栈（以链表头为栈顶）
     * @param e
     */
    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    /**
     * 出栈（以链表头为栈顶）
     * @return
     */
    @Override
    public E pop() {
        return linkedList.removeFirst();
    }

    /**
     * 获取栈顶元素（以链表头为栈顶 ）
     * @return
     */
    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    /**
     * 输出链栈
     * @return
     */
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top ");
        res.append(linkedList);
        return res.toString();
    }
}
