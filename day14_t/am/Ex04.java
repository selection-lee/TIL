package com.am;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		// 1~45
		// 0.0<=Math.random<1.0
		// 0.0<=Math.random<=0.9999999999999999999
		// 0.0*45<=Math.random*45<=0.9999999999999999999*45
		// 0.0<=Math.random*45<=44.9999999999999999999999
		// 1.0<=Math.random*45+1<=45.9999999999999999999999
		System.out.println((int)(Math.random()*45)+1);
		
		Random ran=new Random();
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println(ran.nextInt());// int�ڷ��� ����������
		System.out.println(ran.nextDouble());// Math.random
		System.out.println(ran.nextBoolean());//true,false
		System.out.println(ran.nextLong());// long�ڷ��� ����������
		System.out.println("------------------------------");
		System.out.println(ran.nextInt(45)+1);
	}

}












