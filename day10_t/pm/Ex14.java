package com.pm;

public class Ex14 {

	public static void main(String[] args) {
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		System.out.println("�л������������α׷�(ver 0.7.0)");
		int input=0;
		String[] msg= {"����","����","����"};
		int[][] data=new int[0][3];
		int cnt=0;
		while(true) {
			System.out.print("1.���� 2.�Է� 0.����> ");
			input=sc.nextInt();
			if(input==0)break;
			if(input==1) {
				for(int i=0; i<data.length; i++) {
					for(int j=0; j<data[i].length; j++) {
						System.out.print(data[i][j]+"\t");
					}
					System.out.println();
				}
			}
			if(input==2) {
				int[] stu=new int[3];
				for(int i=0; i<msg.length; i++) {
					System.out.print(msg[i]+"> ");
					stu[i]=sc.nextInt();
				}
				int[][] before=data;
				data=new int[data.length+1][3];
//				System.arraycopy(before, 0, data, 0, before.length);
				data[cnt++]=stu;
			}
		}

	}

}
