package com.am;

import java.awt.*;

public class Ex03 extends Frame{
    public Ex03() {
        BorderLayout mgr = new BorderLayout();
        setLayout(mgr);

        Button btn1 = new Button("North");
        add(btn1, "North"); // 어라.. label, const가 맨앞에꺼가 대문자가 아니면 에러나는데?


        setSize(500,400);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Ex03();
    }
}
