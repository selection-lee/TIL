package com.am;

public class Ex02 {
    public Ex02() {
        System.out.println("객체 생성");
    }
    public Ex02(Ex02 me) {
        me.func01();
    }

    public static void main(String[] args) {
        Ex02 me = new Ex02(); // 디폴트 생성자로 찍어놓은 애
        Ex02 me2 = new Ex02(me); // 또하나의 객체, 근데 이쪽 객체는 앞의 객체한테 주솟값을 달음
    }

    public void func02(Ex02 me) {
        me.func01();
    }

    public void func01(){
        System.out.println("기능 호출");
    }
}
