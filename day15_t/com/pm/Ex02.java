package com.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.JLabel;


public class Ex02 {

	public static void main(String[] args) {
		Frame f=new Frame();
		Panel p=new Panel();
		
		Label la=new Label("����:");
		TextField tf=new TextField(10);
		Button btn=new Button("ã��");
		JLabel la2=new JLabel("����");
		p.add(la);
		p.add(tf);
		p.add(btn);
		p.add(la2);
		
		f.add(p);
		f.setLocation(1920+100, 100);
		f.setSize(300,300);
		f.setVisible(true);
	}

}
