package com.pm;

// 앞서서의 interface로 확장?
interface Pen {
 // 따라서 generic은 미래가치의 반복을 줄일 수 있다.
}
//class Pen{
//    public void work(){
//        System.out.println("글글.글...");
//        // 암튼  implement 하던애들 전부 extends로
//    }
//}
//class Pen{
//    public void work() {
//        System.out.println("글 작성");
//    }
//}

class Ballpen implements Pen{
    public void work() {
        System.out.println("글을 작성합니다.");
    }
}

class Signpen implements Pen{
    public void work() {
        System.out.println("싸인합니다");
    }
}

// 근데 이 박스에다 제네릭을 적용해보자.
//class Box{
////    private Ballpen pen;
////    private Object pen;
//    private Pen pen;
//    public void setPen(Pen pen) {
//        this.pen=pen;
//    }
////    public Ballpen getPen() {
////    public Object getPen() {
//    public Pen getPen() {
//        return this.pen;
//    }
//}
class Box<T>{
    private T pen;
    public void setPen(T pen) {
        this.pen=pen;
    }
    public T getPen() {
        return this.pen;
    }
}

class Pencil{
    public void work() {
        System.out.println("그림도 그린다");
    }
}

public class Ex01 {
    public static void main(String[] args) {
        Pencil pen2 = new Pencil();
        Ballpen pen = new Ballpen();

        Box box = new Box();

        box.setPen(pen);
//        box.setPen(pen2);
//        Pen my = Box.getPen(); // 즉, Ballpen이나 Pencil 할 떄와 달리 가능은 해짐.

//        Ballpen my = box.getPen();
//        Pencil my2 = box.getPen(); // 에러남... 왜? Ballpen 이어서
        // 그래서 class Box에서 pen을 Ballpen에서 Object로 바꿔주자. getPen도!
        // 물론 Pencil my2 = (Pencil) box.getPen() 이런식으로 캐스팅은 가능함. 
        // 문제 없이 나오는 것처럼 보임.
        // 실행하면 exception.이 남. 
        // why? 하나의 공간에다가 두 개의 펜을 넣으니까 - 볼펜이랑 연필이랑. 
        // 이걸 해결하기 위해 다형성 도입 - class Pen
        
        // 근데 이번엔 또 사인펜을 넣어?

        // 제네릭 도입
        Box<Signpen> box1 = new Box<Signpen>();
//        box1.setPen(pen2);
        box1.setPen(new Signpen());
        Signpen my = box1.getPen();
        
        my.work();
        // 원래는 볼펜 담는 박스 하나, 연필용 박스 하나,
        // 추가로 사인펜 등장하는 순간 사인펜 박스 클래스도 만들어줘야 함.
        // 근데 이렇게함으로써 이제는 지우개를 담아도 지우개만 담을 수도 잇게 됨

        // 앞서서의 interface로 확장? interface Pen 만들면?
//        Box<Pen> ....
//        box.setPen(new Ballpen());
//        box.setPen(new Pencil());
//        // 새롭게 만들어진 signpen도 Pen을 상속할테니까
//        box.setPen(new Signpen());
//        Pen my = box.getPen()
//        my.work();
        // 이렇게 되면, 원래 <T>자리가 Objcet였기 때문에, 제네릭을 안 쓰면 자동으로 Object로 처리 됨


    }
}
