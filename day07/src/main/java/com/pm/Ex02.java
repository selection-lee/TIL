package com.pm;

public class Ex02 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {2,4,6,8};
        int[] arr2 = new int[4];
        System.arraycopy(arr1,0,arr2,0,4);

        arr1[2] =222;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        } // 2 4 6 8
        // 깊은복사가 되어서 arrr2는 영향 안받은 것

        System.out.println("-------------------------");
        int[][] arr3 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr4 = new int[3][];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = new int[3];
            // System.arraycopy(src,srcPos,dest,destPos,length);
            System.arraycopy(arr3[i], 0, arr4[i], 0, 3); // 0번부터 3개
        }
        arr3[1][1] = 0;
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j]);
            }
            System.out.println();
        }
    }
}
