package com.am;

public class Ex02 {

	public static void main(String[] args) {
		// return (������ �޼���) -�޸𸮱��� ȣ���� ������ ���ư��� ��
		//break (�ݺ���, switch��) -�ݺ��� ����(switch����)�� Ż��
		//continue (�ݺ���) - continue�����ڵ带 �����ϰ� ó������ ���ư�
		System.out.println("����");
		func03();
		System.out.println("����");
//		return;
	}
	public static void func01() {
		for(int i=0; i<10; i++) {
			if(i>5) {break;}
			System.out.println("i="+i);
		}
//		return;
	}
	public static void func02() {
		for(int i=0; i<10; i++) {
			if(i>5)return;// 
			System.out.println("i="+i);
		}
//		return;
	}
	public static void func03() {
		for(int i=0; i<10; i++) {
			if(i>5)continue;
			System.out.println("i="+i);
		}
//		return;
	}

}





