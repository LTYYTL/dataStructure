package com.test.linkedList;

import com.dataStructure.linkedList.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        //添加元素
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addLast(3);
        System.out.println(linkedList);
        System.out.println(linkedList.getSize());
        //查找元素
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        //查看2是否在链表中
        System.out.println(linkedList.contains(2));
        //修改第二个元素
        linkedList.set(2,4);
        System.out.println(linkedList);
        //删除
        //System.out.println(linkedList.remove(1));
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);






    }
}
