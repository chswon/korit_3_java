package ch00_review;

import java.util.Scanner;

public class Review03 {
    public static void main(String[] args) {
        /*
            조건문
            if (조건식){
            실행문
            }
            조건식 : true / false로 결정 나는 식
            조건식이 true면 {}내의 실행문이 실행됨.

            전체 형식:
            if (조건식1) {
                실행문1
            } else if (조건식2) {
                실행문2
            } else {
                실행문3
            }

            그리고, Nested if문
            if (조건식1-a){
                실행문1-a
                } else if (조건식1-b) {
                실행문1-b
                } else {
                 실행문1-b
            } else if (조건식2){
            } -------

            7세 미만은 탑승 불가
            110cm미만은 탑승 불가


         */

        int age = 0;
        int height = 0;

        Scanner scanner =new Scanner(System.in);
        System.out.println("나이를 입력하세요 >>> ");
        age = scanner.nextInt();
        System.out.println("키를 입력하세요 >>> ");
        height = scanner.nextInt();

//        if (age > 6) {
//            System.out.println("규정 나이 7세 이상입니다.");
//            if(height >= 110) {
//                System.out.println("롤러코스터 입장이 가능합니다.");
//            } else {
//                System.out.println("하지만 키가 딸려서 못탑니다.");
//            }
//            System.out.println("감사합니다.");
//        } else {
//            System.out.println("규정나이 미만으로 탑승이 불가능합니다.");
//        }


        if (height >= 110) {
            System.out.println("키는 일단 되기는 한데요");
            if(age > 6) {
                System.out.println("나이도 충분하니까 들어가세여");
            } else {
                System.out.println("나이가 딸리네요?");
            }
            System.out.println("나가");
        } else {
            System.out.println("나가");
        }

        System.out.println();

        if (height >= 110 && age > 6) {
            System.out.println("슥 봤는데 키 나이 둘다 맞네여 들어가세여.");
        } else {
            System.out.println("나가");
        }






    }
}
