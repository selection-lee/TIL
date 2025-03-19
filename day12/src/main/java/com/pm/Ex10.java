package com.pm;

public class Ex10 {
    public static void main(String[] args) {
        // 로또 (자료구조 사용)
        // 숫자 45개
        int[] lotto = new int[45];
        int[] note = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = i + 1;
        }
        // 랜덤 수 뽑기
        for (int i = 0; i < 1000; i++) {
            int ran = (int)(Math.random()*45);
            int temp = lotto[0];
            lotto[0] = lotto[ran];
            lotto[ran] = temp;
        }
    }
    // 이런 걸 하라는 게 아니었군...
}