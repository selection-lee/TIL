package com.pm;

public class Ex16 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer(new StringBuilder("abc"));
		StringBuffer sb3=new StringBuffer(5);
		System.out.println(sb.capacity());
//		for(int i=0; i<13; i++) {
//			sb3.append('a');
//		}java
//		System.out.println(sb3.capacity());
		System.out.println(sb3.append("ja"));
		System.out.println(sb3.append("va"));
		System.out.println(sb3.replace(1, 3, "AV"));
		System.out.println(sb3.delete(1, 3));
		System.out.println(sb3.insert(1, "AV"));
		System.out.println(sb3.insert(4, "WEB"));
		// CreateReadUpdateDelete
		System.out.println(sb3.reverse());
	}

}













