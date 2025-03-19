package com.pm;

import java.util.ArrayList;

public class Ex03 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(1111);
        list1.add(222);
        list1.add(333);
        list1.add(444);
        ArrayList list2 = new ArrayList(list1); // 이 자리는 컬렉션이 올 수 가 있는데,
        // 자바유틸의 리스트로 받을 수 있을 것??)아하 java.util.List;
        // java.util.Collection 으로도 가능
        // Collection list1 = new ArrayList(); // 다형성에 의해 부모타입으로 캐스팅

        list1.set(2, 3000); //아 근데 컬렉션에는 set이 없어서 에러남
        // 이거 2, 3000 한 게 아래에서 list2에는 적용이 안 됨.
        // 아하 위에서 한 게 깊은복사였구나.
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        // 뭐를 인터페이스타입으로 가져오라는데..
        // 내가 쓰기 위한 것..?
        // 자료구조를 쓰는 것은, 어떤 자료의 타입을 쓰는 것인질 결정하는 게중요함
        // 내부의 클래스는 객체를 생성하기 위함일 뿐, 기능을 실제로 구현하기 위함일 뿐
        // 클래스를 기준으로 보고 판단하고 선택해선느 안된느 것.
        // 그 사유를 바로 그 뒤의 링크드리스트에서 보여주신다고.
    }
}
