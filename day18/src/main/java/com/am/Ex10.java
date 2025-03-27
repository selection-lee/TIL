package com.am;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10 extends Frame implements Runnable{
    Label label;

    public Ex10() {
        setLayout(new BorderLayout());
        Panel p = new Panel();
        Button button1 = new Button();
        Button button2 = new Button();
        p.add(button1);
        p.add(button2);
        add(p, BorderLayout.SOUTH);
        add(label, BorderLayout.CENTER);
        setBounds(100, 100, 200, 200);
        setVisible(true);
//        while (true) {
//            loop();
//            try {
//                Thread.sleep(1000);
//            }catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
    }

    public void loop() {
        Date date= new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        String text = sdf.format(date);
        label.setText(text); // 시간
    }

    public static void main(String[] args) {
        Ex10 me = new Ex10();
        Thread thread = new Thread(me); // 이제 me를 가지고 새로운 스레드가 일을 수행할 것
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            loop();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
