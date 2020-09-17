package com.dataStructure.queue;

public class LinkedListQueue<E> implements Queue<E> {
    private class Node{

        public E e;
        public Node next;

        public Node(E e , Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e, null);
        }

        public Node(){
            this(null, null);
        }

        public String toString(){
            return e.toString();
        }

    }

    private Node head,tail;
    private int size;

    /**
     * 队列长度
     * @return
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * 队列是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 入队
     * @param e
     */
    @Override
    public void enqueue(E e) {
        //空队列
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        }else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    /**
     * 出队
     * @return
     */
    @Override
    public E dequeue() {
        //判断是否为空队列
        if (isEmpty())
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        //获取队头元素
        Node reNode = head;
        //移动队头指针
        head = head.next;
        //将队头元素从队列中取出
        reNode.next = null;
        //取出元素后，空队情况
        if (head == null)
            tail = null;
        //长度减一
        size--;
        return reNode.e;
    }

    /**
     * 获取队头元素
     * @return
     */
    @Override
    public E getFront() {
        if (isEmpty())
            throw new IllegalArgumentException("Queue is empty");
        return head.e;
    }

    /**
     * 输出队列
     * @return
     */
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue: front ");
        Node cur = head;
        while (cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL tail");
        return res.toString();
    }
}
