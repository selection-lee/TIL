package com.pm;

public class Ex04 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.5.0)-�迭
		// �л������������α׷�(ver 0.6.0)-String
		// �л������������α׷�(ver 0.7.0)-Student ��ü
		// 1.���� 2.�Է� 3.���� 4.���� 0.����> 
		// ������ �й�> 
		// ����> 
		// ...
		// ������ �й�>
		// 1.���� 2.�Է� 3.���� 4.���� 0.����> 
		String title="�л������������α׷�(ver 0.6.0)-String";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����> ";
		final String[] role= {"����","����","����"};
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		String input=null;
		int cnt=0;
		String data="";
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0"))break;
			if(input.equals("2")) {
				data+=++cnt;
				for(int i=0; i<role.length; i++) {
					System.out.print(role[i]+"> ");
					data+="\t"+sc.nextLine();
				}
				data+="\n";
			}
			if(input.equals("1")) {
				System.out.println("-----------------------------------");
				System.out.println("�й�\t����\t����\t����");
				System.out.println("-----------------------------------");
				System.out.println(data);
			}
			if(input.equals("3")) {}
			if(input.equals("4")) {
				System.out.print("������ �й�> ");
				input=sc.nextLine();
				int begin=-1;
				int end=-1;
				if(data.startsWith(input+"\t")) {
					begin=-1;
				}else {
					begin=data.indexOf("\n"+input+"\t");
				}
				/////
				end=data.indexOf("\n",begin+1);
				String target=data.substring(begin+1, end+1);
				data=data.replace(target, "");
			}
			
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}










