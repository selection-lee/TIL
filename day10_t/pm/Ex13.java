package com.pm;

public class Ex13 {

	public static void main(String[] args) {
		// string ����� �����ϸ� ���ο� ��ü ��ȯ
		// buffer builder �ڱ��ڽ��� �ٲ�
		String msg1="java";
		String msg2=new String("java");
		StringBuffer sb1=new StringBuffer("java");
		StringBuilder sb2=new StringBuilder("java");
		
		System.out.println(sb1+"Web");
		String msg3=sb1+"Web";
		
		StringBuffer sb3=sb1.append("Web");
//		System.out.println(sb3);
		System.out.println(sb1);
		StringBuffer sb4=sb3.append("Spring");
//		System.out.println(sb4);
		System.out.println(sb1);
		System.out.println(sb1.append("DB"));
		System.out.println(sb1.append("Database"));
		
		System.out.println("����");
		for(int i=0; i<1000; i++) {
			sb1.append(i);
		}
		System.out.println("��");
		System.out.println(sb1);
	}

}











