package com.am;
// 학생 성적 관리 프로그램(ver 0.3.0) - 문자열
/*
3과목(국,영,수)
총원> 3
1. 입력 2. 출력 0. 종료> 1
국어>
영어>
수학>
1. 입력 2. 출력 0. 종료> 2
--------------------------------------------------
학번 | 국어 | 영어 | 수학 | 합계 | 평균
--------------------------------------------------
1    | 90   |91    |92    |000
1. 입력 2. 출력 0. 종료> 1
국,영,수 입력
>>> 2
또 한명 늘은 거 출력
*/

import java.util.*;

public class hw {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("학생 성적 관리 프로그램(ver 0.3.0) - 문자열");
        System.out.print("총원> ");
        int totalNum = sc.nextInt();

        boolean boo = true;
        while (boo) {
            System.out.println("1.입력 2.출력 0.종료> ");
            int order = sc.nextInt();
            // 종료조건
            if (order == 0) {
                boo = false;
                System.out.println("종료");
            } else if (order == 1) {
                System.out.println("입력");
            } else if (order == 2) {
                System.out.println("--------------------------------------------------");
                System.out.println("출력");
            }
        }
    }

    public static void inputScore() {

    }
}
