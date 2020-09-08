package com.test;

import com.dataStructure.LinkedList_dummyHead;

public class LinkedList_dummyHeadTest {
    public static void main(String[] args) {
        LinkedList_dummyHead<Integer> linkedList_dummyHead = new LinkedList_dummyHead<>();
        //添加元素
        linkedList_dummyHead.addFirst(1);
        linkedList_dummyHead.addFirst(2);
        linkedList_dummyHead.addLast(3);
        System.out.println(linkedList_dummyHead);
        System.out.println(linkedList_dummyHead.getSize());
        //查找元素
        System.out.println(linkedList_dummyHead.getFirst());
        System.out.println(linkedList_dummyHead.getLast());
        //查看2是否在链表中
        System.out.println(linkedList_dummyHead.contains(2));
        //修改第二个元素
        linkedList_dummyHead.set(2,4);
        System.out.println(linkedList_dummyHead);
        //删除
        //System.out.println(linkedList_dummyHead.remove(1));
        System.out.println(linkedList_dummyHead.removeFirst());
        System.out.println(linkedList_dummyHead.removeLast());
        System.out.println(linkedList_dummyHead);
    }
}
