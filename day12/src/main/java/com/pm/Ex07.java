package com.pm;

import java.util.Stack;

public class Ex07 {
    public static void main(String[] args) {
        // 일반적으로 우리는 우항을 중요시하는데, collection framework에선느 좌항을 중요시해야 함!!
        Stack stack = new Stack();
        stack.push("첫");
        stack.push("둘");
        stack.push("셋");
        System.out.println(stack.search("셋")); // 첫번째로 나온다 -> 1 출력

//        while (stack.peek()!= null) {
//            System.out.println(stack.pop());
//        } // 얘는 셋까지 출력하고 나서 네번쨰 돌아왔을 때 stack.peek()!= null에서 에러남
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
        System.out.println(stack.search("셋")); // 없다 -> -1 출력
    }
}
