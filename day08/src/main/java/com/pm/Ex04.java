package com.pm;

class Machine {
    public void on() {
        System.out.println("켠다");
    }
    public void off() {
        System.out.println("끄다");
    }
    public void work() {
        System.out.println("전기를 가지고 무슨일이든 함");
    }
} // 객체의 상위 개념
// tv와 오디오를 공통적으로 추상화 한 개념
// 상속하면 할수록 객체가 더욱 구체화 됨

class TV extends Machine {
    public void work() {
        System.out.println("주파수 잡아 화면을 보여준다.");
    }
}

class Audio extends Machine {
    public void work() {
        System.out.println("음악을 들려준다");
    }
}


public class Ex04 {
    public static void main(String[] args) {
        Machine remote; // = new Machine();
//        remote.on();
//        remote.work();
//        remote.off();
        /*
        Machine tv = new TV();
        tv.on();
        tv.work();
        tv.off();

        Machine audio = new Audio();
        audio.on();
        audio.work();
        audio.off();
        */
        // 부모타입으로 받을 수 있다.
        // 부모타입에 정의된 메소드는 내용이 다를 뿐 호출은 가능함
        remote = new TV();
        remote = new Audio();
        remote.on();
        remote.work();
        remote.off();
        // machine을 상속만 받으면 아직 실행되지도 않은 코드를 실행시킬 수 있다??
    }
}
