package com.am;

import java.util.Scanner;

public class Ex13 {
    // 학생 성적을 입력받고 총점과 학점을 출력하시오

    // 과목은 총 3과목으로 국영수
    // 각 과목 만점은 100점

    // 합계와 평균을 구하되 평균은 소수 둘째자리 까지만 출력
    // 학점은 A부터 F까지
    // A: 90 이상, B: 80 이상, C: 70 이상, D: 60 이상, F: 60 미만

    // 학생성적관리프로그램 (ver 0.1.0)
    // 국어> 90
    // 영어> 78
    // 수학> 89
    // ---------------------------
    // 국어\t| 영어\t | 수학\t | 합계\t | 평균\t | 학점\t
    // 90\t | 78\t | 89 \t | 000 | 00.00 | B

    public static void main(String[] args) {
        System.out.println("학생성적관리프로그램 (ver 0.1.0)");
        Scanner sc = new Scanner(System.in);
        int kor, eng, math;
        System.out.print("국어> ");
        kor = sc.nextInt();
        System.out.print("영어> ");
        eng=sc.nextInt();
        System.out.print("수학> ");
        math=sc.nextInt();
        // 합계
        int scoreSum = kor + eng + math;
        double scoreAvg = Math.round(scoreSum / 3.0*100)/100.0;
        // double avg = tot*100/3/100.0
//        System.out.println("sum "+ scoreSum + " avg "+ Math.round(scoreAvg * 100) / 100.0 );
        char grade = 'F';
        if (scoreAvg >= 90) grade = 'A';
        else if (scoreAvg >= 80) grade = 'B'; // 전부 if문으로 처리하고 grade += 1 이런 것도 가능!! 
        else if (scoreAvg >= 70) grade = 'C';
        else if (scoreAvg >= 60) grade = 'D';
        System.out.println("-----------------------------------------------");
        System.out.println("국어\t|영어\t|수학\t|합계\t|평균\t|학점\t");
        System.out.println("-----------------------------------------------");
        System.out.println(kor+"\t\t|"+eng+"\t\t|"+math+"\t\t|"+scoreSum+"\t|"+scoreAvg+"\t|"+grade+"\t");

        System.out.println("===============================================");
        // if문말고 switch문도 해보자
        System.out.println("학생성적관리프로그램 (ver 0.1.0)");
        // 1. 점수 입력받기
        getScores();
        // 2. 합계 구하기
        sumScore = korScore + engScore + mathScore;
        // 3. 평균 구하기
//        String avgScore = String.format("%.2f", sumScore / 3.0 ); => 강제형변환 안된다,,,
        avgScore = Math.round(sumScore / 3.0 * 100) / 100.0;
        // 4. 학점 구하기
        getGrade((int)avgScore);
        // 5. 성적표 출력
        printGrade();

    }

    public static int korScore, engScore, mathScore, sumScore;
    public static double avgScore;
    public static char totalGrade;
    
    // 점수 입력받기
    public static void getScores(){
        Scanner sc = new Scanner(System.in);
        System.out.print("국어> ");
        korScore = sc.nextInt();
        System.out.print("영어> ");
        engScore = sc.nextInt();
        System.out.print("수학> ");
        mathScore = sc.nextInt();
    }
    
    // 학점 구하기 - switch문 이용해보자
    public static void getGrade(int avg){
        // java8의 switch case문에서 조건은 범위로 지정이 불가능한데 어떻게 하지???
        // 어차피 100점과 90점대, 80점대, 70점대, 60점대, 그 이하만 필요한 거니까...
        // (int)avg / 10을 해서 몫만가져간다면?
        switch (avg/10) {
            case 10: // 어차피 100점이나 90점이나 똑같이 A니까 연달아 실행되어버리게!
            case 9:
                totalGrade='A';
                break;
            case 8:
                totalGrade='B';
                break;
            case 7:
                totalGrade='C';
                break;
            case 6:
                totalGrade='D';
                break;
            default:
                totalGrade='F';
                break;
        }
    }
    
    // 성적표 출력
    public static void printGrade() {
        System.out.println("-----------------------------------------------");
        System.out.println("국어\t|영어\t|수학\t|합계\t|평균\t|학점\t");
        System.out.println("-----------------------------------------------");
        System.out.println(korScore+"\t\t|"+engScore+"\t\t|"+mathScore+"\t\t|"+sumScore+"\t|"+avgScore+"\t|"+totalGrade+"\t");
    }
}
