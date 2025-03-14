package com.am;

// 추상클래스 목적
//1. 상속을 통해서만 사용하도록 강제
abstract class Machine{
    public void on(){
        System.out.println("켜다");
    }
    public void off(){
        System.out.println("끄다");
    }
    public abstract void work(); /*{
//        System.out.println("일하다");
    }*/
    // 선언만 있으면 됨. 구현은 없어도.
    // 구현잇으면 Machine 객체 만들어서 실행했을 때 문제될 수 있다.
    public void wark() {}
}
// pm이 abstact로 구현해놓으면 호출이 가능하겠죠. 실제로 호출은 안되겠지만 그 이름을 사용해서 규격화를 할 수 잇겠지.
// 소스코드는 없을지언정 에러가 안 나니까
// 부모의 타입을 정의해놔서
// 안그럼 매번 에러표시 뜨는 ide에서 작업해야 함. 어디가 맞는지 틀린지도 모르고

// 아까처럼 추상이 아니면
// 2. 특정메서드의 Override를 강제
abstract class Audio extends Machine{
    @Override // 만약 wark가 machine클래스에 있었다?
    public void wark() {} // 만약 work가 abstact면 상속받은 Audio가 override 안하면 에러남
}

class Tv extends Machine {
    @Override
    public void work() {
        System.out.println("화면을 보여주다");
    }
}

class Radio extends Machine {
    @Override
    public void work() {
        System.out.println("소리를 들려주다");
    }
}

public class Ex02 {
    public static void main(String[] args) {
        // Tv remote = new Tv();
        Machine remote = new Tv(); // 이러면 다형성(?)
        // Machine remote = new Radio(); // 이렇게 객체 클래스만 바꿔주면 돼서
        remote.on();
        remote.work();
        remote.off();
        // 문제는 의도치않게 machine으로 일을 시키는 거
        // 그래서 abstact machine 하면 이런 문제 안생길 것
    }
}
