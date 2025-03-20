package com.am;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1 = new LinkedList();
        Set set1 = new HashSet();
        // Set set1 = new TreeSet(); // 결고 ㅏ똑같이 나옴

        Queue que1 = new LinkedList();
        Deque que2 = new LinkedList();
        Stack stack = new Stack();
        // Vector
        Vector vec1 = new Vector();
        Vector vec2 = new Stack();
        // q, deq, stack은 인터페이스 vector은 클래스


        Iterator ite = set1.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

    }


}
