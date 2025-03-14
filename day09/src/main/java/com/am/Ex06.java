package com.am;

public class Ex06 {
    public static void main(String[] args) throws ClassNotFoundException {
        Object obj = new Object();
        // 원칙적으로 clone은 접근이 불가한 것이다
        // obj.clone(); // protected라서 기본적으로는 default처럼 작동
        // interface cloneable 넣어야 함
        Object obj2 = new Object();
        Object obj3 = obj;
        System.out.println(obj.equals(obj2));
        // equlas는 value값 비교니까 true 나왕 ㅑ하는 건 아닐가?
        // ㄴㄴ false임
        // 그럼 이 object의 value는 뭔데?
        // equals는 기본적으로 서로간의 비교일 뿐. 그 비교는 꼭 value가 아니라 reference 비교라는 것?
        System.out.println(obj.equals(obj3)); // true
        // String은 override해서 바꿔놨기 때문에 api에도 설명이 써있는 것
        // 기본적으로 Object에 정의되어있는 것과 다르기 때문.
        // 그래서 api의현재 문서에 안적혀있어도 상위클래스 봐야 함.
        // 만약 상위에 있는데 하위에도 있따? 그럼 오버라이드된거라서 다른 기능임!

        Class clz = obj.getClass();
        // 참조변수.. Ex06 me ...
        Ex06 me = new Ex06();
        Class clz2 = me.getClass();
        Class clz3 = Ex06.class;
        Class clz4 = Class.forName("com.am.Ex06"); // 클래스의 정보를 갖는 클래스
        // 얘네가 뭐하는지는 어제 소개함
        System.out.println(clz);
        System.out.println(obj); // 2a139a55 // 이거랑 아래꺼랑 같은 건데 진법이 다른 것 // 16진법
        System.out.println(obj.hashCode()); // 705927765 // 10진수

        // toString
        System.out.println(obj.toString());
        // 객체를 어덯게 문자열로 바구나? getclass@hashcode값
        // 포인터가 없기 때문에 뭐야 참조변수 직접 출력 불가..
        // 그래서 못할 때는 자바가 자동으로 toString 호출해버린다.

        // 클래스 Class 가지고 뭐 필드뽑아오고 메서드 확인 생성자 ,, 이 많은 정보를,,
        // getMethod,, 리턴, static, 기타등등 정보가 너무많다.
        // ..
        // 따라서 자바의 객체는 자료구조.
    }
}
