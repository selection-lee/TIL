package com.pm;

import java.util.Arrays;
import java.util.Scanner;

/*
학생성적관리프로그램 (ver 0.2.0) - 배열
학생성적관리프로그램 (ver 0.3.0) - 문자열 -> 얘는 동적할당 하면 되니까? 동적할당이니까? 사실 총원 필요 x
3과목(국,영,수)
- 배열 -
(시간 남으면 3. 수정, 4. 삭제까지)
(시간 또 남으면 배열 이용해서 동적할당)
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
public class Ex05 {
    public static Scanner sc = new Scanner(System.in);
    public static int[][] scores; // 성적만 ([학번][과목번호])
    public static int curStudents = 0; // 현재까지 입력된 학생 수

    public static void main(String[] args) {
        System.out.println("학생성적관리프로그램 (ver 0.2.0) - 배열");
        System.out.print("총원> ");
        int totalNum = sc.nextInt();
        // 아하 내가 선언만 하고 초기화를 안했구나
        scores = new int[totalNum][3]; // 안하고 그냥 input에서 갖다썼더니 nullPointerException 뜸
//        scores = new int[totalNum][]; => 이래야 null로 시작. 안그러면 {{0,0,0}*3} 으로 초기화되어서 시작됨,,
        // 근데 그러면 인덱스로 접근을 못하니까, 객체 생성할 필요 없고, stu[idx]
        // null을 가리키는 포인터가 발생한다는 뜻

        boolean boo = true;
        while (boo) {
            System.out.print("1.입력 2.출력 0.종료> ");
            int order = sc.nextInt();

            // 1. 종료조건: 0
            if (order == 0) boo = false;
            
            // 2. 입력
            else if (order == 1) {
                if (curStudents < totalNum) inputScore();
                else System.out.println("총원이 초과되었습니다");
            } else if (order == 2) { // 3. 출력
                outputScore();
            }
        }

    }

    public static void inputScore() {
        // 학생 정보 담을 배열
        // 국어, 영어, 수학 점수도 한번에 ㄱㄱ?
        // 점수 따로, 학생 수 따로
        // 1. 점수 입력 받고 배열에 저장
        System.out.print("국어> ");
        scores[curStudents][0] = sc.nextInt();
        System.out.print("영어> ");
        scores[curStudents][1] = sc.nextInt();
        System.out.print("수학> ");
        scores[curStudents][2] = sc.nextInt();

        curStudents += 1; // 학생 수 추가
        // data[curStudents++] = stu;

        System.out.println(Arrays.deepToString(scores));
    }

    public static void outputScore() {
        // 출력
        System.out.println("--------------------------------------------------");
        System.out.println("학번\t|국어\t|영어\t|수학\t|합계\t|평균\t");
        System.out.println("--------------------------------------------------");
        // curStudents 수 만큼만 배열 돌면서 출력 ㄱㄱ
        for (int i = 0; i < curStudents; i++) {
            int scoreSum = scoreSum(scores[i][0],scores[i][1],scores[i][2]);
            double avg = scoreAvg(scoreSum);
            // 학번, 국, 영, 수, 합, 평
            System.out.println((i + 1) + "\t\t|" + scores[i][0]+ "\t\t|" + scores[i][1]+ "\t\t|" + scores[i][2] + "\t\t|" + scoreSum + "\t|" + avg);
        }
    }

    public static int scoreSum(int a, int b, int c) {
        return a + b + c;
    }

    public static double scoreAvg(int s) {
//        return s  * 100 / 3 / 100.0;
        return s / 3.0;
    }
}
