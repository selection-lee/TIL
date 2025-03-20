package com.am;

import java.util.*;

public class Ex03 {
    static class SortingObj implements Comparator {
        @Override
        public int compare(Object before, Object after) {
            //return -1; // 거꾸로 정렬
            // return 0; return 1111; 걍 내가 넣은 거 그대로
//            return (Integer)before - (Integer) after;
            return (Integer)after - (Integer) before;
            // 암튼 앞뒤원소 비교해서 정렬하는 거...
        }
    }

    public static void main(String[] args) {
        List list1 = new ArrayList();

        list1.add(1111);
        list1.add(2222);
        list1.add(3333);
        list1.add(4444);

        list1.sort(new SortingObj());
        Iterator ite = list1.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
}
