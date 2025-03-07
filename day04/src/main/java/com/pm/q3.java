package com.pm;

public class q3 {
    public static void main(String[] args) {
        int startNum = 1;
        for(int r = 0; r < 4; r++) {
            for (int c = 0; c < 4-r; c++ ) {
                System.out.print(startNum);
                startNum = (startNum + 1) %10;
            }
            System.out.println();
        }
    }
}
