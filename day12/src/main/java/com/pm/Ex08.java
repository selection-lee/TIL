package com.pm;

import java.util.*;

public class Ex08 {
    // set
    public static void main(String[] args) {
        // list 하는 순간 arrayList 선택하는것처럼
        // set도 기본적으로 무조건 선택하는 것 있음
        // == HashSet!!!!!!1
        Set set1 = new HashSet();
        // set1.add("첫");
        set1.add("둘");
        set1.add("셋");
        set1.add("넷");
        set1.add("다섯");
        set1.add("다섯");
        set1.add("다섯");
        set1.add("다섯");
        set1.add("다섯");
        // 어케꺼냄? 지금까지는 index로 . length길이로. 처리가능햇음
        // 근데 이건 순서가 없다며.
        // 그럼 반복문을 돌리기 난감해짐.
        // 다시 원형으로 돌아가보자 - Ex09 -vector

        // 돌아왔다
        Iterator ite = set1.iterator();
        while (ite.hasNext()) {
            Object obj = ite.next();
            System.out.println(obj); // 첫 실행해보니 넷둘첫셋다섯
            // 어라 매번 똑같이 나오네 분명 순서가 없댔는데
            // 그럼 순서가 잇다는 것? 
            // 그냥 중복이 없다는 것
        }
        
        // add return타입에 bool 이 왜 있냐? 
        System.out.println(set1.add("첫")); // 기존에 없었으면 true
        System.out.println(set1.add("첫")); // 있었으면 false
        // 리스트에서는 실패할 일이 거의 없다. 순서있어서
        // ㄱ근데 set에서는 false가 일어남

        // 그래서 set의 의미는? 
        // 이론상 순서가없다
        // == 중복을 허용하지 않겟다
        // 사실상 순서는 있다

        List list = new ArrayList();
        list.add("첫");
        list.add("22");
        list.add("33");
        list.add("44");

        Set set2 = new HashSet();
        set2.addAll(list);
        System.out.println("set size: " + set2.size());

        Iterator ite2 = set2.iterator();
        while (ite2.hasNext()) {
            Object obj = ite.next();
            System.out.println(obj);
        }

    }
}
