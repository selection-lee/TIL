package com.am;

public class Ex11 {

	public static void main(String[] args) {
		char target='@';
		//���ڳ�
		//1.0.2 ��밡���ϳ� - �ڵ� �ۼ��ÿ��� ��λ�밡��
		System.out.println(Character.isDefined(target));
		//1.5 ���ڳ�
		System.out.println(Character.isLetter(target));
		//1.7 ���ڳ�
		System.out.println(Character.isAlphabetic(target));
		// ���ڳ�
		System.out.println(Character.isDigit(target));
		// ���� �빮��
		System.out.println(Character.isUpperCase(target));
		// ���� �ҹ���
		System.out.println(Character.isLowerCase(target));
		// ����
		System.out.println(Character.isSpace(target));
		System.out.println(Character.isWhitespace(target));
		
	}

}










