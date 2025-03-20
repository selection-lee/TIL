package com.pm;

public class Ex06 {
    public static void main(String[] args) {
        // 와일드...
        Box<? super Pen> box = new Box<>();
        box.setPen(new Ballpen());
//        box.setPen(new Pencil()); // 어라 앞에서 뭐가 바뀌었길래....
        // 암튼 Ex01에서 interface가 아니라 class면?
        /* class Pen{
            public void work(){
                System.out.println("글글.글...");
                // 암튼  implement 하던애들 전부 extends로
            }
        } */
        // wild는 암거나 올 수 있는데, 부모로 펜을 가져야 올 수 있는 와일드 
        // setpen(new Object()) => 부모는 Object를 안갖고 있으니까 안 됨

        // 마찬가지로 wild
        Box<? extends Pen> box2 = new Box<>();
//        box2.setPen(new Ballpen());
//        box2.setPen(new Pen());
//        box2.setPen(new Pencil());
//        box2.setPen(new Object());

        // 앞자리 분이 물어보신 거..........
        // 원칙적으로는 super나 extends 아래에서 setPen 둘 다 안되어야 되는 게 맞음
        // wild는 원래 무조건 쓰기 위해 사전에 타입을 결정을 해줘야 함.
        // 단, 캐스팅 허용 범위는 Ex07을 참고하라는 거지.
        // 이 범주를 벗어나게 되면 오류가 떨어진다.
        // 그냥 이 Ex06에서는 원래 안되어야하는건데 어짜다 괜히 빨간줄이 안 떠서 우릴 헷갈리게 하는 것.
    }
}
