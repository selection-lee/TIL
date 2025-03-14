package com.pm;

public class Ex01 {
    static com.am.Ex06 ex06;

    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();
//        java.io.PrintStream myOut = System.out;
//        myOut.println();
        // String msg = Ex01.ex06.toString();

        char[] arr1 = new char[]{'a', 'b', 'c'};
        char[] arr2 = new char[3];
        System.arraycopy(arr1, 0, arr2, 0, 3);
        arr1[1] = 'B';
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

//        String msg =
//        System.console().printf("aaa", args); // 이클립스 터미넌ㄹ은 진짜 콘솔이 아니라서 에러(?)
//        System.out.println(msg);
        /*
        > Task :com.pm.Ex01.main() FAILED

        a
        b
        c
        Exception in thread "main" java.lang.NullPointerException
            at com.pm.Ex01.main(Ex01.java:20)

         */

        long curTime = System.currentTimeMillis();
        System.out.println(curTime); // 1741930130727
        System.out.println(curTime-beforeTime); // 0
        String msg = "msg";
        for (int i = 0; i < 10000; i++) {
            msg += i;
        }
        long afterTime = System.currentTimeMillis();
        System.out.println(afterTime - curTime); // 253
        // cf) vm을 강제로 종료해야 될 상황(이 언제일진 모르겠으나) 그 떄를 위한 것이니까 쓸 일이 없을 것
        System.exit(0);  // 그말인즉슨, 쓸 일이 없을 것.
        // 평소에는 return을 써라.
        // gc : 가비지컬렉션에 등록을 하는 것 뿐. 호출한다고 해서 바로 되는 게 아니다.

        System.out.println();
    }
}
