package com.am;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ex04 extends Frame{
	
	public Ex04() {
		
		MenuBar bar=new MenuBar();
		Menu mn1=new Menu("ù��°");
		MenuItem mi1=new MenuItem("1��°");
		MenuItem mi2=new MenuItem("2��°");
		
		Menu mi3=new Menu("3��°");

		MenuItem mi4=new MenuItem("1��°");
		CheckboxMenuItem mi5=new CheckboxMenuItem("2��°");
		mi3.add(mi4);
		mi3.add(mi5);
		
		mn1.add(mi1);
		mn1.add(mi2);
		mn1.addSeparator();
		mn1.add(mi3);
		bar.add(mn1);
		bar.add(new Menu("�ι�°"));
		bar.add(new Menu("����°"));
		bar.add(new Menu("�׹�°"));
		
		this.setMenuBar(bar);
		setBounds(1920+100,100,500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();
	}

}
