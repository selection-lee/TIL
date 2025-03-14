package com.am;

// 인터페이스 코드적으로 어따쓰는 걸까? 
public class Ex05 implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] arr1 = {2,4,6,8};
        // 깊은복사 하고싶어
        // 근데 모든 클래스는 object 클래스 상속받음
        // Object클래스에는 clone()이라는 메소드가 있음 - 객체를 카피
        // 근데 모든 클래스는 object상속받으니까 쓸 수 ㅇㅆ겠지
        Object copy = arr1.clone();
        System.out.println(copy); // [I@2a139a55
        int[] arr2 = arr1;
        System.out.println(arr1);
        System.out.println(arr2);
        /*
        [I@15db9742
        [I@15db9742
         */
        // 얕은복사하니까 똑같이 나오고, 깊은복사하니까 다르게 나온다.
        Ex05 me = new Ex05();
        Object you = me.clone();
        // 어라 그런데 이건 실패함. 
        // implements Cloneable 붙여주니까 됨
        System.out.println("me "+ me);
        System.out.println("you " + you);
        // 클로너블interface의하는 역할은?
        // clone 메서드를 스려면 cloneable interface 붙었는지 여부 확인해야 함
        // 확인은 casting 해보면 됨
        /*
        me com.am.Ex05@6d06d69c
        you com.am.Ex05@7852e922
         */
        // 객체 복사 함부로 하면 안되니까 제약을 걸어놩 ㅑ하는데, 방법이 없음
        // 그래서 이 interface Cloneable상속받아야 쓸 수 잇게 함. 사실 내용물은 아무것도 없고.

    }
}
