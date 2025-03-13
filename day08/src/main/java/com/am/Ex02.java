package com.am;

public class Ex02 {
    public static void main(String[] args) {
        // 정보은닉 by 접근제한자
        com.am.Ex01.func01();
        com.am.Ex01.func02();
//        com.am.Ex01.func03(); // private이라서 안 됨 - 외부 접근 불허
        

        System.out.println(Ex01.su1);
        System.out.println(com.am.Ex01.su2);
//        com.am.Ex01.su3; // private 이라서 안 됨
    }
}
