package com.am;

// 부모클래스, super class / base class / parent class
class Ex777 extends java.lang.Object {
    int su1 = 111;
    public void func1() {
        System.out.println("부모의 기능");
    }
    
    
}
// 다중 상속은 안 된다 - 근데 이미 Ex777 상속 받음
// 그럼 Ex07은 object 상속 x? ㄴㄴ
// Ex777에서 object를 상속 받았기 때문에 사용 가능
// 자식 클래스, sub class / derived class / child class
public class Ex07 extends Ex777{
    // java의 모든 클래스는 뭔가 하나를 상속
    // 상속
    // 모든 클래스는 부모클래스를 상속받음
    // 특별 상속이 없으면 최상위의 java.lang.Object 클래스 상속받음
    // 단일 상속
    public static void main(String[] args) {
        Ex777 parent = new Ex777();
        Ex07 me = new Ex07();
        System.out.println(me.hashCode());
        parent.func1(); // 부모의 기능
        me.func1(); // 부모의 기능 // 상속으로 쓸 수 잇게 됨

        System.out.println(parent.su1); // 111
        System.out.println(me.su1); // 111
    }
    
    public void func2(){
        System.out.println(" 자식의 기능");
    } // 부모클래스에선 ㅅ용 불가

}
