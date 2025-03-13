package com.pm;

import java.util.*;

/*
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
public class Ex06 {
    public static int order;
    public static Scanner sc = new Scanner(System.in);
    public static String[][] scores;
    public static int curStudents = 0; // 현재까지 입력된 학생 수

    public static void main(String[] args) {
        System.out.println("학생성적관리프로그램 (ver 0.3.0)");
        System.out.println("총원> ");
        int totalNum = sc.nextInt();
        scores = new String[totalNum][];
        boolean boo = true;
        while (boo) {
            System.out.print("1. 입력 2. 출력 0. 종료> ");
            order = sc.nextInt();
            if (order == 0) boo = false;
            else if (order == 1) {
                if (curStudents < totalNum) inputScore();
                else System.out.println("총원에 도달했습니다");
            } else if (order == 2) outputScore();
        }
    }

    public static void inputScore() {
        // 1. 입력받기
        System.out.println("국어 영어 수학 순서대로 점수를 입력해주세요(예시: 89 91 97)");
        sc.nextLine(); // 이전에 입출력 모드 결정하는 숫자 입력 받을 때 내가 엔터 친 거를 nextInt는 처리 안하고 남겨둔다
        // 그래서 하나 빼줘야 함...
        String[] scoreValues = sc.nextLine().split(" ");
        // split으로 나눠서 scores에 넣어줄까? 아니면 문자열끼리 더해버릴까?
        // 아니면 input을 한번에 받지 말고 앞에서처럼 따로 받아서 문자열끼리 더해버릴까?
        // 딱 3과목 입력 들어왔을 때만!!
        if (scoreValues.length == 3) {
            scores[curStudents][0] = scoreValues[0];
            scores[curStudents][1] = scoreValues[1];
            scores[curStudents][2] = scoreValues[2];
            
            // 학생 수 증가시키기
            curStudents+= 1;
        } else {
            System.out.println("입력 형식을 확인해주세요");
        }
    }

    public static void outputScore() {
        System.out.println(Arrays.toString(scores)); // Str 배열은 그냥 출력 불가
        if (curStudents == 0) {
            System.out.println("입력된 학생 정보가 없습니다");
            return;
        }
    }
}
