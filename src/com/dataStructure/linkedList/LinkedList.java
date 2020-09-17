package com.dataStructure.linkedList;

/**
 * 不带虚拟头节点的链表
 * @param <E>
 */
public class LinkedList<E> {
    /**
     * 节点类
     * @param
     */
    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e,null);
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * 判断是否为空链表
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 获得链表长度
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 向链表的index位置添加元素
     * 注：基本是头插法或者尾插法，所以设计为私有
     * @param e 节点值
     * @param index 插入的位置(从0开始)
     */
    private void add(E e,int index){
        //index不合法
        if (index < 0 || index >size)
            throw new IllegalArgumentException("Add failed. Illegal index.");
        //插入到头部
        if (index == 0){
            Node node = new Node(e);
            node.next = head;
            head = node;
            size++;
        }else {
            Node pre = head;
            //找到插入位置的前一个节点
            for (int i = 0; i < index - 1; ++i)
                pre = pre.next;
            Node node = new Node(e);
            //将新节点的next指向前一个节点的next
            node.next = pre.next;
            //前一个节点的next指向新节点
            pre.next = node;
            //维护链表长度
            size++;
        }
    }

    /**
     * 头插法
     * @param e
     */
    public void addFirst(E e){
        add(e,0);
    }

    /**
     * 尾插法
     * @param e
     */
    public void addLast(E e){
        add(e,size);
    }

    /**
     * 获得第index位置的元素
     * @param index 位置(从0开始)
     * @return  第index位置的元素
     */
    private E get(int index){
        //index不合法
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Get failed. Illegal index.");
        //获得index位置的节点
        Node cur = head;
        for (int i = 0; i < index;i++)
            cur = cur.next;
        return cur.e;
    }

    /**
     * 获得第一个元素
     * @return
     */
    public E getFirst(){
        return get(0);
    }

    /**
     * 获取最后一个元素
     * @return
     */
    public E getLast(){
        return get(size - 1);
    }

    /**
     * 修改index位置上的值
     * @param index 需要修改的位置(从0开始)
     * @param e 需要修改的值
     */
    public void set(int index,E e){
        //index不合法
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Set failed. Illegal index.");
        //获得index位置的节点
        Node cur = head;
        for (int i = 0; i < index; i++){
            cur = cur.next;
        }
        //修改节点值
        cur.e = e;
    }

    /**
     * 判断链表中是否存在元素e
     * @param e
     * @return
     */
    public boolean contains(E e){
        Node cur = head;
        //循环链表找到值相等的点
        while(cur != null){
            if (cur.e.equals(e))
                return true;
            cur = cur.next;
        }

        return false;
    }

    /**
     * 删除第index位置的元素
     * @param index 位置(从0开始)
     * @return  移除元素的e
     */
    public E remove(int index){
        //index不合法
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Remove failed. Illegal index.");
        //移除队首元素时
        if(index == 0){
            Node delNode = head;
            head = delNode.next;
            size--;
            return delNode.e;
        }
        //获取第index位置的前一个节点
        Node pre = head;
        for (int i = 0; i < index - 1; i++)
            pre = pre.next;
        //被删除节点
        Node delNode = pre.next;
        //用前一个节点指向第index位置节点的后一个节点
        pre.next = delNode.next;
        //维护链表长度
        size--;

        return delNode.e;
    }

    /**
     * 移除第一个元素
     * @return
     */
    public E removeFirst(){
        return remove(0);
    }

    /**
     * 移除最后一个元素
     * @return
     */
    public E removeLast(){
        return remove(size - 1);
    }

    /**
     * 输出链表
     * @return
     */
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = head;
        while (cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
