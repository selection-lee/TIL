package com.pm;


import java.lang.*; // 컴파일 할 때 패키지 안 붙은 ㄴ애들은 그냥 다 이거 붙여버림
import java.nio.charset.Charset;

public class Ex03 {
    public static void main(String[] args) {
        java.lang.String msg = "hello world";
//        String msg1 = new String();
        String msg1 = new String("java자바".getBytes(), Charset.forName("utf-16"));;//내가못알아보게출력됨(지금 내컴은 utf-8이라서)
        String msg2 = new String(new char[] {'a','b','c'});
        String msg3 = new String(new byte[] {65,66,67}); // 출력: ABC
        String msg4 = new String(msg);// hello world
                //생성자의 4가지 종류? 문자열의 4가지 종류 아니고..?
        java.lang.System.out.println(msg);
        java.lang.System.out.println(msg1);
        System.out.println(String.CASE_INSENSITIVE_ORDER);
        System.out.println(msg.charAt(1));
        System.out.println(msg.concat("!!!"));
        System.out.println(msg);
        String msg5="ja";
        String msg6="va";
        String msg7 = "java";
        String msg8 = "java"; // "ja"+"va"; 이것도 아래에서 true 처리 // 이것도 소스 스캐닝하면서 우선적으로 처리 해버리니까.
        String msg9 = new String("java");
        String msg10=msg5+msg6;
        String msg11 = msg5.concat(msg6);
        System.out.println(msg7); // java
        System.out.println(msg8); // java
        System.out.println(msg9); // java
        System.out.println(msg7 == msg8); // true
        System.out.println(msg7 == msg9); // false
        System.out.println(msg7 == msg10); // false
        System.out.println(msg7 == msg11); // false
        // 실행하면 소스코드 스캐닝부터 하기 때문!
    }
}
