package com.am;

import java.util.*;

public class Ex06 {
    public static void main(String[] args) {
        // 제네릭 - 제약의 문법
        // 자율도를 오히려 높여준다. 제약을 함으로써.
        // jdk 1.5 이후로 등장.
        // 제네릭은 사실 컬렉션 framework 랑 상관이 없는데,
        // 컬렉션쪽이 제네릭 등장 후에 잘 활용하도록 발전한 것.
        // E element, K key , V value, T type , ...
        // E 이런 타입이 있다고 착각하게 되니까...오해의 소지 때문에 약속한 것
        // 암튼 원래 자리는 Object
        // List<Object> 였다느 뜻. 그니까 E K V T 다 원래 objcet인데 내가 <>로 타입을 제한할 수 있다는 뜻
        // 참조변수 타입(기본자료형이 안 됨)
//        List list = new ArrayList();
        List<String> list = new ArrayList<String>();
        list.add("첫");
        list.add("둘");
        list.add("셋");
//        list.add(333); // <String> 거는 순간 이건 제약이 됨
        list.add("넷");

        // Ex07하고나서 돌아와서 list sort하고 Comparator<Integer> 붙임
        // 긍까 제네릭만 붙여본 것
        for (int i = 0; i < list.size(); i++) {
            // String msg = list.get(i); // 제네릭 없으면 Object로 제공되는구나... 그래서에러
//            String msg = (String)(list.get(i)); // 제네릭을 적요하면 이제 캐스팅 필요없어짐
            String msg = list.get(i); // 그니까 이제 숫자로 집어넣엇으면 숫자로 바로 꺼내쓸 수 있고, 문자열이면 문자열 바로,,,
            System.out.println(msg);
        }

        // 참고로 타입자리에 int는 안 됨
        // generic은 반드시 참조변수 타입이어야 함
        // List<int> list = new ArrayList<int>(); // 이런거 안된다는 ㄷ쓰
        // Integer, Boolean, Double,,, 이런식으로 대문자 참조변수 타입 써야 함

        // collection framework에서는 그냥 캐스팅오류 많이 발생하니까 
        // 원천적으로 봉쇄하려고 걍 우리는 제네릭 무조건 쓰자
    }

    static class Ball implements Comparable<com.am.Ball> {
        @Override
        public int compareTo(com.am.Ball o) {
            return 0;
        }
    }
}
