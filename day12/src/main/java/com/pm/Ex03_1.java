package com.pm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Ex03_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(1111);
        list1.add(222);
        list1.add(333);
        list1.add(444);

        Collection list2 = new ArrayList(list1);
        List list3 = new ArrayList(list1);
        ArrayList list4 = (ArrayList) list1.clone();

        ArrayList list5 = new ArrayList();
        list5.addAll(list1);

        // list 3,4,5는 똑같은 거 아닌가? ㅜㅜ

        // list1.set(2, 3000); // 깊은복사라서 값 수정해도 이미 복사된 다른리스트에 영향 안끼침.
        // list5.removeAll(list1); // 위에서 list1은 2번이 3000으로 바꿨으니까 이제 list5 출력하면 333만 나옴
        list5.remove(1);
        // 왜 자동으로 index로 처리하냐?
        // 이미 add로 들어가는 순간 1111이나222 이런 애들은 Object니까.
        // int 면 index!!

        List list6 = list5.subList(0,list5.size());
        Object[] list7 = list6.toArray(); // object 아니고 object 배열이 나옴.

        // int[] list7 = (int[])list6.toArray(); // 에러
        // 그럼 int배열로 쓰고싶으면?
        int[] list8 = new int[list7.length];
        for (int i = 0; i < list7.length; i++) {
            list8[i] = (Integer)list7[i];
        }



        for (int i = 0; i < list5.size(); i++) {
            System.out.println(list5.get(i));
        }
        for (int i = 0; i < list7.length; i++) {
            // 단, 얘는 object가 나온다!
            // Object obj = list7[i]; 라는 뜻!!
            int obj = (Integer)list7[i]; // Object를 Integer로 캐스팅하고, Integer가 다시 언박싱돼서 int가 될 것
            System.out.println(list7[i]);
            System.out.println(obj);
        }
    }
}
