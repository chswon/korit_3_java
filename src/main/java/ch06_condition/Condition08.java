package ch06_condition;

import java.util.Scanner;

/*
        사용자에게 score를 입력받아 다음과 같은 조건 만ㄴ족

        score 가 0 미만인나 100초과라면 grade = x
        changescore = 9~10, grade=a
        changescore = 8, gradeb = b
        changescore = 7, grade=c
        changescore = 6, grade=d
        changescore = 5,4,3,2,1,0  grade=e

     */
public class Condition08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int changeScore = 0;
        String grade = "";
        System.out.println("점수를 입력하세요  >>> ");
        score = scanner.nextInt();
        changeScore = score / 10;

        if (score > 100 || score < 0) {
            grade = "X";
        } else {
            switch (changeScore) {
                case 10:    // case 10,9   합쳐도 가능
//                    grade = "A";
//                    break;
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                default:
                    grade = "F";
            }
            System.out.println("점수는 " + score + "점이고, 학점은 " + grade + " 입니다.");
        }


    }
}









