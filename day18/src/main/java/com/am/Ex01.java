package com.am;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex01 extends Frame implements ActionListener{
    public Ex01() {
        setBounds(100,100,500,300);
        Button button = new Button("your name");
        button.addActionListener(this);
        add(button);
        setVisible(true);
    }
    public static void main(String[] args) {
        // 쓰레드
        new Ex01();
        System.out.println(Thread.currentThread().getName()); // main // 사실 main은 이러고 끝나는 것.

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(Thread.currentThread().getName());
    }

}
