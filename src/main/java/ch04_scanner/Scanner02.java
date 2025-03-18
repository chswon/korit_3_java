package ch04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
            문자열 입력
            next() : 띄어쓰기를 포함하지 않음
            nextline() : 띄어쓰기를 포함하고 엔터키(개행) 기준으로 데이터를 입력 받음


         */
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("주소를 입력하세요 >>> ");
        String adress = scanner.nextLine();
        System.out.print("나이를 입력하세요 >>> ");
        int age = scanner.nextInt();
        System.out.println();
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + adress);
        System.out.println("나이 : " + age);
        System.out.println("내년 나이 : " + (age + 1));


    }
}
