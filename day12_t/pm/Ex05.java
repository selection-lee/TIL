package com.pm;

import java.util.LinkedList;

public class Ex05 {

	public static void main(String[] args) {
		
		// ���Լ��� FIFO (first-in-first-out) 
		java.util.Queue que=new LinkedList();
		que.offer("ù��°");
		que.offer("�ι�°");
		que.offer("����°");
		que.offer("�׹�°");
		que.offer("�ټ���°");
		
//		System.out.println(que.poll());
//		System.out.println(que.poll());
//		System.out.println(que.poll());
//		System.out.println(que.poll());
//		System.out.println(que.poll());
//		System.out.println(que.poll());
//		Object obj=null;
//		while((obj=que.poll())!=null) {
//			System.out.println(obj);
//		}
		
//		System.out.println(que.peek());
//		que.poll();
//		System.out.println(que.peek());
//		que.poll();
//		System.out.println(que.peek());
//		que.poll();
//		System.out.println(que.peek());
//		que.poll();
//		System.out.println(que.peek());
//		que.poll();
//		System.out.println(que.peek());
//		que.poll();
		while(que.peek()!=null) {
			System.out.println(que.poll());
		}
	}

}












