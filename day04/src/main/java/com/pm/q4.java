package com.pm;

import java.util.*;

public class q4 {
    public static void main(String args[]) {
        System.out.println("상품, 단가, 개수를 입력하세요(마무리는 0 입력): ");
        System.out.println("예시: 사탕 300 2");

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
//        sb.append(sc.nextLine());
        while (true) {
            // 1. 종료 조건
            // https://okeybox.tistory.com/431#Call%20by%20Value%20(%EA%B0%92%EC%97%90%20%EC%9D%98%ED%95%9C%20%ED%98%B8%EC%B6%9C)-1
            // https://velog.io/@1299/Call-by-Value-vs-Call-by-reference
            // '=='는 call by reference로 주소값을 비교
            // equals 메소드는 call by value로 대상의 값 자체를 비교
            if (sb.equals("0")) { break;}
            // 2.
        }

        System.out.println("---------------------------------");
        System.out.println("msa 영수증");
        System.out.println("---------------------------------");
        System.out.println(sb);
        
    }
}
