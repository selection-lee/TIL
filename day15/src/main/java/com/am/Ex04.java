package com.am;

import java.awt.*;
import java.util.Scanner;

public class Ex04 extends Frame{
    public Ex04() {

    }

    public static void main(String[] args) {
        Ex04 me= new Ex04();
        CardLayout mgr = new CardLayout();

        me.setLayout(mgr); // 이거 하기 전에는 btn4가 제일 위에 있었는데,
        // 적용하고 나니까 btn1이 맨 위로 올라와서 얘만 보임.

        me.add(new Button("btn1"));
        me.add(new Button("btn2"));
        me.add(new Button("btn3"));
        me.add(new Button("btn4"));

        me.setSize(300,500);
        me.setVisible(true);
        Scanner sc = new Scanner(System.in);

        while (true) {
            sc.nextLine(); // 대기하고 있다가 입력 들어오면 btn 순서가 바뀐다...!!
            mgr.next(me);
        }
    }
}
