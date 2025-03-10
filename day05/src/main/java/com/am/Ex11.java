package com.am;

public class Ex11 {
    // 7. static으로 speed 변수 선언
    public static int speed = 0;

    // 8. 이제 속도 올리는 것도 빼내면
    public static void speedUp() {
        speed += 30;
    }
    // 10. 이제 멈추는거
    public static void speedDown() {
        speed -= 30;
    }

    // 5. 뭘 빼내? 아하 속력변화를?
    public static void showSpeed() {
        // 6. 그럼 메소드 두 개에 speed가 공통적으로 접근행 ㅑ하니까
        System.out.println("현재 속도는 "+speed+"km 입니다");

    }
    public static void main(String[] args) {
        // 4. 변수 선언
//        int speed=0;
        // 1. 자동차 타고
        System.out.println("자동차 타고 ");
        // 2. 속도를 확인했더니
//        System.out.println(0+"km");
        showSpeed();
        // 3. 속도를 높이려면 변수가 필요하네
//        System.out.println();
        // 4. 반복해서 가속할거야
        for (int i = 0; i < 30; i++) {
//            speed += 10;
//            System.out.println("현재 속도는 "+speed+"km 입니다");
            // 9. 함수로 바꿔주기
            speedUp();
            showSpeed();
            if (speed >= 150) break;
            // if (speed += 10 > 150) speed = 150;
            // else speed += 10;
        }

        // 11. 이제 속도 down
        for (int i = 0; i < 30; i++) {
            speedDown();
            showSpeed();
            if (speed <= 0) {
                break;
            }
            // if speed -= 10 < 0 speed = 0;
            // else speed -= 10;
        }
        // 12. 단, 액셀이나 브레이크를 세게 밟는다고 해서 최대속도나 최저속도는 한계가 있다.
    }
}
