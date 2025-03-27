package com.am;

import java.util.LinkedList;

public class Ex03 implements Runnable{
    // 이 쓰레드를 통해 할 일
    // 명시해줘야 함.
    static Thread thread;
    public static void main(String[] args)  {
        System.out.println("main thread start");

        Ex03 me = new Ex03();
//        Thread thread = new Thread(me);
        thread = new Thread(me);

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main thread i = " + i);
        }
        System.out.println("main thread end");
    }

    @Override
    public void run() {
        // 어라 getName이 없음.
        // 1. 그럼 여기서 만든 쓰레드를 가지고 접근하는 방법.
        System.out.println(thread.getName() + " Thread start");
        LinkedList list = new LinkedList();
        for (int i = 0; i < 100; i++) {
            list.add(new String(i + ""));
            System.out.println(thread.getName() + " thread i = " + i);
        }
        System.out.println(thread.getName()+ " Thread end");
    }
}
