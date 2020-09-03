package com.liu;


public class MyArray<E> {

    public int size;//数组中实际元素个数
    public E[] data;//存储的数据

    public MyArray(int capacity){
        data = (E[])new Object[capacity];
        size = 0;
    }

    //无参构造方法，默认容量capacity=10
    public MyArray(){
        this(10);
    }

    /**
     * 向index处添加元素
     * @param index 索引
     * @param e 元素
     */
    public void add(int index,E e){
        //数组满情况
        if (size == data.length){
            resize(2 * data.length);
        }
        //索引越界情况
        if (index < 0 || index > size){
            throw new IllegalArgumentException("Add failed.Require index is overstep.");
        }
        //将每个元素向后移动一位，将index位置空出来
        for (int i = size - 1; i >= index; i--){
            data[i+1] = data[i];
        }
        //将e放置到index处
        data[index] = e;
        size++;
    }

    /**
     * 向数组头添加元素
     * @param e 元素
     */
    public void addFirst(E e){
        add(0,e);
    }

    /**
     * 向数组尾添加元素
     * @param e 元素
     */
    public void addLast(E e){
        add(size,e);
    }

    /**
     * 查询整个数组
     * @return  String
     */
    @Override
    public String toString() {

        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size = %d ,capacity = %d\n",size, data.length));

        res.append("[");
        for (int i = 0; i < size; i++){
            res.append(data[i]);
            if (i != size - 1)
                res.append(",");
        }
        res.append("]");
        return res.toString();

    }

    /**
     * 获得index处的值
     * @param index 索引
     * @return  E
     */
    public E get(int index){
        //索引越界情况
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed.Index is overstep.");
        }

        return data[index];
    }

    /**
     * 修改index处的值
     * @param index 索引
     * @param e
     */
    public void set(int index, E e){
        //索引越界情况
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Set failed.Index is overstep.");
        }
        data[index] = e;
    }

    /**
     * 数组中是否包含元素e
     * @param e 元素
     * @return
     */
    public boolean contains(E e){
        for (int i = 0; i < size; i++){
            if (data[i] == e)
                return true;
        }

        return false;
    }

    /**
     * 获得元素e的索引位置
     * @param e 元素
     * @return
     */
    public int find(E e){
        for (int i = 0; i < size; i++){
            if (data[i] == e)
                return i;
        }

        return -1;
    }

    /**
     * 删除index处的元素
     * @param index 索引
     * @return
     */
    public E remove(int index){
        //索引越界情况
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Remove failed.Index is overstep.");
        }

        E res = data[index];
        for (int i = index + 1; i < size; i++){
            data[i - 1] = data[i];
        }
        size--;
        if (size == data.length/4 && data.length/2 !=0){
            resize(data.length/2);
        }
        return res;
    }

    /**
     * 删除数组头元素
     * @return
     */
    public E removeFirst(){
        return remove(0);
    }

    /**
     * 删除数组尾元素
     * @return
     */
    public E removeLast(){
        return remove(size -1);
    }

    /**
     * 删除指定元素e
     * @param e 元素
     */
    public void removeElement(E e){
        //获取元素e索引
        int index = find(e);
        if (index != -1)
            remove(index);
    }

    /**
     * 改变数组大小
     * @param newCapacity   长度
     */
    private void resize(int newCapacity){

        E[] newData = (E[]) new Object[newCapacity];

        for (int i = 0; i < size; i++)
            newData[i] = data[i];

        data =newData;;
    }
}
