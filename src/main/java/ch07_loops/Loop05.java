package ch07_loops;

public class Loop05 {
    public static void main(String[] args) {
        // 1일차 1교시입니다 ~  5일차 3교시입니다.
//        for (int i =1 ; i < 6 ; i++) {
//            for(int j = 1 ; j < 4 ; j++) {
//                System.out.println(i + "일차")  + j + "교시입니다.");
//            }
//        }

//
//
        for (int dan = 2 ; dan < 10 ; dan++) {
            for( int num = 1 ; num < 10 ; num++) {
                System.out.println(dan + " X " + num + " = " + (dan*num));
            }
        }

//
//        for (int num = 1 ; num < 101 ; num += 10)
//            System.out.println(num + " " + (num+1) + " " + (num+2) + " " + (num+3) + " " + (num+4) + " " + (num+5) + " " + (num+6) + " " + (num+7) + " " + (num+8) + " " + (num+9));





    }
}
