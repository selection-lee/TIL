package com.am;

public class Ex09 {
    // 다형성
    public static void main(String[] args) {
        Carraige car1 = new Carraige();

        car1.show();
        Car car2 = new Car("흰색", "모닝");
//        car2.stop();
        Object obj = new String();
        Carraige car4;
        car4 = new Car("black", "child");
        car4.speedUp();
        car4.show();
//        car4.stop(); // type이 부모의 타입이라 호출 불가.
//        만약 다시 (Car)로 캐스팅 해버리면 가능해질 것((Car)car4).stop
//        but 굳이,,라는건가,,,,,,
        // stop은 어다 선언햇냐..

        // override의 대상은 메서드만 (필드는 오버라이드 대상이 아님)
        // 부모 재정의한다는 건 값 바꾼 것으로, 실행이 되어야 한ㄴㄷ,,
        System.out.println(car4.max);
    }
}
