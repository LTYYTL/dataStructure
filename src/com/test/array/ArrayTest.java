package com.test.array;

import com.dataStructure.array.Array;

public class ArrayTest {
    public static void main(String[] args) {
        Array<Integer> array = new Array<>(5);
        array.addFirst(1);
        array.addLast(2);
        array.addLast(3);
        array.addLast(4);
        array.addLast(5);
        System.out.println(array);
        System.out.println("------------");

        System.out.println(array.contains(2));
        System.out.println(array.removeLast());
        System.out.println(array.removeLast());
        System.out.println(array.removeLast());
        array.removeElement(2);
        System.out.println(array);

        array.addLast(2);
        array.addLast(6);
        array.addLast(7);
        System.out.println(array);
    }
}
