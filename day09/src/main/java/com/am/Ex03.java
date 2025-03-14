package com.am;

import com.am.child.Lec02;

// 접근제한자 마지막 한 개
// protected (필드, 생성자, 메서드에만 붙을 수 있다. 뭐에는 못 붙는다는데? 아 클래스)
// 동일 패키지에서만 접근을 허용 (== default)
// 단, 상속을 통해서는 접근을 허용 (상속을 받아도 직접 호출은 불가,,,라는거겠고)
// public > protected ≥ default > private
//만약 생성자를 default로 하면? 
// 클래스 선언부터 에러나서 class Ex03에 에러, super()에도 접근 불가
class Lec03 {
    public int su1=111;
    protected int su2 = 222;
    int su3 = 333;
    private int su4 = 444;

    protected Lec03 () {}
    Lec03(int s) {}

    private Lec03(double a) {

    }
}

/*
동일패키지이지만 클래스가 다를 경우
 */
public class Ex03 extends com.am.child.Lec02{
    public static void main(String[] args) {
        // Lec02 par = new Lec02();
        Ex03 par = new Ex03();
        System.out.println("public: "+par.su1);
         System.out.println("protected: "+par.su2); // 패키지 다르지만 접근 가능
         // System.out.println("default: "+par.su3); // 패키지 다르니까 접근 불허
//        System.out.println("private: "+par.su4);
    }
}
