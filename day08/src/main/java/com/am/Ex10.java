package com.am;

class Ex100{
    public Ex100(String msg) {}
    // 오버라이드 대상은 메소드 뿐
    public void func1() {
        System.out.println("기능");
    }
}


public class Ex10 extends Ex100 {
    int su=222;
    // 내 생성자에서 부모 클래스에 매개변수 전달?
    public Ex10() {
        super("aaa"); // 오 이거 넣으니까 바로 에러 안 남
//        this vs super
        // 그니까 기존에 ex08에서 car(?) 에는 super()가 생략되어 있었다는 뜻...
    }

    public Ex10(int a) {
        this(); // 없애는 순간 바로 에러 뜸. 부모 객체 생성하려는 순간 ?? ㅜ머라고??
        // default 생성자 호출 => 위에꺼에 super가 있음
        // this()와 super()은 한 생성자에 공존 불가. 
        // 저번에도 말했지만 this, super 는 생성자의 최상단 맨 윗줄에 존재해야 함
        // 생성자가 여러 개 있으면? this()가 없는 생성자가 하나 이상 있어야 함
        //    -> 그게 바로 super
        // 단, 매개변수 없으면 생략가능
    }
    
    public void func01() {
        super.func1();
//        System.out.println("자식기능"+super.su);
        System.out.println("자식기능"+this.su);
        // super는 부모객체의 참조변수
    }
    /*
    * 내 클래스에서 객체 생성 해도 부모클래스에 객체가 생성 안 된다는 얘기
    → default 생성자 없는 순간, 매개변수 값을 뭘로 줄건데?
    자바가 매개변수 값을 맘대로 결정할 수 업음 →그래서 내려감
    * */
    public static void main(String[] args) {
        Ex10 me = new Ex10();
    }
}
