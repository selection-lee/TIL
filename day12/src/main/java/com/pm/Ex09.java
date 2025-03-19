package com.pm;

import java.util.Enumeration;
import java.util.Vector;
public class Ex09 {
    public static void main(String[] args) {
        // vector도 순서가 있는 자료구조.
        // vectore는 list를 상속받음
        // 근데 다른 collection framework 와달리, jdk 1.0부터 제공됨
        // 즉, 최초 출시부터 stack(?)과 vector는 있었다는 것
        // 옛날에는 vector 하나 가지고 list, set, ....  전부 다 넣어놨단 것.
        // 1. Vector
        Vector list = new Vector();
        list.addElement("11");
        list.addElement("22");
        list.addElement("33");
//        System.out.println(list.elementAt(0));
//        System.out.println(list.elementAt(1));
//        System.out.println(list.elementAt(2));

        // 그럼 얘를 set타입으로 스렴ㄴ? index 번호로 호출하지 않겠다느 거잖아.
        // enumeration d이라는 타입으로 객체를 제공받는다.
        Enumeration enu = list.elements();
//        System.out.println(enu.nextElement());
//        System.out.println(enu.nextElement());
//        System.out.println(enu.hasMoreElements()); // 값이 있으니까 true
//        System.out.println(enu.nextElement());
//        // System.out.println(enu.nextElement()); // 값이 없으니까 에러
//        System.out.println(enu.hasMoreElements()); // false
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement()); // 11 22 33
        }
        // 단, enu객체에 값을 대입해서수정해봐야 소용이 없음. 왜???? 순서가 없는 값을 끄집어내기위한 하나의 객체이 ㄹ뿌닝라서, vectore list에는 영향이 없음.
        // 한 번 enumeration을 소모하고 나면? 그 이후느 ㄴ똑같은 거 해도 시행을 안함. 다 빠져나갓으니가.
        // 그럼 어케하면 다시 출력?
        // enumeration 객체 다시 호출해서 다시 출력. 있는거 다시 쓰든 새로 변수 만들든, enumeration 객체를 다시 만들면 됨
        // 하여튼 소모하고 나면 끝이라는 거.


    }
}
