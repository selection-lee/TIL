package com.pm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex09 extends Frame{
	
	public Ex09() {
		setLayout(new GridLayout(2,1));
		Panel p1=new Panel();
		Panel p2=new Panel();
		p2.setLayout(new BorderLayout());
		
		p1.setLayout(new GridLayout(5,1));
		FlowLayout fl =new FlowLayout();
		fl.setAlignment(FlowLayout.LEFT);
		Panel row1=new Panel(fl);
		row1.add(new Label("�̸�"));
		row1.add(new TextField(20));
		p1.add(row1);
		Panel row2=new Panel(fl);
		row2.add(new Label("���̵�"));
		row2.add(new TextField(20));
		p1.add(row2);
		Panel row3=new Panel(fl);
		row3.add(new Label("��й�ȣ"));
		row3.add(new TextField(20));
		p1.add(row3);
		Panel row4=new Panel(fl);
		row4.add(new Label("��ȭ��ȣ"));
		row4.add(new TextField(6));
		row4.add(new Label("-"));
		row4.add(new TextField(6));
		row4.add(new Label("-"));
		row4.add(new TextField(6));
		p1.add(row4);
		Panel row5=new Panel(fl);
		row5.add(new Label("���"));
		p1.add(row5);
		
		p2.add(new Label("�ϰ����ϴ¸�"),BorderLayout.NORTH);
		p2.add(new TextArea(),BorderLayout.CENTER);
		add(p1);
		add(p2);
		
		setLocation(1920+100,100);
		setSize(400,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex09();

	}

}
