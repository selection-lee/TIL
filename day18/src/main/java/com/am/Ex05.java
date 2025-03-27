package com.am;

public class Ex05 {
    static Thread thread;
    public static void main(String[] args) {
        System.out.println("main thread start");
        Ex05 me = new Ex05();
//        Thread thread = new Thread(me); // Ex03에서는 runnable 상속받아서 가능했던 것 - 그럼 그냥 여기서 상속받아버리면 됨.

        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // this: runnable을 상속받은 이름없는 클래스 - 쓰레드가 아님
                System.out.println(thread.getName() + " Thread start");
                for (int i = 0; i < 100; i++) {
                    System.out.println(thread.getName() + " thread i = " + i);
                }
                System.out.println(thread.getName()+ " Thread end");
            }
        });

        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main thread i = " + i);
        }
        System.out.println("main thread end");

    }
}
