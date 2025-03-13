package com.pm;

class Ex22{
    int su =111;
    public void func1(){}
}

public class Ex02 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Ex22 you;
        you = Ex22.class.newInstance();
        System.out.println(you.su);
        you.func1();
        // 이 코드에는 어디에도 뉴 키워드 호출이 없지만 객체 생성이 가능하다.
    }
}
