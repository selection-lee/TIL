package com.pm;

public class Ex07 {

	public static void main(String[] args) {
		String title="�л������������α׷�(ver 0.3.0)";
		String menu="1.�Է� 2.��� 0.����> ";
		String table="-------------------------------------------\r\n" + 
				"�й�	|����	|����	|����	|�հ�	|���\r\n" + 
				"-------------------------------------------";
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		int input=0,cnt=1;
		String data="";
		while(true) {
			System.out.print(menu);
			input=sc.nextInt();
			if(input==0)break;
			if(input==1) {
				data+=cnt+++"	|";
				System.out.print("����> ");
				input=sc.nextInt();
				data+=input+"	|";
				System.out.print("����> ");
				input=sc.nextInt();
				data+=input+"	|";;
				System.out.print("����> ");
				input=sc.nextInt();
				data+=input+"	\n";;
			}
			if(input==2) {
				System.out.println(table);
				System.out.println(data);
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}










