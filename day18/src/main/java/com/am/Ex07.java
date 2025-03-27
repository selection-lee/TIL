package com.am;

public class Ex07 implements Runnable {
    public static void main(String[] args) {
        Ex07 me = new Ex07();
        Thread thread1 = new Thread(me);
//        Thread thread2 = new Thread(me);
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread thr = Thread.currentThread();
                System.out.println(thr.getName() + " Thread start");
                for (int i = 0; i < 1000; i++) {
                    System.out.println(thr.getName() + " thread i = " + i);
                }
                System.out.println(thr.getName()+ " Thread end");
            }
        });
        thread1.start();
        thread2.start();
    }
    @Override
    public void run() {
        // 이 코드가 돌아간다는 건 쓰레드가 일을 하고 있다
        // 어쩄든 한 쓰레드가 일하고 있으면 다른 스레드는 일을 안 하고 있음
        // 일 수행 시점에 쓰레드로부터 가장 최근의 쓰레드를 받게 되면?
        Thread thr = Thread.currentThread();
        System.out.println(thr.getName() + " Thread start");
        for (int i = 0; i < 100; i++) {
            System.out.println(thr.getName() + " thread i = " + i);
        }
        System.out.println(thr.getName()+ " Thread end");
    }
}
