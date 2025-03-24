package com.pm;

import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ex11 extends Frame{
	
	public Ex11() {
		setLayout(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=0.1;
		
		for(int i=0; i<9; i++) {
			gbc.gridx=i;
			add(new Label(),gbc);
		}
		gbc.weighty=1.0;
		gbc.gridx=0;
		gbc.gridy=1;
		add(new Label("�̸�"),gbc);
		gbc.gridx=1;
		gbc.gridwidth=8;
		add(new TextField(),gbc);
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		add(new Label("���̵�"),gbc);
		gbc.gridx=1;
		gbc.gridwidth=8;
		add(new TextField(),gbc);
		gbc.gridy=3;
		gbc.gridx=0;
		gbc.gridwidth=1;
		add(new Label("��й�ȣ"),gbc);
		gbc.gridx=1;
		gbc.gridwidth=8;
		add(new TextField(),gbc);
		gbc.gridy=4;
		gbc.gridx=0;
		gbc.gridwidth=1;
		add(new Label("��ȭ��ȣ"),gbc);
		gbc.gridx=1;
		gbc.gridwidth=2;
		add(new TextField(),gbc);
		gbc.gridx=3;
		gbc.gridwidth=1;
		add(new Label("-"),gbc);
		gbc.gridx=4;
		gbc.gridwidth=2;
		add(new TextField(),gbc);
		gbc.gridx=6;
		gbc.gridwidth=1;
		add(new Label("-"),gbc);
		gbc.gridx=7;
		gbc.gridwidth=2;
		add(new TextField(),gbc);
		gbc.gridy=5;
		gbc.gridx=0;
		gbc.gridwidth=1;
		add(new Label("���"),gbc);
		setLocation(1920+100,100);
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex11();

	}

}
