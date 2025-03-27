package com.am;

import java.util.LinkedList;

// 1. 가장 쉬운 방법: 쓰레드 클래스 상속
public class Ex02 extends Thread {
    public static void main(String[] args) {
        System.out.println("main thread start");
        Ex02 me = new Ex02(); // 여기까진 main ...
        // public void run 이라는 메서드가 있음. target != null이면 target을 run() 하는 것.
//        me.run(); // new 쓰레드가 아님. 호출햇으니까 가서 일을 하고 다시 돌아옴. 그럼 그 일을ㄴ 누가 해? 메인메서드, 즉, 메인ㅅ쓰레드에서 하게 됨.
        // 새로운 스레드 만들고 거ㅣ서 런을 호출하도록 해야겟지..
        // 그래서 run 말고 start로 가보자.
        me.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main thread i = " + i);
        }
        System.out.println("main thread end");
    }
    // 아직 run 이라는 메서드는 하는 게 없음.
    // 할 일을 적어줘야 지. 내가 원하는 거로 바꾸기 위해 overrride
    public void run() {
        System.out.println(getName() + " Thread start");
        LinkedList list = new LinkedList();
        for (int i = 0; i < 100; i++) {
            list.add(new String(i + ""));
            System.out.println(getName() + " thread i = " + i);
        }
        System.out.println(getName()+ " Thread end");
    }
}
