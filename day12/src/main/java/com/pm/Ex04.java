package com.pm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// LinkedList
public class Ex04 {
    public static void main(String[] args) {
        // LinkedList list1 = new LinkedList();
        ArrayList list1 = new ArrayList();
        list1.add(111);
        list1.add(222);
        list1.add(333);
        list1.add(444);
        LinkedList list2 = new LinkedList(list1);
        // 결국 다 컬랙션 상속받는 애들이라서 list1을 arrayList로 선언해도 똑같이 잘 복사됨
        // AL는 객체고 LL이 배열? 반대? 암튼 그런데도 뭐 가능하다고...?
        LinkedList list3 = new LinkedList();
        list3.offer(111);
        list3.offer(222);
        list3.offer(333);
        list3.offer(444);
        LinkedList list4 = new LinkedList();
        list4.offerLast(111);
        list4.offerLast(222);
        list4.offerLast(333);
        list4.offerLast(444);

        // 컬렉션을 할 때 절대 클래스로 배우면 안 됨.
        // offer, add, offerLast 다 똑같은 거 아냐?
        // ll은 다양한 자료구조의 구현체이다.
        // 그래서 얘한테는 interface가 다양하게 있는데,

        List list5 = new LinkedList();
        // list5.offer(222);
        // list5.offerLast(333);
        // 이 둘은 안 됨.
        // 대표로서 사용할 것 같으면? 뭔 대표..? 아 Deque.......데큐........
        // Queue 로 쓸 것 같ㅇ면 큐로 받아서 쓰는 것.
        // 스택과 큐에 대해서 얘기를 했는데, 큐는 선입선출. 중간에 값 못 뽑아냄.
        // 근데 이 Queue 의 구현체가 LinkedList, 즉 객체를 사요해서 하는 동적할당
        // 그래서 사용하는 명령어들이 얘 입장에서는 다른 것.
        // 그래서 내가 지금 필요로하는 자구가 뭔지 알아야 인터페이스 선택. 그럼 인터페이스를 구현하는 구현체가 있을 것.
        // 큐 스택 리스트 셋 이런 인터페이스만 선택하는 것.
        // 그걸 구현한 구현체는 LL로 일단 붙여주는 것. 일단 성능은 뒤로 하고.
        // Queue는 remove나 pop 이런 게 없고.. 중간에서 처리할 수 있는 것. set이런거 없다. \
        // 그래서 컬렉션 framework 배울때느 클래스 집중할 게아니라 interface생각해야 함
        // 어차피 해봤자 배열을 사용하든 객체를 사용하든 결국은 자료구조는 동적할당이라서.. 그렇다고 한다면 우리가 지금 할 수 있는 건 배열 쓰거나 객체 쓰거나 이것밖에 없ㅇ,ㅡㅁ
        // 그걸 어쩔 땐 큐, 덱, 리스트, .... 그래서 결국 하나의 클래스에 몰아넣은 것.
        // 의미를 생각하자!
        // 리스트 타입의 인터페이스는?
        // 어레이리스트 대부분 타입이 리스트에 선언되어잇고, 그 범주에서 LL 선언해서 갖다쓰는 건 ok, 그 외에는 다른 자료구조
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }
    }
}
