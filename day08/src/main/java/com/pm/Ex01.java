package com.pm;

import com.am.Ex03;

public class Ex01 {
    public static void main(String[] args) {
        com.am.Ex01.func01();
//        com.am.Ex01.func02(); // default도 안 됨 - 패키지가 달라 접근 불허
//        com.am.Ex01.func03();
        System.out.println(com.am.Ex01.su1);
        // System.out.println(com.am.Ex01.su2); // 여기선 su2만 접근이 안 됨

        System.out.println(com.am.Ex03.su3);
        // System.out.println(com.am.Ex04.su4); // 여기선 클래스 자체가 접근이 안 됨
        // 클래스가 default라서 public 변수인데도 접근이 안 되고 디폴트처럼 동작이 됨
        // 아무리 필드,메서드에서 뭘 해놔도 클래스의 생성자 우선순위에 따라서 그 이하로만 작동!!
    }
}
