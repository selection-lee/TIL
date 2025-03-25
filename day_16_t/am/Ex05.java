package com.am;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;



public class Ex05 extends Frame {
	static Ex05 me;
	static Dialog dia;
	
	static class MyListener implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			System.out.println("â����");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("â�ݱ��ư����");
//			dia.setVisible(true);
////			System.exit(0);
			me.dispose();//UI���� ��û
		}

		@Override
		public void windowClosed(WindowEvent e) {
			System.out.println("UI����� �����۾�");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			System.out.println("������ȭ-�ּ�ȭ��");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			System.out.println("�������ȭ-�ּ�ȭ���� Ǯ��");
		}

		@Override
		public void windowActivated(WindowEvent e) {
			System.out.println("Ȱ��ȭ");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			System.out.println("��Ȱ��ȭ");
		}
		
	}

	public Ex05() {
		WindowListener listener=new MyListener();
		addWindowListener(listener);
		setBounds(1920+600,100,300,200);
		setVisible(true);
		
		dia=new Dialog(this);
		dia.addWindowListener(listener);
		dia.setBounds(1920+600,500,200,200);
//		dia.setVisible(true);
	}
	public static void main(String[] args) {
		me=new Ex05();
//		Scanner sc=new Scanner(System.in); sc.nextLine();
		System.out.println("main return �� - ��Ƽ������ - �����۾�");
	}

}













