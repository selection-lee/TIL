package com.pm;

public class Ex03 {

	public static void main(String[] args) {
		String title="�л������������α׷�(ver 0.5.0)-�迭";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����> ";
		final String[] role= {"����","����","����"};
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		int input=0;
		int cnt=0;
		System.out.print("�ѿ�> ");
		int tot=sc.nextInt();
		int[][] arr=new int[tot][];
		while(true) {
			System.out.print(menu);
			input=sc.nextInt();
			
			if(input==0)break;
			if(input==2&&tot>cnt) {
				int[] stu=new int[4];
				stu[0]=++cnt;
				for(int i=0; i<3; i++) {
					System.out.print(role[i]+"> ");
					input=sc.nextInt();
					stu[i+1]=input;
				}
				arr[cnt-1]=stu;
			}
			else if(input==2) {
				System.out.println("�Է��� �ȹ���");
			}
			if(input==1) {
				System.out.println("-----------------------------------");
				System.out.println("�й�\t����\t����\t����");
				System.out.println("-----------------------------------");
				for(int i=0; i<arr.length; i++) {
					int[] stu=arr[i];
					if(stu!=null) {
						for(int j=0; j<stu.length; j++) {
							if(j!=0)System.out.print("\t");
							System.out.print(stu[j]);
						}
						System.out.println();
					}
				}
			}
			if(input==3) {
				System.out.print("������ �й�> ");
				input=sc.nextInt();
				for(int i=0; i<arr.length; i++) {
					int[] stu=arr[i];
					if(stu[0]==input) {
						int[] editStu=new int[4];
						editStu[0]=input;
						for(int j=0; j<3; j++) {
							System.out.print(role[j]+"> ");
							input=sc.nextInt();
							editStu[j+1]=input;
						}
						arr[i]=editStu;
					}
				}
			}
			if(input==4) {
				System.out.print("������ �й�> ");
				input=sc.nextInt();
				for(int i=0; i<arr.length; i++) {
					int[] stu=arr[i];
					if(stu[0]==input) {arr[i]=null;}
				}
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}









