package com.pm;

public class Ex07 {
    public static Number div(int a, int b) {
        if (a % b == 0) return a / b;
        return 1.0 * a / b;
    }

    public static void main(String[] args) {
        Number res = div(5,2);
        System.out.println(res); // 그래서 이것도 다형성?
    }
}
