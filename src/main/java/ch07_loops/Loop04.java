package ch07_loops;

import java.util.Scanner;

/*
        for 반복문 (for loop)
        :  대부분의 경우에는 명확한 횟수가 고정되어 있을때 사용하는 반복문

        형식 :
        for(시작값 ; 종료값 ; 증감값) {
            반복실행문
        }

     */
public class Loop04 {
    public static void main(String[] args) {
        // 1부터 100까지의ㅣ 합을구하는 for

//        int sum = 0;
//        for(int i = 1 ; i <= 100 ; i++) {
//            sum += i;
//        }
//        System.out.println(sum);


        Scanner scanner = new Scanner(System.in);
        System.out.println("1부터 몇까지 더하시겠습니까? >>> ");
        int n = scanner.nextInt();
        int sum2 = 0;

            for(int i = 1 ; i <= n ; i++ ) {
                sum2 += i;
            }
        System.out.println("합은" + sum2 + "입니다.");



    }
}
