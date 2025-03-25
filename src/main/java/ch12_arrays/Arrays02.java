package ch12_arrays;

import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        // 비어있는 배열 선언 방식
//        int[] arr01 = new int[100];
//
//        //1부터 100까지의 element를 집어넣는 코드
//        for (int i = 0 ; i < arr01.length ; i++){
//            arr01[i] = (i+1);               //여기서 값 대입
//            //System.out.print(arr01[i] + " ");  // 여기서 출력
//            if (arr01[i]%3 == 0){
//                System.out.println(arr01[i] + " ");
//            }
//        }

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇명의 학생을 등록 하시겠습니까? >>> ");
        int intdexnum = scanner.nextInt();
        String[] names = new String[intdexnum];



        for (int i = 0 ; i < names.length  ; i++){
            System.out.print((i+1) + "번째 학생 이름 : ");
            names[i] = scanner.nextLine();
        }


        for (int i = 0 ; i < names.length  ; i++){
            if ((i+1) % 5 ==0){
                System.out.println(names[i] + " ");
            }
        }






    }
}
