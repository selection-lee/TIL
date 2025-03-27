package com.am;

import java.util.LinkedList;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println("main thread start");

        Ex04 me = new Ex04();
//        Thread thread = new Thread(me);
//        thread = new Thread(me);

        // Thread 통해서 run method만 상속받으면 됨.
        // 근데 Thread 상속은 안받아?
        // ano~~ 클래스 이용
        Thread thread = new Thread() {
            public void run () {
                // this: runnable을 상속받은 이름없는 클래스 - 쓰레드가 아님
                System.out.println(this.getName() + " Thread start");
                for (int i = 0; i < 100; i++) {
                    System.out.println(this.getName() + " thread i = " + i);
                }
                System.out.println(this.getName()+ " Thread end");
            }
        };
        thread.start();


        for (int i = 0; i < 100; i++) {
            System.out.println("main thread i = " + i);
        }
        System.out.println("main thread end");
    }
}
