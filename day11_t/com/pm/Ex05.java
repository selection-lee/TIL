package com.pm;

public class Ex05 {

	static class UserErr extends Exception{
		public UserErr() {
			super("su�� 1 or 2 or 5 or 10�� ����");
		}
		public UserErr(String msg) {
			super(msg);
		}
	}
	
	public static int func01(int su) throws UserErr{
		if(!(su==1||su==2||su==5||su==10))
			throw new UserErr("su�� "+su+"�̹Ƿ� �ȵ�");
		return 10/su;
	}// su 1 2 5 10

	public static void main(String[] args) {
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		int input=sc.nextInt();
		try {
		int su=func01(input);
		System.out.println(su);
		}catch(UserErr e) {
			e.printStackTrace();
			//System.out.println("�Է¿���");			
		}
	}

}
