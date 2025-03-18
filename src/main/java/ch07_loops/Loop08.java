package ch07_loops;

import java.util.Scanner;

public class Loop08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("몇 줄의 별을 생성하시겠습니까? >>> ");
//        int c = scanner.nextInt();

//        for(int i = 0 ; i < c+1  ; i++) {
//            for( int j = 0 ; j < i ; j++ ) {
//                System.out.print("*");
//            }
//            System.out.println();
//            }



        /*
            기본적으로 개행이 이루어지는 부분과 별이  찍히는 부분 때문에 2중 for문은 전제되어야 한다는 점.

            추가된 사항인 row변수와 관련된 부분이 개행으 ㅣ한계값과 관련이 있다는 점을
         */


        for (int i = 5 ; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 6; j - i > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
//        for(int i = 0 ; i < 6 ; i++) {
//            for(int j = 0  ; j < i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            }


        // 개행 관련 for문
        for (int i = 0 ; i < 6 ; i++) {
            // 공백 관련 for문
            for (int j = 5 ; j > i ; j--) {
                System.out.print(" ");
            }
            // 별 찍기 관련 for문
            for (int k = 0 ; k < i ; k++) {
                System.out.print("*");
            }
            // 개행 실행문
            System.out.println();
        }

        // # 2
        for (int i = 0 ; i < 6 ; i++) {
            for (int j = 0 ; j < 6-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0 ; k < i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
