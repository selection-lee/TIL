package com.am;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

public class Ex02 extends Frame{
	
	// 1. ��ġ������ - ȭ�鱸��
	// 2. ������Ʈ ����,Ư��
	// 3. �̺�Ʈ ó��
	
	public Ex02() {
//		java.awt.FlowLayout layout=new FlowLayout();
		// FlowLayout
		// - ���η� �߾ӹ�ġ
		// - ���η� ���ι�ġ
		// - ������ ����, ���� �Ұ��� �����ٷ�
		// - ������Ʈ�� ������� ���뿡 ���� ����
		java.awt.GridLayout layout=new GridLayout(4,2);
		// �ڸ� Ȯ�� 1arg>2arg
		// �ڸ� ��ġ 1arg<2arg
		// 1 arg - ���ο�
		// 2 arg - ������
		this.setLayout(layout);
		
		java.awt.Button btn1=new Button("Button01");
		java.awt.Button btn2=new Button("Button02");
		java.awt.Button btn3=new Button("Button03");
		java.awt.Button btn4=new Button("Button04");
		java.awt.Button btn5=new Button("Button05");
//		java.awt.Button btn6=new Button("Button06");
//		java.awt.Button btn7=new Button("Button07");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
//		this.add(btn6);
//		this.add(btn7);
		
		this.setLocation(1920+500, 300);
		this.setSize(400, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
