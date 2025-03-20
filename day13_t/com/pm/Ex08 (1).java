package com.pm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Stu implements Comparable<Stu>{
	int num;
	int kor;
	int eng;
	int math;
	@Override
	public int compareTo(Stu ord) {
		return ord.num-this.num;
	}
}

public class Ex08 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.11.0) 
		// SET
		// �������� �й�
		// �ߺ����� - �й� - �����ϴ� �л��Դϴ�
		String[] arr={"�й�","����","����","����"};
		System.out.println("�л������������α׷�(ver 0.11.0) ");
		Scanner sc=new Scanner(System.in);
		int input=-1;
		Set<Stu> data=new TreeSet<>();
		while(true) {
			System.out.print("1.���� 2.�Է� 0.����> ");
			input=sc.nextInt();
			if(input==0)break;
			if(input==1) {
				System.out.println("-------------------------------");
				System.out.println("�й�\t����\t����\t����");
				System.out.println("-------------------------------");
				Iterator<Stu> ite = data.iterator();
				while(ite.hasNext()) {
					Stu stu=ite.next();
					System.out.print(stu.num+"\t");
					System.out.print(stu.kor+"\t");
					System.out.print(stu.eng+"\t");
					System.out.print(stu.math+"\n");
				}
			}
			if(input==2) {
				Stu stu=new Stu();
				System.out.print(arr[0]+"> ");
				input=sc.nextInt();
				stu.num=input;
				System.out.print(arr[1]+"> ");
				input=sc.nextInt();
				stu.kor=input;
				System.out.print(arr[2]+"> ");
				input=sc.nextInt();
				stu.eng=input;
				System.out.print(arr[3]+"> ");
				input=sc.nextInt();
				stu.math=input;
				boolean result=data.add(stu);
				if(!result)System.out.println("�ߺ�");
			}
		}
	}

}











