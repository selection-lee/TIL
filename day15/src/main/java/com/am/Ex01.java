package com.am;

import javax.swing.*;

public class Ex01 extends javax.swing.JFrame { // java.awt.Frame{
    public static void main(String[] args) {
        // awt
        // java 초기 gui
        // 운영체제 종속
        // 자바가 직접 x
        // os 지원외 한계
        // 어디까지나 ui를 제공해줄 뿐, 기능을 붙이는 건 개발자가 직접 코딩해야 함.
        // 심지어 x버튼 누르면 꺼지게 하고싶어도 이벤트를 적어줘야 함.
        // 최소화, 최대화만 제공됨
        Ex01 me = new Ex01();
        // extends 받지 않을 경우
        // java.awt.Frame me = new Frame(); 으로 새로운 객체 만들어주면 됨!!!
        me.setVisible(true);
        // swing
        // awt 다음 gui
        // 운영체제 비종속
        // java가 직접 제작
        // os 지원 외의 기능도 직접 구현
        javax.swing.JFrame me2 = new JFrame();
        me2.setVisible(true);
    }
}
