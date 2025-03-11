package com.am;

import java.util.Scanner;

class Student {
    public int kor, eng, math, tot;
    public double avg;
    public Student(int a, int b, int c) {
        kor = a;
        eng = b;
        math = c;
        setTot();
    }

    public void setTot() {
        tot = kor + eng + math;
    }

    public void setAvg() {
        avg = tot * 100 / 3 / 100.0;
    }

    public void show() {
        System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg);
    }
}

public class Ex03 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int kor = userInput("국어");
        int eng = userInput("영어");
        int math = userInput("수학");
        Student stu = new Student(kor,eng,math);
        System.out.println("--------------------");
        System.out.println("국어\t영어\t수학\t합계\t평균");
        System.out.println("--------------------");
        System.out.println(stu.kor + "\t" + stu.eng + "\t" + stu.math + "\t" + stu.tot+ "\t" + stu.avg);
        // 문법을 억지로 쓰면 이렇게 됨.
        // 그럼 그 의의를 살려서 만들면?
        System.out.println("--------------------");
    }

    public static Scanner sc = new Scanner(System.in);
    public static int userInput(String msg) {
        System.out.println(msg+"> ");
        return sc.nextInt();
    }
}
