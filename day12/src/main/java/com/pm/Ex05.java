package com.pm;

import java.util.LinkedList;
import java.util.Queue;

public class Ex05 {
    public static void main(String[] args) {
        // 선입선출(FIFO)
        Queue q = new LinkedList();
        // 큐는 사용할 수 있는 명령어가 제한되어 있음
        // 근데 add도 있는데? 표로 나와있음. 추가를 할 때는 add, offer
        // 지울 때는 remove, poll
        //  어디가지 와있나는 element, peek
        // add, remove, element는 exception은 error throw, 후자는 특정값으로 리턴
        // try-catch 쓸 게 아니라면 offer, poll, peek 쓰는 게 편할 것이다
        q.offer("첫");
        q.offer("둘");
        q.offer("세");
        q.offer("넷");
        q.offer("다섯");

//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll()); // 없으면 exception error 말고 specific한 special 값으로 리턴
        // 내가 넣지 않았지만 null로 리턴해줌

//        System.out.println(q.peek());
//        q.poll();
//        System.out.println(q.peek());
//        q.poll();
//        System.out.println(q.peek());
//        q.poll();
//        System.out.println(q.peek());
//        q.poll();
//        System.out.println(q.peek());
//        q.poll();
//        System.out.println(q.peek()); // null
//        q.poll();

        Object obj = null;
        while ((obj = q.poll()) != null) {
            System.out.println(obj);
        }
        System.out.println("=====");
        while (q.peek() != null) {
            System.out.println(q.poll());
        } // 어라 난 왜 이게 출력이 안되지...
        // 내가 바보네 위에꺼 실행하고 나니까 당연하지.. 위에꺼 while문 주석처리 하고 하면 잘 됨

    }
}
