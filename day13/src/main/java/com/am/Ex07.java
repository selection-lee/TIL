package com.am;
import java.util.*;
public class Ex07 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(111);
        set.add(222);
        set.add(333);
        set.add(444);

        Iterator<Integer> ite = set.iterator();
        while (ite.hasNext()) {
            int val = ite.next(); // 제네릭으로 이제 casting 없이 쓸 수 있을 것
            // 선언할 때 제네릭 안붙이면 캐스팅하라고 에러날 것
            System.out.println(val);
        }

        Set set2 = new TreeSet();
    }

}


