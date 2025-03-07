package com.pm;

public class q2 {
    public static void main(String[] args) {
        char start = 'A';
        for(int r = 1; r < 5; r++) {
            for (int c = 1; c < 5-r; c++){
                System.out.print(" ");
            }
            for (int c = 0; c < r; c++){
                System.out.print(start);
                // 이제 이걸 알파벳으로 하면?
                // A
                // B, C 
                // 결국 순서대로 하나씩 출력하는 거니까 시작하는 A에다가 1씩 더해주면 가능
                start++;
            }
            System.out.println("");
        }
    }
}
