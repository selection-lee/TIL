package com.pm;

public class Ex03 {
    // String 함수(?) 써서 CRUD
    // Ex04
    public static void main(String[] args) {
        // CRUD
        String msg = "ABCDabcd1234";
        System.out.println(msg.length());
        System.out.println(msg.contains("bc"));
        System.out.println(msg.charAt(4));
        msg = msg.replace("abcd", "aBCd");
        System.out.println(msg);
        msg = msg.replace("aBC", "a");
        System.out.println(msg);
        msg = msg.concat("!@#$");
        System.out.println(msg);

        System.out.println(msg.contains("bc"));
    }
}
