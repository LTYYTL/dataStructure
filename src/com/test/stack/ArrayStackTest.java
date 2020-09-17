package com.test.stack;

import com.dataStructure.stack.ArrayStack;

public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(5);
        //添加元素
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        System.out.println(arrayStack);

        //获得栈的大小
        System.out.println(arrayStack.getSize());

        //获得栈顶元素
        System.out.println(arrayStack.peek());

        //移除元素
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        System.out.println(arrayStack);
        //基于MyArray，会有缩容的情况
        System.out.println(arrayStack.getSize());


    }
}
