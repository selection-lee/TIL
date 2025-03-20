package com.pm;

// 근데 예를들어서 Map같은건 제네릭이 2개 필요함
class Lec01 {
    public void func1() {
        System.out.println("func1실행");
    }
}

class Lec02 {
    public void func2() {
        System.out.println("func2실행");
    }
}

class Box2<T,t> {
    // 모든 게 들어갈 수 있게 Objct를 만들자.
//    Object obj1;
//    Object obj2;
    T obj1;
    t obj2;

//    void setObj1(Object obj1) { this.obj1 = obj1;}
//    void setObj2(Object obj2) { this.obj2 = obj2;}
    void setObj1(T obj1) { this.obj1 = obj1;}
    void setObj2(t obj2) { this.obj2 = obj2;}

//    Object getObj1() {return obj1;}
//    Object getObj2() {return obj2;}
    T getObj1() {return obj1;}
    t getObj2() {return obj2;}
}

public class Ex02 {
    public static void main(String[] args) {
        Box2 box2 = new Box2();
        box2.setObj1(new Lec01());
        box2.setObj2(new Lec02());

        Lec01 a1 = (Lec01) box2.getObj1();
        Lec02 a2 = (Lec02) box2.getObj2();
        a1.func1();
        a2.func2();
    }
}
