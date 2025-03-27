package com.am;

public class Ex08 extends Thread {
    
    public Ex08() {
//        super("스레드 1"); // 이제 이름이 이게 됨
        // 처음부터 필드값 가지고
        // 디폴트 이름 부여한 후 이름 바꿔버림
//        setName("이름1");
    }

    public static void main(String[] args) {
        Ex08 me = new Ex08();
        Ex08 me2 = new Ex08();
        Ex08 me3 = new Ex08();

        // 근데 우선순위를 조종할 수도 있음
//        me.setPriority(5);
//        me2.setPriority(1);
//        me3.setPriority(10);
        // 일반적으로 ,숫자의 격차는 의미가 없음
        // min이 1이니까 한 번 수행할 떄 nomr 은 5니까 5번 수행하고? max가 10이면 10번?
        // 아니다!! 라는 게 정설
        // 만약 me2를 6으로 setPriority 해주면? ㄴㄴ ..
        // 우선순위 줬을 때는 상대적으로 크냐 작냐의 의미. 걍 확률이 높다 낮다 정도.
        // 절대 이 숫자의 격차만큼 차이 나지 ㅇ낳는 다는 것. 이게 텍스트적인 이론.
        // 실제로는 일어난다고는 함. 단, 그러려면 1년 돌려보고 측정해봐야 함.
        // 어쨌든 me는 시간을 뭐 1/1000초를 1번만 주고, 그걸 me2는 6 개를 주고,,,
        // max가 가장 커서 가장 확률이 높아도 me3 가 10인데도 가장 늦게 끝날 수도 있음. 우리는 작게 돌리니까 .
        // 여러번 돌려셔ㅓ 테스트? 여러번은 의미 x. 길게 기간을 늘려서 표본을 늘려야 하지, 횟수를 늘리는 건 x
        // 숫자는 10 개니까 알아서 주면 됨. 디폴트는 안 주면 5 !!
        me.setPriority(Thread.NORM_PRIORITY);
        me2.setPriority(Thread.MIN_PRIORITY);
        me3.setPriority(Thread.MAX_PRIORITY);

        me.start();
        me2.start();
        me3.start();
    }

    @Override
    public void run() {
        System.out.println(getName());
        // 가장 최신의 스레드
        Thread thread = Thread.currentThread(); // 이 코드를 수행한다는 건 이 코드를 실행하는 스레드를 반환할 것
        // 그 스레드를 가지고 겟네임을 하면 name값이 잘 나올 것.
        System.out.println(thread.getName());
        System.out.println(thread.getId());// 걍 랜덤하게 부여하는 id
        System.out.println(thread.getId());// 여러번 호출해도 숫자 long타입 같은 거 계속 반환
        System.out.println(thread.getState());
        System.out.println(thread.getName() + " : " + thread.getPriority()); // 우선순위
    }
}
