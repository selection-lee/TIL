package com.pm;

import java.io.*;
import java.util.*;
// 학생 클래스 만들어서 생성자랑 이름/학번/성적getter, setter
// 거기서 합계랑 평균도 계산해버릴까? 아님 함수를 Ex08 클래스에서 따로 만들까?
// override는?
// Comparable 인터페이스 상속받으면 학번 내림차순 정렬 시도해볼 수 있겠다 compareTo로!!
// 중복체크도 equals로?

// 4. 학생 클래스 구현할거 구현하기
class Student implements Comparable<Student> {
    // 학번, 이름, 국, 수, 영
    int num; // 학번
    String name;
    int kor, eng, math;
    // 생성자
    public Student(int num) {
        this.num = num;
    }
    // getter, setter
    public int getNum() {
        return num; // get 학번
    } // setter는 필요없음 - 학번은 자동할당이라. // 근데 수정할 땐 어쩌지? 일단 보류ㅠ...
    // 이름
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // 국어
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    // 영어
    public int getEng() {
        return eng;
    }
    public void setEng(int eng){
        this.eng = eng;
    }
    // 수학
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    // 합계는??
    public int totSum() {
        return kor + eng + math;
    }
    // 평균??
    public double avg() {
        return totSum() / 3.0;
    }


    // 학번 내림차순 정렬
    @Override
    public int compareTo(Student obj) {
        return obj.num/*학번*/ - this.num;/*학번*/
    }
}

public class Ex08 {
    // 학생성적관리프로그램(ver 0.11.0)
    // Set
    // 내림차순 학번
    // 중복불허 - 학번 - 존재하는 학생입니다.

    private static int nextId = 1; // 1번부터 자동부여
    private static Scanner sc = new Scanner(System.in);
    private static Set<Student> students = new HashSet<>(); // TreeSet 사용하면 순서 정렬이 된다는건가...?
    public static void main(String[] args) {
        System.out.println("학생성적관리프로그램(ver 0.11.0)-SET");

        // 1. 학생 데이터 저장 - set으로 중복 x
//        Set<Student> students = new HashSet<>();
//        Scanner sc = new Scanner(System.in);
        // 이건 입력받기 함수에서 하자. 그러려면 바깥에 static으로 듸워놔야..

        String input;
        int choice;

        // 2. 시작~!
        boolean boo = true;
        while (boo) {
            // 2.1 보기 입력받기
            System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료> ");
            // 앗 숫자말고 딴거들어오면 에러남
            try {
                choice = sc.nextInt();
                sc.nextLine(); // 이후로는 str 받을테니까 버퍼 비워야 함.,,,
            }catch (InputMismatchException e) {
                System.out.println("숫자만 가능");
                sc.nextLine(); // 버퍼 비우기
                continue;
            }
            
            // 2.2 종료조건
            if (choice == 0) boo = false;
            // 2.3 (1) 보기
            else if (choice == 1) {

            } else if (choice == 2) { // 2.2 (2) 입력
                addStudent();

            } else if (choice == 3) { // 2.3 (3) 수정

            } else if (choice == 4) { // 2.4 (4) 삭제

            }
        }
    }

    // 3. 학생 정보 입력
    private static void addStudent() {
        // 학번은 자동으로 지정해주자
        int stNum = nextId++;
        System.out.println("학번: " + stNum);

        // 여기선 학번 중복체크 할 필요 없겠지

        // 새로운 학생 객체 만들고 정보 입력하기
        Student stu = new Student(stNum); // 이제 학생 클래스 생성자랑 이런거 만들어줘야겠다
//        sc.nextLine(); // 버퍼 한 번 비워주기
        // 이 만들어진 학생 객체에 이름, 국,수,영 받기
        System.out.print("이름> ");
        stu.setName(sc.nextLine());
        System.out.print("국어> ");
        stu.setKor(sc.nextInt());
        System.out.print("영어> ");
        stu.setEng(sc.nextInt());
        System.out.print("수학> ");
        stu.setMath(sc.nextInt());


    }
}
