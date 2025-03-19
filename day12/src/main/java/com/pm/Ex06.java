package com.pm;

import java.util.Deque;
import java.util.LinkedList;

public class Ex06 {
    public static void main(String[] args) {
        Deque q1 = new LinkedList();
        q1.offerFirst("첫");
        q1.offerFirst("들");
        q1.offerFirst("셋");
        while(q1.peekLast() != null) {
            break;
        }
        Deque q2 = new LinkedList();
        
        
        Deque stack1 = new LinkedList();
        stack1.offerFirst("첫");
        stack1.offerFirst("둘");
        stack1.offerFirst("셋");
        // 스택은 앞에서 꺼내야겠지
        while (stack1.peekFirst() != null) {
            System.out.println(stack1.pollFirst());
        } // 셋 둘 첫

        System.out.println("stack2");
        Deque stack2 = new LinkedList();
        stack2.offerLast("첫");
        stack2.offerLast("둘");
        stack2.offerLast("셋");

        while (stack2.peekLast() != null) {
            System.out.println(stack2.pollLast());
        } // 셋 둘 첫
    }
}
