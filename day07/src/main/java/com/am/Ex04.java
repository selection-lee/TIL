package com.am;

public class Ex04 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {2,4,6,8};

        int[] arr2 = arr1;
        // 배열의 얕은 복사
        // 단, 치명적인 단점이 있음
//        arr1[1] = 3; // 난 arr1을 바꿨는데, arr2가 2368로 변경됨.
        // line7에서 배열 복사를 했는데, 배열 객체를 가리키는 주소를 대입한 것이기 때문!
        // 즉, {2,4,6,8}을 arr1과 arr2 둘 다 가리키는 것.
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr2[i]);
        } // 2 4 6 8 // 2 3 6 8
        // clone 해서 영향이 없게 하려면?
        int[] arr2_1 = null;
        arr2_1 = new int[4];
        // 깊은 복사
        for (int i = 0; i < arr2_1.length; i++) {
            arr2_1[i] = arr1[i];
        }
        arr1[1] = 3; // 난 arr1을 바꿨는데, arr2가 2368로 변경됨.
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr2_1[i]);
        } // 2 4 6 8
        System.out.println(" 값 바꾸 ㄴ후");
        arrPrint(arr2_1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr2_1[i]);
        } // 2 4 6 8 // 함수에서 값 바꾼 후 다시 왔더니 2 3 6 8
        // 왜 바뀔까??
        // 함수에 매개변수를 보면, int[]arr2 = arr2_1 이라고 봐야 함
        // 즉, 호출만 해도 얕은복사가 이루어지는 것!
    }

    // 깊은 복사 더 자주 쓸 것 같지만, 사실 얕은 복사를 더 많이 쓰게 됨
    public static void arrPrint(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        } // 2 4 6 8
        arr2[1] = 3;
    }
}
