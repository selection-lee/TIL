package com.pm;

public class Ex12 {

	public static void main(String[] args) {
		// �ֹι�ȣ üũ��(ver 0.9.0)
		// �ֹι�ȣ>000000-0000000
		// ����� 00�� 0���Դϴ�
		int age=0;
		final char[] gender= {'��','��'};
		int genderIdx=0;
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		System.out.println("�ֹι�ȣ üũ��(ver 0.9.0)");
		String input=null;
		while(true) {
			System.out.print("�ֹι�ȣ>");
			input=sc.nextLine();
			String[] arr=input.trim().split("-");
			// �߰��� -�� ������
			if(arr.length!=2)continue;
			// - ���� 6�ڸ�
			if(arr[0].length()!=6)continue;
			// - ���� 7�ڸ�
			if(arr[1].length()!=7)continue;
			// ���ڷθ� ����
			final boolean[] arr2= {false,false};
			for(int i=0; i<arr.length; i++) {
				char[] temp=arr[i].toCharArray();
				for(int j=0; j<temp.length; j++) {
					if(!Character.isDigit(temp[j]))arr2[i]=true;
				}
			}
			if(arr2[0]||arr2[1])continue;
			
			if(arr[1].charAt(0)=='2'||arr[1].charAt(0)=='4')genderIdx=1;
			int year=Integer.parseInt(19+arr[0].substring(0,2));
			age=2025-year+1;
			if(arr[1].charAt(0)=='3'||arr[1].charAt(0)=='4')age-=100;
			break;
		}
		System.out.println("����� "+age+"�� "+gender[genderIdx]+"���Դϴ�");
	}

}

















