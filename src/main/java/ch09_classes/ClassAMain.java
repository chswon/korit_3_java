package ch09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        // ClassA를 import

        // 클래스명 객체명  = new 클래스명();


        //Scnner import -> 알고보니 Scanner도 class였다
        // 그리고 이전까지는 scanner가 변수라고 했지만 사실은 객체였다.
        // 정확하게는 Scanner 클래스의 인스턴스였다.
        Scanner scanner = new Scanner(System.in);

//        //객체의 속성을 창조하는 법 : 객체명, 속성명
//        System.out.print("이름을 입력하세요. >>> ");
//        classA.name = scanner.nextLine();
//        System.out.println(classA.name + "입니다.");

        //객체 생성 -> 이름 점수 번호 를 입력
        /*
            1.classA1 이라는 객체 생성
            2.scanner를 통해 이름에 내이름
            3.점수 100점
            4. num 20250001
            실행 ㅖ
            이름 >>>
            점수>>>
            번호 >>>

            [ 실행 결과 ]
            2025 - 이름 : 여러분 이름 ,점수는 ㅏㅏ
         */
//        ClassA classA1 = new ClassA();
//        System.out.print("이름을 입력하세요 >>> ");
//        classA1.name = scanner.nextLine();
//        System.out.print("점수를 입력하세요 >>> ");
//        classA1.score = scanner.nextInt();
//        System.out.print("번호를 입력하세요 >>> ");
//        classA1.num = scanner.nextInt();
//
//        System.out.println("[ 실행 결과 ]");
//        System.out.println(classA1.num + " - 이름 : " + classA1.name + ", 점수는 " + classA1.score + "입니다.");

        // 이상까지의 코드는 객체의 속성 값을 대입하고, 이를 출력ㅎ나느 방법

        // method를 호출
        ClassA classA2 = new ClassA();
        classA2.name = "김이";
        classA2.callName();
        ClassA classA3 = new ClassA();
        classA3.name = "이삼";
        classA3.callName();
    }
}
