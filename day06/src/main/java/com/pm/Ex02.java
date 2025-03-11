package com.pm;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Ex02 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 주민번호 체크기(ver 0.1.0)
        // 주민번호를 입력> 990101-1234567
        // 당신은 27세 남성입니다.
        // 주민번호를 입력> 001010-4123456
        // 당신은 26세 여성입니다.
        /// /////////
        // 주만번호를 입력> 1234567897890
        // 입력포맷을 다시 확인하세요 ( 000000-0000000 )
        // 주민번호를 입력> 990101-1000
        // 입력포맷 ~ 
        // > aa234-234234234
        // 숫자만 입력하세요
        // 번외: 한글지원(구구공사이구)

        System.out.println("주민번호 체크기(ver 0.1.0)");
        chkIdNum();
    }

    public static void chkIdNum() {
        while (true) {
            // 1. input 받기
            System.out.print("주민번호를 입력> ");
            String input = sc.nextLine();
            // 2. 종료조건
            if (Objects.equals(input, "0")) break;
//            System.out.println(input);

            // 3. 형식이 맞는지 체크하기
            boolean form = chkFormat(input);
            if (!form) {
                // 입력포맷을 다시 확인하세요
                // 숫자만 입력하세요
                // 안내문구는 chkFormat에서 출력
                continue;
            } // 여길 넘어가면 포맷 맞는 것
            // 4. 나이 계산
            int age = calcAge(input);
            // 5. 성별 계산
            String gender = chkGender(input);
            // 6. 나이 성별 출력
            System.out.println("당신은 " + age + "세 " + gender + "입니다");
        }
    }

    public static boolean chkFormat(String id) {
        // '-'가 7번째칸 - 6번idx에 들어있는지
        // 길이가 맞는지(- 앞에 6자리, - 뒤에 7자리)
        // 숫자만 있는지(ex. a09090-10000000)
        // 년도가 알맞은 날짜인지(993041 이런거 아닌지...도 가능한가?)
        // 번외: 한글지원
        char[] idArr = id.toCharArray();
        // 1. '-'
//        if ('-' not in id and idArr[6] != '-') return false;
        // idArr[6]: char, '-'도 char로 비교해야 함
        // contains는 문자열 메서드 -> 문자열 파라미터 "" 받아야 함
        if (!id.contains("-") || idArr[6] != '-') {
            System.out.println("입력 포맷을 다시 확인하세요 (000000-0000000)");
            return false;
        }
        // 2. 길이
        if (id.length() != 14) {
            System.out.println("입력 포맷을 다시 확인하세요 (000000-0000000)");
            return false;
        }
        // 3. 숫자 아닌 거 있는지
//        boolean isDigit = true;
//        for (char ch : idArr) {
//            if (!Character.isDigit(ch)) {
//                System.out.println("숫자만 입력하세요");
//                return false;
//            }
//        }
        // 이렇게 foreach로 돌면 '-' 때문에 숫자만 입력하라고 나온다;;;;;
        for (int i = 0; i < 14; i++) {
            if (i == 6) continue; // '-'는 패스
            if (!Character.isDigit(idArr[i])) {
                System.out.println("숫자만 입력하세요");
                return false;
            }
        }

        return true;
    }

    public static int calcAge(String id) {
        // 올해 년도(2025) - 주민번호 앞자리 두자리(0,1,2로 시작하면 20+nx, 나머지는 19+nx)
        // 1. 오늘 날짜
        LocalDate today = LocalDate.now();
        int year = today.getYear();
//        System.out.println("Year: " + year);
        // 2. 태어난 년도
        char[] idArr = id.toCharArray();
        int born = 0;
        // 2.1 8번째가 3,4면 앞에 20, 1,2면 앞에 19
        if (idArr[7] == '3' || idArr[7] == '4') born = 2000;
        else born = 1900;
//        System.out.println("born=" + born);
        // 뒤에 두 자리를 idArr[0], idArr[1]을 더해줘야 함.
//        System.out.println("idArr: " + Arrays.toString(idArr));
//        System.out.println("주민번호 년도: "+ (int)idArr[0] + " " + (int)idArr[1]);
        int gap = '9' - 9;
//        System.out.println(gap);
//        System.out.println(" 처리한 년도: " + (int)(idArr[0] - gap));
        born += (int) (idArr[0] - gap) * 10 + (int) (idArr[1] - gap);
//        System.out.println("born+idArr: " + born);
        int age = year - born + 1;
//        System.out.println("나이: " + age);
        return age;
    }

    public static String chkGender(String id) {
        // 8번째가 2,4면 여성. 1,3이면 남성
        char[] idArr = id.toCharArray();
        int gap = '9' - 9;
        if ((int) (idArr[7] - gap) % 2 == 0) return "여성";
        else return "남성";
    }
}
