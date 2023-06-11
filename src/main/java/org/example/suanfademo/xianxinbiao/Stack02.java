package org.example.suanfademo.xianxinbiao;


import java.lang.reflect.Array;
import java.util.Arrays;

//栈的实现
public class Stack02 {

    //存放栈中元素的数组
    private int[] storage;
    //栈的容量
    private int capacity;
    //栈中元素数量
    private int count;
    //扩容倍数
    private static final int GROW_FACTOR = 2;

    //不带初始容量的构造方法。默认容量为8
    public Stack02() {
        this.capacity = 8;
        this.storage = new int[capacity];
        this.count = 0;
    }

    /**
     * 带初始容量的构造方法
     */
    public Stack02(int initialCapacity) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("Capacity too small.");
        }
        this.capacity = initialCapacity;
        this.storage = new int[initialCapacity];
        this.count = 0;
    }

    /**
     * 入栈
     */
    public void push(int value){
        if (count==capacity){

        }
        storage[count++]=value;
    }

    /**
     * 确保容量大小
     */
    public void ensureCapacity(){
        int newCapacity=capacity*GROW_FACTOR;
        storage= Arrays.copyOf(storage,newCapacity);
        capacity=newCapacity;
    }

    /**
     * 返回栈顶元素并出栈
     */
    public int pop() {
        if (count == 0) {
            throw new IllegalArgumentException("Stack is empty.");
        }
        count--;
        return storage[count];
    }

    //返回栈顶元素不出栈
    public int peek() {
        if (count == 0){
            throw new IllegalArgumentException("Stack is empty.");
        }else {
            return storage[count-1];
        }
    }

    //判断栈是否为空
    public boolean isEmpty() {
        return count == 0;
    }

    //返回栈中元素的个数
    public int size() {
        return count;
    }

}
