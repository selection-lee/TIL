package com.pm;

// 스태틱 상황에서의 제네릭
class Lec03 {
    public static <T> T func01(T obj) {
        return obj;
    }
}

public class Ex03 {
    public static void main(String[] args) {
        String msg = "static";
//        String msg2 = Lec03.func01(msg); // 어라 근데 왜 캐스팅 요구할까요~?s
        // 이것도 제네릭으로 해결할 수 있다
        // ㅒObject 자리를 다 T로 바꿔주고 Type은 Lec03<T> 이거 안됨...
        // 앞전에는 이 클래스로 객체르 ㄹ찍어내니가 됏지만, 이건 객체 찍어내는 애가 아ㅣㄴ.ㅁ
        //   그럼 이거는 타입을 어디서 결정행 ㅑ하는걸/까?
        // static이니까 메서드에서 해야 함!!!
//        Lec03.<String>func01();
        String msg1 = Lec03.<String>func01(null);
        String msg2 = Lec03.func01(""); // 추론한 거라는데.. 진짜면 어디서 해야 돼? msg1처럼.
        String msg3 = Lec03.func01(null);
        // 즉, 원칙적으로는 msg1처럼 작성하는 게 맞고, msg2, msg3는 부가적으로 되는 것.
        
    }
}
