package com.am;

public class Ex01 {
    Ex01 me; // Ex01 me2 = null;
    public static String msg = null; // 객체 없음, 주솟값 없음
    public static String msg2 = ""; // 객체 있음, item(문자) 없는 것.
    // 메소드도 중복 호출이고..
    // 생성자는 객체 생성시점에 호출하면, 해당 객체에서는 두번다시 호출할 수 없다.
    // 생성자는 호출하는순간 새로운 객체가 생성돼서.
    // 그니가 단 한번만 실행 됨. 두번다시 이 생성자 의 코드를 호출할 방법이 없음
    // 근데 반복을 피하기 위해 이 각 생성자에서 중복되는 부분을 메소드로 빼버리면 노답.
    // 그래서.. 객체 생성 없이 생성자가 생성자를 호출하면 되겠다.

    public Ex01 () {
        // this는 생성자 맨 처음에 위치
//        System.out.println("객체생성1 매개변수 x");
//        System.out.println("객체 생성 이전"); // this 이전에 넣으니까 에러
        this("없음"); // 'this()' 호출은 생성자 본문의 첫 번째 구문이어야 합니다
        // this 아래는 상관없음
        // 객체 생성되는 생성자 실행 하고 리턴 해서 돌아왔기 때문에 이후는 가능
        System.out.println("이후 일 진행ㄱㄱ");
        System.out.println(this); // 이건 다른 거니까 혼동하지 않도록 주의!!!
    }
    public Ex01 (int su) {
//        System.out.println(msg);
//        System.out.println("객체 생성 2 매개변수 msg=" + msg);
        // System.out.println("객체 생성 이전"); // this 이전에 넣으니까 에러
        this("숫자: " + su);
        System.out.println("이후 일 진행ㄱㄱ");
    }

    public Ex01(String msg) {
//        this(); // 에러 남 -> 적어도 생성자 중 하나는 this가 있으면 안 됨
        System.out.println(" 객체가 생성되는 생성자");
        System.out.println("객체 생성");
        System.out.print("매개변수 ");
        System.out.println(msg);

    }
    public static void main(String[] args) {
        char ch = '\u0000'; // null
        Ex01 me = null;
        me = new Ex01("java");
        me = new Ex01();
        me = new Ex01(3);
        // 생성자 호출함녀서 객체 생성됐는데,
        // 생성자 내에서 생성자를 호출하면 두 개의 개체가 생성되는 거 아니냐/?
        // 절대 ㄴㄴㄴㄴ.
        //그럼 객체가 찍히는 생성자와 찍히지 않는 생성자는?
        // 이 코드 기준 마지막 꺼
        
    }
}
