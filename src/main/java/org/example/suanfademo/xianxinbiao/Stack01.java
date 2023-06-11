package org.example.suanfademo.xianxinbiao;


import java.util.HashMap;
import java.util.Stack;

public class Stack01 {

    /*
     *给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断该字符串是否有效。
     * 有效字符串需满足：
     * 1.左括号必须用相同类型的右括号闭合。
     * 2.左括号必须以正确的顺序闭合。
     * 比如 "()"、"()[]{}"、"{[]}" 都是有效字符串，而 "(]"、"([)]" 则不是。
     * */
    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
        System.out.println(isValid("()[]{}"));

    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<Character>();
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (map.containsKey(str[i])) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != map.get(str[i])) {
                    return false;
                }
            } else {
                stack.push(str[i]);
            }
        }
        return stack.isEmpty();
    }


}
