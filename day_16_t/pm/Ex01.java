package com.pm;

import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Panel;

public class Ex01 extends Frame{
	TextField tf;
	Button btn;
	Panel p;
	
	class MyListen implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
//			System.out.println("Ŭ��");
//			tf.setText("");
//			tf.setText("");
//			tf.revalidate();
			System.out.println(e.getSource());// �̺�Ʈ�� �Ͼ ������Ʈ �ڽ�
			Component com=e.getComponent();
//			Frame me=(Frame) e.getSource();
//			me.dispose();
			System.out.println(e.getX()+","+e.getY());
			System.out.println(e.getXOnScreen()+","+e.getYOnScreen());
			if(btn==e.getSource())System.out.println("��ư");
			if(p==e.getSource())System.out.println("panel");
			}

		@Override
		public void mousePressed(MouseEvent e) {
//			System.out.println("������");
			}

		@Override
		public void mouseReleased(MouseEvent e) {
//			System.out.println("�����������οö�ö�");
			}

		@Override
		public void mouseEntered(MouseEvent e) {
//			System.out.println("������Ʈ ���ʷ�");
			}

		@Override
		public void mouseExited(MouseEvent e) {
//			System.out.println("������Ʈ ������");
		}
		
	}

	public Ex01() {
		p=new Panel();
		tf=new TextField("�ʱⰪ");
		btn=new Button("click");
		p.add(tf);
		p.add(btn);
		add(p);
		p.addMouseListener(new MyListen());
		btn.addMouseListener(new MyListen());
		setBounds(1920+100,100,400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex01();

	}

}
