package com.pm;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        System.out.println("주민번호 체크기 (ver 0.2.0)");
        System.out.println("----------------------------");

        int age = 0;
        char gender = '@';
        Scanner sc = new Scanner(System.in);
        boolean boo = true;
        while (boo) {
            System.out.print("주민번호> ");
            String input = sc.nextLine();
            // 포맷 확인 -> 하이픈 기준으로 작르자
            String[] data = input.split("-"); // - 없으면 data의 길이가 2인데, 그렇지 않으면 잘못된 것
            if (data.length == 2) {
                // 하이픈 존재
                // 위치가 정확한지도 판별해야
                if (data[0].length() == 6 && data[1].length() == 7) {
                    // 하이픈 위치 정확함
                    // 숫자로만 구성되어 있어야 함
                    boolean isNotNum = false; // break, continue 없는 언어에서는 어쩌려고 의존해 자꾸! 귀찮긴해도 없이 하는 것도 연습해보자.
                    for (int j = 0; j < 2 && !isNotNum; j++) {
                        for (int i = 0; i < data[j].length() && !isNotNum; i++) {
                            char ch = data[j].charAt(i); // i번째가 숫자인지 찾기위해
                            if (ch < '0' || ch > '9') {
                                // 숫자가 아닌 것
                                isNotNum = true;
                            }
                        }
                    }
                    if (!isNotNum) {
                        char ch7 = data[1].charAt(0);
                        if (ch7 % 2 == '1' % 2) gender = '남'; //1 or 3
                        if (ch7 % 2 == '2' % 2) gender = '여'; // 2 or 4
                        // (ch % 2 == '1' % 2) => ch7 % 2 == 1 
                        // ch를 2로 나눈 나머지가 1인가? 
                        // ch가 '1'(유니코드로 49) or '3' (유니코드 51) 일 때 참
                        // ch를 굳이 char에서 int로 변환할 필요 없이 char % int끼리 비교하는구나
                        int year = 1900 + (data[0].charAt(0) - '0') * 10 + data[0].charAt(1) - '0';
                        // '9'-'0' = 9 (유니코드 57 - 48 = 9) ex) 주민번호가 990000으로 시작할 때
                        if (ch7 > '2') year += 100;
                        age = 2025 - year - 1;
                        boo = false; // while문 탈출
                    } else {
                        System.out.println("포맷을 확인하세요");
                    }
                } else {
                    System.out.println("포맷을 확인하세요");
                }
            } else {
                System.out.println("포맷을 확인하세요");
            }
        }
        System.out.println(age + "세 " + gender + "입니다");
    }
}
