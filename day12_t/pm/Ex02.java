package com.pm;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList(5);
//		LinkedList list=new LinkedList();
//		System.out.println(list.isEmpty());
		list.add("ù��°");
		list.add("�ι�°");
		list.add("����°");
		list.add("�׹�°");
		list.add("����°");
		boolean boo=list.remove("����°");
//		System.out.println(list.isEmpty());
//		System.out.println(list.indexOf("����°"));
//		System.out.println(list.contains("����°"));
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("����°"==sc.nextLine());
//		System.out.println(list.contains(sc.nextLine()));// eq
//		list.set(2,"3��°");
//		Object obj=list.remove(3);
//		list.add(1,"�ϰ��̻���");
//		list.clear();
		for(int i=0; i<list.size(); i++) {
			Object ele=list.get(i);
			System.out.println((String)ele);
		}

	}

}









