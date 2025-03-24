package com.am;

import java.awt.*;

public class Ex02 extends Frame{
    // 1. 배치관리자  화면구성
    // 2. 컴포넌트 종류, 특성
    // 3. 이벤트 처리
    public Ex02() {
        java.awt.FlowLayout layout = new FlowLayout();
        java.awt.GridLayout gridLayout = new GridLayout(3,2); // row, col 안넣으면 걍 가로로 한 줄 쭉
        // 우선순위: 1 arg > 2arg
        // FlowLayout
        // - 가로로 중앙배치
        // - 세ㅐ로로 위로배치
        // - 옆으로 정렬, 만일 불가시 다음줄로
//        this.setLayout(layout);
        this.setLayout(gridLayout);
        java.awt.Button btn1 = new Button("btn1");
        java.awt.Button btn2 = new Button("btn2");
        java.awt.Button btn3 = new Button("btn3");
        java.awt.Button btn4 = new Button("btn4");
        java.awt.Button btn5 = new Button("btn5");
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(btn5);

//        this.setLocation(1920, 300);
        this.setSize(400,300);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Ex02(); // 객체를 GUI를 통해 눈으로 보고 원하는대로 핸들링 가능.
    }
}
