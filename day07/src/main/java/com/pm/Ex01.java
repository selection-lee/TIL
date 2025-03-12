package com.pm;

public class Ex01 {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        arr1[2][0] = 7;
        arr1[2][1] = 8;
        arr1[2][2] = 9;
        // 근데 이렇게는? 
        int[][] arr = new int[3][];
        // {null,null,null}이라서 
        // arr[n][] 형식으로만 할당 가능
        // arr1이랑 똑같이 쓰려면?
        // arr[n] = new int[3]; 이런식으로 초기화해줘야 함
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }
}
