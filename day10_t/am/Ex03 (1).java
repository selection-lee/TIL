package com.am;

public class Ex03 {

	public static void main(String[] args) {
		int a=1111;
		//autoboxing
		Integer b=2222;
		Integer c=new Integer(3333);
		//unboxing
		Integer d=new Integer("+4444");
		int e=new Integer("-5555");
		System.out.println(d.intValue()+1);
		System.out.println(d+1);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
	}

}














