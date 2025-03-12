package com.am;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{4, 5, 6};
        int[] arr3 = new int[]{7, 8, 9};
        int a = 1;
//        int[][] arr4 = new int[][]{arr1, arr2, arr3};
        // 타입은 int[], 엘리먼트 요소가 [] (int 배열)
        int[][] arr4 = new int[3][];
        System.out.println(Arrays.deepToString(arr4)); // [null, null, null]
        int[][] arr4_1 = new int[3][4]; // default 값 0인 4 개의 배열을 처음에 주고 시작한다는 것
        // arr4_1 = int[][] {new int [4], new int [4], new int [4]}
        // 그냥 객체 3개를 갖는 건데 내용물이 int 배열
        // String[] arr = new String[] {"a", "abc", "abcd"} 
        // 그냥 객체 3개를 갖는 건데 내용물이 문자열. 즉 객체의 대상만 다른 것 뿐이다
        System.out.println(Arrays.deepToString(arr4_1)); // [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
//        arr4[0] = arr1;
        arr4[0] = new int[]{1, 2, 3}; // 한 번만 쓸거면 굳이 여러번 할 필요 없이 여기서 한 번에 하면 됨
        arr4[1] = arr2;
        arr4[2] = arr3; // 이렇게 해주면 new int[][]{arr1, arr2, arr3}; 랑 똑같다
        // cf) 이런건 변수의 초기화가 아니고 걍 값의 수정임.

        for (int i = 0; i < arr4.length; i++) {
            // temp = arr4[i] => 타입이 어떻게 될까? int[] 즉 int배열
            int[] temp = arr4[i];
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[j]);
            }
            System.out.println();
        }
        System.out.println("-------------------");
        int[][] arr6 = arr4_1;
        arr4_1[1] = new int[] {3,4};
        for (int i = 0; i < arr6.length; i++) {
            int[] temp = arr6[i];
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[j]);
            }
            System.out.println();
        }
        System.out.println("-------------------");
        int[][] arr7 = arr4_1;
        arr4_1[1] = new int[] {3,4};
        for (int i = 0; i < arr7.length; i++) {
            int[] temp = arr7[i];
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[j]);
            }
            System.out.println();
        }
        System.out.println("-------------------깊은복사는? ");
        int[][] arr8 = null;
        arr7 = new int[3][];
        for (int i = 0; i < arr8.length; i++) {
            int[] temp = arr4[i];
            int[] temp2 = arr7[i];
            for (int j = 0; j <temp.length; j++) {
                temp2[j] = temp[j];
            }
            System.out.println();
        }
    }
}
