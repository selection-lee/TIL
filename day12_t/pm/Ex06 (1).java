package com.pm;

import java.util.Deque;
import java.util.LinkedList;

public class Ex06 {

	public static void main(String[] args) {
		Deque que1=new LinkedList();
//		que1.offerFirst("ù��°");
//		que1.offerFirst("�ι�°");
//		que1.offerFirst("����°");
//
//		while(que1.peekLast()!=null) {
//			System.out.println(que1.pollLast());
//		}
		Deque que2=new LinkedList();
//		que1.offerLast("ù��°");
//		que1.offerLast("�ι�°");
//		que1.offerLast("����°");
//
//		while(que1.peekFirst()!=null) {
//			System.out.println(que1.pollFirst());
//		}
		
		Deque stack1=new LinkedList();
//		stack1.offerFirst("ù��°");
//		stack1.offerFirst("�ι�°");
//		stack1.offerFirst("����°");
//		
//		while(stack1.peekFirst()!=null) {
//			System.out.println(stack1.pollFirst());
//		}
		Deque stack2=new LinkedList();
		stack2.offerLast("ù��°");
		stack2.offerLast("�ι�°");
		stack2.offerLast("����°");
		
		while(stack2.peekLast()!=null) {
			System.out.println(stack2.pollLast());
		}
	}

}
















