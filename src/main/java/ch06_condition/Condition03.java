package ch06_condition;

import java.util.Scanner;

/*
        if-else  if문 : if - eles문과 달리 else if에는 별도의 조건문이 요구됨

        형식:
        if(조건식) {
            실행문
        } else if(조건식2) {
        } else if(조건식3) {
            실행문3
        }
     */
public class Condition03 {
    public static void main(String[] args) {
            //1
        Scanner scanner = new Scanner(System.in);

        int point = 0;
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int Bronze_POINT = 20;

        //2의 추가 부분을 통해 코드 효율화
        String rating = "";

        // 콘솔에 찍히기 시작하면서 프로그램의 시작
        System.out.println("회원 포인트를 입력하세요 >>> ");
        // 포인트 변수에 데이터 재대입
        point = scanner.nextInt();

        // 조건문 작성

//        if(point > 80) {
//            System.out.println("회원의 등급: VIP");
//        } else if (point > 60) {
//            System.out.println("회원의 등급 : GOLD");
//        } else if (point > 40) {
//            System.out.println("회원의 등급 : SILVER");
//        } else if (point > 20) {
//            System.out.println("회원의 등급 : BRONZE");
//        } else if (point <= 20) {
//            System.out.println("회원의 등급 : 일반");
//        }
//        if(point > VIP_POINT) {
//            System.out.println("회원의 등급: VIP");
//        } else if (point > GOLD_POINT) {
//            System.out.println("회원의 등급 : GOLD");
//        } else if (point > SILVER_POINT) {
//            System.out.println("회원의 등급 : SILVER");
//        } else if (point > Bronze_POINT) {
//            System.out.println("회원의 등급 : BRONZE");
//        } else if (point <= Bronze_POINT) {
//            System.out.println("회원의 등급 : 일반");
//        }
        // 이상의 두 가지 방법 중에서 개발 환경 상으로는 #2 가 더 선호됨.
        // 추후 수정이 편함

        if(point > VIP_POINT) {
            rating = "VIP";
        } else if (point > GOLD_POINT) {
            rating = "GOLD";
        } else if (point > SILVER_POINT) {
            rating = "SILVER";
        } else if (point > Bronze_POINT) {
            rating = "BRONZE";
        } else if (point <= Bronze_POINT) {
            rating = "일반";
        }
        System.out.println("당신의 등급 : " + rating );
    }
}
