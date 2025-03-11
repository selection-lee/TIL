package com.am;

// 의의가 있게 만드려면?

class Car {
    public String company = "국산";
    public String color = "white";
    public String model = "???";
//    public final String model = "???"; // 뭔짓을 해도 안바뀐다는 것. final쓰면
    public int speed;
    public int max = 150;

    public Car(String msg, String name, int a){
        color=msg;
        model=name;
        max=a;
    }

    public void speedUp(int a) {
        if (speed + a + 10 > max) {
            speed = max;
        } else {
            speed += a * 10;
        }
    }

    public void speedDown() {
        if (speed - 15 < 0) speed = 0;
        else speed -= 15;
    }

    public void show() {
        System.out.println("내 차 " + color + "색 " + model + "의 속도는 " + speed + "km");
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Car myCar = new Car("red","모닝",150);
//        myCar.model="아반떼";
//        myCar.color="red";
//        myCar.max = 150;

        for (int i = 0; i < 10; i++) {
            myCar.speedUp(i);
            myCar.show();
        }
        for (int i = 0; i<20;i++) {
            myCar.speedDown();
            myCar.show();
        }

        myCar = new Car("black","그랜저",200);
        for (int i = 0; i < 10; i++) {
            myCar.speedUp(i);
            if(i == 3) myCar.color="진흙묻은 검정";
            myCar.show();
        }
    }
}
