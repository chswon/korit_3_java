package ch07_loops;
    /*
        2중 for문
        for(int i = 0 ; i < 10 ; i++) {
        반복실행문 1-a
        for (int j = 0 ; i< 5 ; j++) {
            반복실행문2
            }
            반복실행문1-b
            for(int k = 0 ; k < 20 ; k++) {
                반복실행문3
                }
                반복실행문1-c

     */
public class Loop07 {
        public static void main(String[] args) {
//        for(int i = 0 ; i < 6 ; i++) {
//            for(int j = 0  ; j < i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            }
        /*
                별찍기를 통한 for문 구조 학습
                i = 0  j = 0 이면 개행이 일어나야 함(실행문2 = 실행 x)
                i = 1 일때 j = 0  일때에는 * / j = 1일 때에는 개행
                i = 2 일때 j = 0, 1 일때에는 * /  j = 2일때에는 개행

         */

//        for(int i = 100 ; i > -1 ; i--) {
//            System.out.println(i);
//        }
            //개행을 위한 1차 for문
            for (int i = 5; i > 0 ; i--) {                        //별찍기를 위한 2차 for문
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println();

            for (int i = 0; i < 5 ; i++) {
                for (int j = 5; j-i > 0 ; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }





        }
    }
