package com.pm;

public class Ex06 {

	public static void main(String[] args) {
		String title="�л������������α׷�(ver 0.2.0)";
		String menu="1.�Է� 2.��� 0.����> ";
		String table="-------------------------------------------\r\n" + 
				"�й�	|����	|����	|����	|�հ�	|���\r\n" + 
				"-------------------------------------------";
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		System.out.print("�ѿ�> ");
		int[][] data=new int[sc.nextInt()][];
		int idx=0;
		while(true) {
			System.out.print(menu);
			int input=sc.nextInt();
			if(input==0)break;
			if(input==1&&data.length>idx) {
				int[] stu=new int[3];
				System.out.print("����> ");
				stu[0]=sc.nextInt();
				System.out.print("����> ");
				stu[1]=sc.nextInt();
				System.out.print("����> ");
				stu[2]=sc.nextInt();
				data[idx++]=stu;
			}else if(input==1) {
				System.out.println("��� �Է��ϼ̽��ϴ�");
			}
			if(input==2) {
				System.out.println(table);
				for(int i=0; i<idx; i++) {
					int[] stu=data[i];
					System.out.print(i+1);
					for(int j=0; j<stu.length; j++) {
						System.out.print("	|");
						System.out.print(stu[j]);
					}					
					System.out.print("	|");
					System.out.print(stu[0]+stu[1]+stu[2]);
					System.out.print("	|");
					System.out.print((stu[0]+stu[1]+stu[2])*100/3/100.0);
					System.out.println();
				}
				System.out.println();
			}
		}
		
		System.out.println("�̿����ּż� �����մϴ�");
	}

}
















