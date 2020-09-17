package com.test.stack;

import com.dataStructure.stack.LinkedListStack;

public class LinkedListStackTest {
    public static void main(String[] args) {
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        //入栈
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);
        System.out.println(linkedListStack);
        //栈的大小
        System.out.println(linkedListStack.getSize());
        //栈是否为空
        System.out.println(linkedListStack.isEmpty());

        linkedListStack.pop();
        linkedListStack.pop();
        System.out.println(linkedListStack);

        System.out.println(linkedListStack.peek());
    }


}
