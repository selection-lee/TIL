package com.am;

public class Ex06 {
    public static void main(String[] args) {
        // 문자열
        String msg1;
        msg1 = "java";
        String msg2 = "java";
        String msg3 = new String("java"); // 정말 필요하지 않은 이상은 쓰지 않는 게 낫다. 비효율적으로 쓰게 되고, 추후 문제 발생 가능성도 잇다.
        // 배열이랑 문자열은 다른 언어에서도 인정받을정도로 잘 만들어졌다
        // 주솟값 비교
        System.out.println(msg1 == msg2); // true
        System.out.println(msg2 == msg3); // false
        // 1,2는 같은 객체
        // 2,3은 다른 객체
        // call by value & reference 차이.
        
        // 내용물 비교
        System.out.println(msg3.equals(msg2)); // true

        // char 배열로 뽑아낼 수 있다.
        char[] arr1 = msg1.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
