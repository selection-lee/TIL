package com.am;


/*
 * 접근제한자 class 클래스이름 {
 *     public static int su1;
 *     public int su2;
 *
 *     public 클래스이름() {} // 생성자
 *     public static void main(String args[]) {}
 * }
 * */
public class Ex01 {
    // 1.2 일단 접근 편하게 static
    public static int su1 = 1111;
    static int su2;
    private static int su3;

    // 1. 필드, 메서드 접근제한자
    public static void func01() {
    } // pub

    static void func02() {
    } // def

    private static void func03() {
    } // prv


    public static void main(String[] args) {
        // 접근제한자
        // 총 4개, 오늘 할 건 3개
        // 일반적으로는? 필드, 메서드 는 거의 동일 vs 클래스 vs 생성자.
        // 필드, 메서드
        // 1. public - 어디서든 접근 허용
        // 2. default - 동일 패키지 내에서만 접근 허용
        // 3. private - 선언된 클래스 내부에서만 접근 허용
        // 클래스
        // - 필드, 메서드의 접근제한자에 영향
        // - 소스코드 문서상 public 클래스는 1개 이하
        // 1. public - 어디서든 접근 허용
        // 2. default - 동일 패키지 내에서만 접근 허용


        // 목적: 접근 제한
        // 제한 범위 public > default > private
        //

        // 접근과 호출
        func01(); // Ex01.func01();
        func02(); // 얘도 Ex01. 생략
        func03(); // 얘도 생략
        // 근데 Ex01만 써도 사실 패키지 생략한 것
        // 그럼 풀네임은 com.am.Ex01.func01, com.am.Ex01.su1;
        System.out.println(su1);
        System.out.println(su2);
        System.out.println(su3);

        com.am.Ex04 ex04; // 변수의 선언은 가능, 생성자의 호출을 불허할 뿐.
        ex04 = new com.am.Ex04(1111);
//        ex04 = new com.am.Ex04(true);
//        ex04 = new com.am.Ex04("");
        // 객체를 생성 못 함. 그 으이의는? 객체 생성 못 하는 데 있다
        //이 클래스는 객체 생성해서 쓰는 클래스가 아니다?
        // 전부 static이면 굳이 참조변수 해서 객체 생성할 필요 없는 거지. 전부 static이니까.
        // 그럼 객체 생성을 못하게 해버리면 되겟지.  by 생성자 특징
        // -> Ex05
        Ex06 ex06 = Ex06.obj;
        System.out.println(ex06.su6);
        ex06 = Ex06.obj;
        System.out.println(ex06.su6);
        ex06 = Ex06.obj;
        System.out.println(ex06.su6);
        System.out.println(ex06.su6);
        Ex06 ex062 = Ex06.obj;
        System.out.println(ex06 == ex062); // true


    }
}
