package com.pm;

import java.util.Enumeration;
import java.util.Vector;

public class Ex09 {

	public static void main(String[] args) {
		// Vector
		Vector list=new Vector();
		list.addElement("ù��°");
		list.addElement("�ι�°");
		list.addElement("����°");
		list.addElement("�׹�°");

//		System.out.println(list.elementAt(0));
//		System.out.println(list.elementAt(1));
//		System.out.println(list.elementAt(2));
//		System.out.println(list.elementAt(3));
		
		Enumeration enu=list.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		enu=list.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}

}







