package com.pm;
class Machine{
	public void on() {
		System.out.println("�Ѵ�");
	}
	public void off() {
		System.out.println("����");
	}
	public void work() {
		System.out.println("���⸦ ������ �������̵� �մϴ�");
	}
}
class Tv extends Machine{
	public void work() {
		System.out.println("���ļ��� ��� ȭ���� �����ش�");
	}
}
class Audio extends Machine{
	public void work() {
		System.out.println("������ ����ش�");
	}
}

class Radio extends Machine{
	@Override
	public void work() {
		System.out.println("���ļ� ��� �Ҹ��� ����ش�");
	}
}

public class Ex04 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		Machine remote=null;
		
		System.out.print("Ŭ��������>");
		String input=sc.nextLine();
		remote=(Machine)(Class.forName(input).newInstance());
		
		remote.on();
		remote.work();
		remote.off();
	}

}
