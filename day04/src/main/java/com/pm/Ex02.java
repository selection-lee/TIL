package com.pm;

// static -> static 호출 시:           func01();
// static -> non-static 호출 시:       참조변수.func01();
// non-static -> non-static 호출 시:   func01();
// non-static -> static 호출 시:       func01();

public class Ex02 {
    // 메서드(클래스메서드, static 메서드)
    public static void func01() {
        System.out.println("클래스 메서드");
    }

    // 메서드(멤버 메서드, 인스턴스 메서드, non-static method)
    public void func02() {
        System.out.println("멤버메서드");
        func01();
    }

    public void func02(int a) {
        int su = func03();
        System.out.println("su=" + su);
        return;
    }

    public int func03() {
        return 1234;
    }

    public static void main(String[] args) {
        func01();
//         참조변수
        Ex02 me =  new Ex02(); // 객체 생성
        me.func02();
        me.func02(1111);
        me.func03();
    }
}
