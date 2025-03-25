package ch12_arrays;

import java.util.Scanner;

/*
        String[] names 배열을 선언하고
        출석부에 이름을 입력하여 names 배열에 값을 집어넣는 프로그램 작성

        실행 예
        몇 명의 학생을 등록 하시겠습니까? >>> 15
        1번 학생 이름 : 강수림
        2번 학생 이름 : 기준성
        3번 학생 이름 : 김미진
        4번 학생 이름 : 김준식
        5번 학생 이름 : 문성진
        6번 학생 이름 : 심민호
        7번 학생 이름 : 양지은
        8번 학생 이름 : 유지현
        9번 학생 이름 : 윤현지
        10번 학생 이름 : 이동규
        11번 학생 이름 : 이예성
        12번 학생 이름 : 이정화
        13번 학생 이름 : 전용남
        14번 학생 이름 : 채수원
        15번 학생 이름 : 한영진
         */
public class Arrays09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇명의 학생을 등록 하시겠습니까? >>> ");
        int intdexnum = scanner.nextInt();
        scanner.nextLine();
        String[] students = new String[intdexnum];


        for (int i = 0 ; i < students.length  ; i++){
            System.out.println((i+1) + "번째 학생 이름 : ");
            students[i] = scanner.nextLine();
        }


        for (String name : students){
            System.out.println(name);
        }




    }
}
