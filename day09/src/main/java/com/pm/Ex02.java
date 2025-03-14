package com.pm;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
    // 학생성적관리프로그램 (ver 0.5.0) - 배열
    // 학생성적관리프로그램 (ver 0.6.0) - String
    // 학생성적관리프로그램 (ver 0.7.0) - Student 객체
    // 1.보기 2.입력 3.수정 4.삭제 0.종료
    // 수정: // 수정할 학번> // 국> 수> 영>
    // 삭제: // 삭제할 학번> 바로 삭제.

    public static Scanner sc = new Scanner(System.in);
    public static int[][] student;
    public static int studentNum = 0;
    // 학생성적관리프로그램 (ver 0.5.0) - 배열
    public static void main(String[] args) {
        System.out.println("학생성적관리프로그램 (ver 0.5.0) - 배열");
        System.out.print("총원> ");
        int totalNum = sc.nextInt();
        student = new int[totalNum][];

        boolean boo =true;
        while (boo) {
            System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료> ");
            int input = sc.nextInt();
            // 1. 종료조건
            if (input == 0) boo = false;
            else if (input == 2) {
                // 입력
                inputScore();
            } else if (input == 1) {
                // 출력
                outputScore();
            } else if (input == 3) {
                // 수정
            } else if (input == 4) {
                // 삭제
            }
        }
    }
    
    public static void inputScore() {
        // 국어 영어 수학
        System.out.print("국어> ");
        int kor = sc.nextInt();
        System.out.print("영어> ");
        int eng = sc.nextInt();
        System.out.print("수학> ");
        int math = sc.nextInt();
        // 학번, 성적을 저장할 배열이 필요하겠다
        student[0] = new int[]{++studentNum, kor, eng, math};
    }
    /*
    출력
     */
    public static void outputScore() {
        System.out.println("--------------------------------------------------");
        System.out.println("학번\t|국어\t|영어\t|수학\t|합계\t|평균\t");
        System.out.println("--------------------------------------------------");
        int scoreSum = sumRow(student, studentNum-1);
        double avg = scoreSum *100 / 3 / 100.0;

        System.out.println(student[studentNum-1][0]+ "\t\t|" + student[studentNum-1][1]+ "\t\t|" + student[studentNum-1][2] + "\t\t|" + student[studentNum-1][3] + "\t\t|" + scoreSum  + "\t|" + avg);
    }
    // 학생 점수 합
    public static int sumRow(int[][] arr, int stdIndex) {
        int sum = 0;
        for (int i = 1; i < arr[stdIndex].length; i++) {
            sum+= arr[stdIndex][i];
        }
        return sum;
    }
}
