package com.am;
// 추상클래스
// - 추상메서드를 0개 이상 갖는 클래스
// - 상속을 통해서만 사용함을 강제하는 클래스 -> only non-static의 경우
abstract class Lec01{
    // 클래스의 3요소 필드 생성자 메소드

    static int su1 = 1111;
    int su2 = 2222;

    public Lec01(String s) {
    }

    //    public Lec01 () {
//        System.out.println(" 생성자 호출");
//    }
    // 메서드
    public static void func03() {}
    public void func01() {}
    // 만일  구현이 없는 메소드?
    // 추상메서드 - abstact 키워드
    // 추상클래스에 선언된 게 아니면 에러뜬다 ({} 생략했을 떄)
    // 메서드의 선언은 있지만 , 메서드의 구현은 없음
//    public abstract void func02();
//    public static abstract void func04(); // static과 abstact는 혼용 불가
    // 시작할 때 올려놔야 하는데 구현할 게 암것도 없잖아
}

public class Ex01 extends Lec01{
    // 추상메서드 오버라이딩 해서 구현을 만들어줌
//    public void func02() {}

    public Ex01 () {
//        System.out.println("자식객체");
        super("");
    }



    public static void main(String[] args) {
        // 추상클래스는 객체 생성이 안 됨
        // Lec01 parent = new Lec01();
        // 의의: 상속에 있다
        // 상속받으면 내 클래스도 또같이 추상클래스가 된다 `abstact class Ex01`로 처리
        // 아님 추상메서드 오버라이딩 해서 구현을 만드렁줌
        // 아님 abstact func02 없애면 오버라이딩도 필요없음
        System.out.println(Lec01.su1);
        Lec01.func03();
        // 객체를 찍어볼까
        Ex01 me = new Ex01();
    }
}
