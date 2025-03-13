package com.am;
// 자바 상속의 의의

class Carraige {
    int speed;
    int max;
    public Carraige() {
        max = 40;
    }
    public void speedUp() {}
    public void speedDown() {}
    
    // 메서드 오버라이드 - 부모의 기능을 재정의
//    @Override // 컴파일러가 체크 (둘 중에 어느 거에 override? )
    public void show() {
//        System.out.println(model + "속도는"+ speed + "km");
        System.out.println("속도 출력");
    }
}

class Cycle extends Carraige {
    public Cycle() {
        max = 40;
    }
}

class Car extends Carraige{
//    int speed;
//    final int max;
    public Car() {
        max = 100;
    } // 상속 받으니까 일단 이것만 남아있다가
    String model;
    String color;
    public Car (String color, String model) {
        max = 100;
        this.color = color;
        this.model=model;
    }
    // 메서드 오버라이드
    @Override // 컴파일러가 체크
    public void show() {
        System.out.println(model+"속도는 "+speed+"km");
    }
//    public Car(int max) {
//        this.max=max;
//    }
//    public void speedUp() {}
//    public void speedDown() {}
}

// 중복된 코드의 재사용
public class Ex08 {
    Cycle myCar = new Cycle();
}
