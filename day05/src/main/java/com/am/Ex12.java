package com.am;

class Car {
    public String color = "white";
    public String model; // 추가했다
    public int speed;
    public int max;

    public void speedUp() {
        if (speed+18>max) speed = max;
        else speed += 18;
    }
    public void speedDown() {
        if (speed - 22 < 0) speed = 0;
        else speed -= 22;
    }
    public void show() {
        System.out.println(color+"색"+model+"의 속도는"+speed+"km");
    }
}

public class Ex12 {
    public static void main(String[] args) {
        // 차 샀어
        Car myCar = new Car();
        myCar.max = 150;
        myCar.model = "아반떼";
        myCar.speed = 0;
        myCar.show();
        // 차를 받았으니까 악셀을 풀로 밟아보자
        for (int i = 0; i < 30; i++) {
            myCar.speedUp();
            myCar.show();
        }
        for (int i = 0; i < 30; i++) {
            myCar.speedDown();
            myCar.show();
        }
        myCar = new Car();
        myCar.model = "소나타";
        myCar.color="black";
        myCar.max = 180;
        myCar.show();
        // 차를 받았으니까 악셀을 풀로 밟아보자
        for (int i = 0; i < 30; i++) {
            myCar.speedUp();
            myCar.show();
        }
        for (int i = 0; i < 30; i++) {
            myCar.speedDown();
            myCar.show();
        }
        // 근데 이제 문제는 뭔 차가 150까지 밟았고 뭔 차가 180까지 밟았지?
        // 모델 속성을 추가하러 가자.
    }


}
