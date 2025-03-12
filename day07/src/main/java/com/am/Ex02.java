package com.am;

class Car {
    public String model, color;
    public int speed;
    public final int max;

    public Car(String color, int max) {
        this.color = color;
        this.max = max;
        if (max > 180) this.model = "그랜져";
        else if (max> 150) this.model = "아반떼";
        else if (max> 120) this.model = "캐스퍼";
        else this.model = "모닝";
    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
        if(model.equals("그랜저")) this.max=200;
        else if (model.equals("아반떼")) this.max=180;
        else if (model.equals("캐스퍼")) this.max=150;
        else this.max = 120;
        // 근데 또 반복이 됨.
        // 어떻게 줄여볼까?
        // 걍 model, max를 풀버전으로 다 if문 옮겨놓고,
        // 위에꺼 두 개는 걍 this호출만??

    }

    public Car(String color, String model, int max) {
        this.color = color;
        this.model = model;
        this.max = max;
    }

    public void up() {
        if (speed + 10 > max) speed = max;
        else speed += 10;
    }

    public void down() {
        if (speed - 10 < 0) speed = 0;
        else speed -= 10;
    }

    public void show(){
        System.out.println(color + "색 " + model + "의 속도는 " + speed + "km");
    }
}


public class Ex02 {
    public static void main(String[] args) {
        Car myCar = new Car("흰", 200);
//        Car myCar = new Car("흰", "아반떼", 150);

        for (int i = 0; i < 30; i++) {
            myCar.up();
            myCar.show();
        }
        for (int i = 0; i < 30; i++) {
            myCar.down();
            myCar.show();
        }
    }
}
