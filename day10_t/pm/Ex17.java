package com.pm;
// �ֹι�ȣüũ
// �л�����
class Student{
	final int num;
	String name;
	int kor;
	int eng;
	int math;
	
	public Student(int num) {
		this.num=num;
	}
	public void setKor(String kor) {
		this.kor=Integer.parseInt(kor);
	}
	public void setEng(String eng) {
		this.eng=Integer.parseInt(eng);
	}
	public void setMath(String math) {
		this.math=Integer.parseInt(math);
	}
	public int tot() {
		return kor+eng+math;
	}
	public double avg() {
		return tot()*100/3/100.0;
	}
}
public class Ex17 {

	public static void main(String[] args) {
		System.out.println("�л������������α׷�(ver 0.8.0)");
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		String input=null;
		System.out.print("�ѿ�> ");
		Student[] data=new Student[Integer.parseInt(sc.nextLine())];
		int cnt=0;
		while(true) {
			System.out.print("1.���� 2.�Է� 0.����> ");
			input=sc.nextLine();
			if(input.equals("0"))break;
			if(input.equals("1")) {
				System.out.println("------------------------------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
				System.out.println("------------------------------------------------");
				for(int i=0; i<data.length; i++) {
					Student stu=data[i];
					System.out.println(stu.num+"\t"+stu.name+"\t"+stu.kor+"\t"+stu.eng+"\t"
							+stu.math+"\t"+stu.tot()+"\t"+stu.avg());
				}
			}
			if(input.equals("2")&&cnt<data.length) {
				Student stu=new Student(202500+cnt);
				System.out.print("�̸�> ");
				stu.name=sc.nextLine();
				System.out.print("����> ");
				input=sc.nextLine();
				stu.setKor(input);
				System.out.print("����> ");
				input=sc.nextLine();
				stu.setEng(input);
				System.out.print("����> ");
				input=sc.nextLine();
				stu.setMath(input);
				data[cnt++]=stu;
			}
		}
	}

}
