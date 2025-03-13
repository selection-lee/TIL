package com.am;

public class Ex06 {
    // 객체 생성은 불허하지만 nonstatic
    // 그럼 어떻게 쓰라고?

    public int su6 = 666;
    public static Ex06 obj = new Ex06(); // 이렇게 쓰면 psEx06 newInstance 없어도 객체 사용가능
    // 클래스명.obj 로 접근하면 접근이 가능해짐. 대신, obj의 값은 Ex06객체의 주소.
    // 왜 굳이 이렇게 쓸까?
    // 객체를 막 찍을 수 있어. 그래서 잘 쓰면 상관 없는데
    // 객체를 찍어냈다 없앴다 이 작업을 반복하게 됨.
    // 그래서 객체지향의 객체 생성은 효과적으로 객체를 잘 찍어내서 잘 씀녀 상관없는데, 잘못하면 더 비효율적ㅇ.
    // 차라리 그렇게 쓸 바에는 하나 객체만 찍어내서 계속 재사용
    private Ex06() {}

    public void func6() {}

    public /* static */ Ex06 newInstance() {
        return new Ex06();
    }
    // 공통적으로 이런 게 있음
    // -> private 생성자는 클래스 내부에서만 접근으 허용하니까, 내부에선 객체 생성 가능하네!
    // 따라서 내부에서 객체 생성 가능하니까 이 메소드 호출해서!

    // 디자인패턴
    // 그중에서 싱글톤 패턴!!!
}
