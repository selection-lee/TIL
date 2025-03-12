package com.am;

public class Ex03 {
    // String, Array는 특이하고 별도로 잘 만들어놧다
    // 예를들어 String은 +로 더하기가 가능. 얘만!
    // 그래서 얘네들은 객체는 객체지만 별도로 생각해야하는 특별한 객체.

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        // 만약 규칙성이 없다면 직접 부여하면 되겠지.
        // 어제수업 주민번호 한글입력처럼!
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = i*2+2;
//        }
        // 이렇게 초기화하지 할당하지 않으면 default값
        // 배열은 line5이 선언이고 이 for문이 초기화가 아니라,
        // int[] arr1 // 이게 선언 (or int[] arr1 = null;)
        // arr1 = new int[5] // 이게 초기화라는 것!!!
        // 이 때 배열 객체의 주소를 대입하는 것
        arr1 = new int[3]; // 더이상 int[5]는 가리키는 게 없게 되고 garbage collection이 알아서 지우게 됨
        // 그럼 이거 default 값은? null!! 그래서 자바 배열은 참조변수인 것

        int arr2[] = new int[5];
        int[] arr3 = new int[] {1,3,5,7,9};

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
