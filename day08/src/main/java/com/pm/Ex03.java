package com.pm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex03 {
    // Class라는 클래스가 있다...? 
    // class와 Class는 다르다
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 클래스의 정보를 갖는 객체
        Class ex03 = Ex03.class;                        // 클래스 갖고 있음
        System.out.println(ex03); // class com.pm.Ex03
        Class clz;
        clz = Class.class;
//        clz = Class.forName("com.pm.Ex032");
        /*
        Execution failed for task ':com.pm.Ex03.main()'.
> Process 'command 'C:\Program Files\ojdkbuild\java-1.8.0-openjdk-1.8.0.332-1\bin\java.exe'' finished with non-zero exit value 1
         */
        clz = Class.forName("com.pm.Ex03"); // 클래스 없을 때
        // ㄴ>이미 여기서 얘로 객체가 생성됨
        System.out.println(clz); // class com.pm.Ex03
        System.out.println(clz.newInstance());

        // Ex03 me = clz.newInstance(); // 에러 -> Ex03은 방금 내가만든 클래스
        // 존재하지 않았는데 어떻게 리턴타입을 주겠어. 못하지. 그래서 메소드 만들 당시에 리턴타입을 앞서 상속에서배웠던 것처럼 Object 클래스로 처리해놨으면 모든 클래스를 받을 수 있겠다.
        // 따라서!
        Object me = clz.newInstance(); // 다만 여기서 정의가 되어있어야 쓸 수 있다는 건가?
        // Object는???
        // Ex03 me = (Ex03)(clz.newInstance()); // 이렇게 타입캐스팅도 가능함.
//        Ex22 me = (Ex22)(clz.newInstance()); // new 키워드 없 이 객체생성 성공. 전제조건은 Class 클래스가 필요함. 
//        System.out.println(me.su);
//        me.func01();

        // 재밌는 것도 할 수 있다는데 뭐지
        Constructor[] constructs =  ex03.getConstructors();
        for (int i = 0; i < constructs.length;i++) {
            System.out.println(constructs[i]);
        } // public class com.pm.Ex03 이렇게 나온다는데 비스무리하게,, 근데 나는 아에 안나오네
        Field[] arr2 = ex03.getDeclaredFields();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        Method[] arr3 = ex03.getDeclaredMethods();
        for(int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        // 롬복이 이렇게 해서 만들어진 거다!!!
    }
}
