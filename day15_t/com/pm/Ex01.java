package com.pm;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.util.Scanner;

public class Ex01 extends Frame{
	
	public Ex01() {
		Panel p=new Panel();
		TextField tf=new TextField("�⺻��",10);//���ڰ���(���Ʈ)
//		tf.setText("����");
		System.out.println(tf.getText());
//		tf.setFont(new Font("",0,50));
//		tf.setBackground(c);
//		tf.setForeground(c);
		tf.setEchoChar('#');
		
		p.add(tf);
		add(p);
		setLocation(1920+100,100);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex01 me=new Ex01();
	}

}
