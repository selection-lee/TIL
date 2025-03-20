package com.am;

import java.util.*;

class Ball implements Comparable {
    int num;
    public Ball(int num){
        this.num=num;
    }
    @Override
    public int compareTo(Object obj) {
        // return 0;
        return ((Ball)obj).num-this.num;
    }

    @Override
    public String toString() {
        return "num= " + this.num;
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Set set1 = null;
        set1 = new HashSet();
//        set1 = new TreeSet();

        set1.add(11);
        set1.add(22);
        set1.add(33);
        set1.add("문자열"); // TreeSet에서는 문제생김
        // HashSet에서는 자료형 달라도 문제 안생김
        // 그래서 HashSet 추천
        set1.add(444);

//        set1.add(new Ball()); // 이거도 마찬가지로 TreeSet은 에러
//        set1.add(new Ball());
        // 에러의 사유... ClassCastException
        // 클래스 캐스팅 실패???
        // Set - 중복 비허용 -> 이론적으론 순서 없지만 실제론 순서 있음


        Iterator ite = set1.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
}
