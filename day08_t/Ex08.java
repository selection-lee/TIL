package com.pm;

public class Ex08 {

	public static void main(String[] args) {
		String title="�л������������α׷�(ver 0.3.0)";
		String menu="1.�Է� 2.��� 0.����> ";
		String table="-------------------------------------------\r\n" + 
				"�й�	|����	|����	|����	|�հ�	|���\r\n" + 
				"-------------------------------------------";
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		String input="";
		String data="";
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			System.out.println(stringToInt(input)-1);
			if(true)break;
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}
	
	public static int stringToInt(String msg) {
		int cnt=msg.length();
		int su=1,sum=0;
		while(true) {
			sum+=(msg.charAt(cnt---1)-'0')*su;
			su*=10;
			if(cnt==0)break;
		}
		return sum;
//		if(cnt==3) {
//			return (msg.charAt(0)-'0')*100
//					+(msg.charAt(1)-'0')*10
//					+(msg.charAt(2)-'0')*1;
//		}
//		if(cnt==2) {
//			return (msg.charAt(0)-'0')*10
//					+(msg.charAt(1)-'0')*1;
//		}
//		if(cnt==1) {
//			return (msg.charAt(0)-'0')*1;
//		}
//		
//		return 0;
	}

}
















