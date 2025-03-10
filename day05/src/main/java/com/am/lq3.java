package com.am;
// 가위바위보 게임
import java.util.Scanner;

public class lq3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//        int line = sc.nextInt();
//        System.out.println(line);

        System.out.println(" 가위바위보 게임 ");
        String start = "가위(1), 바위(2), 보(3), 종료(0)>";

        int com = 0, userInput = 0;

        int userWin = 0, comWin = 0, same = 0;
        while (true) {
            // 1 > 3, 1 < 2
            // 2 > 1, 2 < 3
            // 3 > 2, 3 < 1
            System.out.println(start);

            userInput = sc.nextInt();
            com = (int)(Math.random()*10%3+1);

            System.out.println("당신: " + userInput + "\t\t" + "컴퓨터: " + com);

            // 비겼을 때
            if (userInput == com) {
                same += 1;
                System.out.println("비겼습니다");
            } else if ((userInput == 1 && com == 3) || (userInput == 2 && com == 1) || (userInput == 3 && com == 2)) {
                // user win
                userWin++;
                System.out.println("당신 승, 컴퓨터 패");
            } else if ((userInput == 1 && com == 2) || (userInput == 2 && com == 3) || (userInput == 3 && com == 1)) {
                // user lose
                comWin++;
                System.out.println("당신 패, 컴퓨터 승");
            } else if (userInput == 0) {
                break;
            } else {
                System.out.println("잘못된 수. 다시 시도하세요.");
            }
            System.out.println("-----------");
        }

        // 종료 후 승패
        System.out.println("승:" + userWin + " 무:" + same + " 패:" + comWin);
    }
}
