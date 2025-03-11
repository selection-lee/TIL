package com.pm;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        String msg = "java";

//        msg = msg.toUpperCase();
//        System.out.println(msg);

        System.out.println("JAVA");

        System.out.println(msg == "JAVA"); // false : 주솟값으로 reference 비교
        System.out.println(msg.equals("JAVA")); // true: 내용물 비교

        // 이걸 직접 해보기.
        // 일단 char 배열로 바꾸기.
        char[] arr = msg.toCharArray();
        String res = "";
        // 'A'와 'a'의 간격은?
        int gap ='A' - 'a';
        for (char ch : arr) {
            System.out.print((char)(ch + gap)); // 무식하게 자꾸 세지 말라고ㅠㅠ
        }
        // 영어 소문자만 대문자로 바꾸고, 숫자눈 놔두기
        String msg2 = "java1234";
        char[] arr2 = msg2.toCharArray();

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] >= 'a' && arr2[i] <= 'z') arr2[i] += gap;
        }
        System.out.println();
        System.out.println(arr2);

        System.out.println("---------------");
        // ja + va
        String m1 = "ja", m2 = "va";
        String m1m2 = m1 + m2;
        String con = m1.concat(m2);
        System.out.println("+, concat: " + m1m2 + " " + con);
        // +, concat 안쓰고 how??
        char[] m1arr = m1.toCharArray();
        char[] m2arr = m2.toCharArray();
        char[] ans = new char[4];
//        char[] ans = new char[m1arr.length + m2arr.length]; // 이렇게 길이 더한 만큼의 길이로 선언
        for (int i = 0; i<m1arr.length; i++) {
            ans[i] = m1arr[i];
//            System.out.print("1: "+i);
//            System.out.println(m1arr[i]);
        }
        for (int i = m1arr.length; i < m1arr.length + m2arr.length; i++) {
            ans[i] = m2arr[i-m1arr.length];
//            System.out.print("2: "+i);
//            System.out.println(m2arr[i-m1arr.length]);
        }
        System.out.println("m1: "+ Arrays.toString(m1arr) + ", m2: " + Arrays.toString(m2arr));
        System.out.print("ans: ");
        System.out.println(ans);

        // cf
        System.out.println(Arrays.toString(ans) == msg + msg2);
        System.out.println(msg == msg + msg2);
        // toUpperStirng 이런 것도 자기 자신은 더하지 않음.
        // 윗줄도 아랫줄도 주솟값 비교 했더니 주소가 다르대.
        // 새로운 문자열을 리턴한 거라서.
        // String 클래슨느 기본적으로 자기 자신은 변하지 않는다.
        // ja를 가리키던 참조변수가, +"va"를 하면, java라는 새로운 객체를 만들어서 얘를 가리킴,,
//        for문안에서 msg5 += i; 하면,
//        i=0일때 msg5 = a0
//        i=1일 때 msg5=a01
        // ...
//        i=5 : msg5 = a012345
//        계속 msg5는 새로운 객체를 가리키고, 이전의 애들은 나중에 가비지콜럭터가 와서 수거해감
    }
}
