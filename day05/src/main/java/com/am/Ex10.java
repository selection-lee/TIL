package com.am;

public class Ex10 {
    public static int su2 = 222;
    public static void main(String[] args) {
        int su1 = 111;
        System.out.println("main su1= "+su1);
        System.out.println("main su2= " + su2);
        func01(su1);
        func01();
        System.out.println("main su1= "+su1);
        System.out.println("main su2= "+su2);
    }

    public static void func01(int su1) {
        su1++;
        System.out.println("func01 su1= " + su1);
    }
    public static void func01() {
        su2++;
        System.out.println("func01 su2= " + su2);
    }
}
