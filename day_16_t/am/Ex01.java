package com.am;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class Ex01 {

	public static void main(String[] args) {
		Frame f=new Frame();
		
		Toolkit kit=Toolkit.getDefaultToolkit();
//		kit.beep(); // 비프음을 들려줌
		Image img = kit.getImage("logo.jpg");
		f.setIconImage(img);
		System.out.println(kit.getScreenSize());
		int winW=1280;//kit.getScreenSize().width;
		int winH=960;//kit.getScreenSize().height;
		
		Dimension dim=new Dimension(400,300);
		f.setLocation(1920+winW/2-dim.width/2,winH/2-dim.height/2);
		f.setSize(dim);
		f.setVisible(true);

	}

}
