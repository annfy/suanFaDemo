package org.example;

import org.example.suanfademo.xianxinbiao.Stack02;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Stack02 myStack =new Stack02();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        System.out.println(myStack.peek());//8
        System.out.println(myStack.size());//8
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack.pop());
        }
        System.out.println(myStack.isEmpty());//true
        System.out.println( "Hello World!" );
    }
}
