package ch00_review;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        //변수 : 데이터를 담는 바구니, 이름을 붙여줌.
        // 변수의 선언 방식
        // 자료형 변수명 = 데이터;
        // 자료형 : int double String boolean
        // 변수명 짓는 규칙 : 카멜케이스 - 소문자로 시작해서 단어마다 대문자   ex) myExample
        double height = 170;
        System.out.println(height);

        // 이름 나이 생년월일  선언 및 초기화 한뒤 sout
        String name = "채수원";
        int age = 27;
        int birth = 19991209;

        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
        System.out.println("생일은 " + birth + " 입니다.");
        System.out.println("10년 후에 저는 " + (age+10) + "살이 됩니다. 정말 싫네요.");


//        Scanner scanner =new Scanner(System.in);
//        String name = scanner.nextLine();
//        int age = scanner.nextInt();
//        int birth = scanner.nextInt();
//        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
//        System.out.println("생일은 " + birth + " 입니다.");
//        System.out.println("10년 후에 저는 " + (age+10) + "살이 됩니다. 정말 싫네요.");












    }
}
