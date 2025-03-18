package ch06_condition;

import java.util.Scanner;

/*
    중첩 if

    형식:
    if(조건식1) {
        if (조건식1-a) {
            실행문1-a
            } else if (조건식1-b)
            실행문1-b
            } else {
                실행문 1-c
            }
    }else if (조건식2) {
     설명문2
     if(조건식2-a) {
     실행문2-a
     } else {
        실행문2-b
     } else {
     실행문3
     }

 */
public class Condition06 {
    public static void main(String[] args) {

        /*
        사용자에게 score를 이ㅣㅂ력받아 다음과 같은조건
        스코어가 0보다 작거나 100초과라면 grade는 x
        score 90~100, grade= A
        score 80~90, grade= B
        score 70~80, grade= C
        score 60~70, grade= D
        score 50~59, grade= F

         */
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade = "";
        System.out.println("점수를 입력하세요 >>> ");
        score = scanner.nextInt();

//        if (score < 0) {
//            grade = "X";
//        } else {            //얘의 조건은 grade>= 0
//            if (score > 100) {
//                grade = "X";
//            } else {                //이 부분의 조건은 grade>=0 && grade <=100
//                if (score >= 90) {
//                    grade = "A";
//                } else if (score >= 80) {
//                    grade = "B";
//                } else if (score >= 70) {
//                    grade = "C";
//                } else if (score >= 60) {
//                    grade = "D";
//                } else {
//                    grade = "F";
//                }
//            }
//        }


        if (score > 100 || score < 0) {
            grade = "X";
            System.out.println();
        } else {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("당신의 등급 : " + grade);
        }
    }
}
