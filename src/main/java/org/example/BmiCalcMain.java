package org.example;
/*
    BMI 계산기 작성

    1. 사용자에게 키 cm   몸무게를 입력받으시오
    2. 수학적 연산을 총해서 BMI 지수를 산출하시오
            몸무게 / 키의 제곱
    3. 18.5 저체중    23 미만 정상체중   25미만 과체중  25이상 비만
    에 해당하는 조건문 작성

 */


import java.util.Scanner;

public class BmiCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("키(cm)를 입력하세요. >>> ");
        double cm = scanner.nextInt();
        System.out.println("몸무게(kg)를 입력하세요. >>> ");
        double kg = scanner.nextInt();

        double bmi = kg / ((cm*0.01)*(cm*0.01));

        String you = "";

        if (bmi < 18.5){
            you = "저체중";
        } else if (bmi < 23) {
            you = "정상 체중";
        } else if (bmi < 25) {
            you = "과체중";
        } else if (bmi > 25) {
            you = "비만";
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }


        System.out.println("당신의 BMI지수는 " + bmi + " 이며, " + you + "입니다.");




        }
    }