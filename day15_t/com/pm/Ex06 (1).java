package com.pm;

import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;

public class Ex06 extends Frame{
	
	public Ex06() {
		Panel p=new Panel();
		
		Checkbox box1=new Checkbox("item1",false);
		Checkbox box2=new Checkbox("item2",true);
		Checkbox box3=new Checkbox("item3",true);
		
		p.add(box1);
		p.add(box2);
		p.add(box3);
		
		add(p);
		setLocation(1920+100,100);
		setSize(300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex06();

	}

}
