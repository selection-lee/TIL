package com.pm;

public class Ex04 {
    // 문자열검사
    public static void main(String[] args) {
//        String hi = "Hello world";
        String hi = "한";
        String hi2 = "Hello world";
        System.out.println(hi.startsWith("He")); // true
        System.out.println(hi.endsWith("ld")); // true
        System.out.println(hi.startsWith("he")); // false
        System.out.println(hi.endsWith("l")); // false
        System.out.println(hi == "Hello world"); // true
        System.out.println(hi.equals("Hello world")); // true

        byte[] arr1 = hi.getBytes();
        char[] arr2 = hi.toCharArray();
        System.out.println(arr1.length); // 11 // 3 -> utf-8. // 2->ms-949
        System.out.println(arr2.length); // 11 // 1
        // 우리나라는 ANSI로 하면 디폴트로 ms-949인데,
        // 요즘은 어디서든 안깨지고 똑같은 글씨보려고 utf-8 - 그만큼 많은 용량 필요하니까 3바이트 체계로..
        // 영어권국가는 사실 한글 한자 쓸 일 없으니까 한글자당 3bytes씩 쓰면 2바이트 날리니까 비효율적
        // 그래서 우리가 사용하는 문자 체계 format들은 가변형 길이. 아스키코드로 표현되는건 1byte, 넘어가면 2나 3byte...
        System.out.println("----------------------");
        char[] arr3 = new char[hi2.length()];
        hi2.getChars(0, 11, arr3, 0);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
        }
    }
}
