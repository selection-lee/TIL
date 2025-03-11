package com.am;

public class Ex05 {

    public static void main(String[] args) {
        // 배열
        // 자료형[] = new 자료형[갯수];
        // 다중의 값을 담을 수 있다
        // 단, 자료형이 동일한 다중의 값을 담을 수 있다
        // 원칙
        int[] a = new int[4];
        a[0] = 2;
        a[1] = 4;
        a[2] = 6;
        a[3] = 8;
        // 축약하고 싶으면
        int[] b = new int[]{2, 4, 6, 8};
        // 되도록 이렇게 쓰지나느 마라는 건가?
        int[] c = {2, 4, 6, 8};

        for (int i = 0; i < 4; i++) {
            System.out.println(a[i]);
        }
    }
}
