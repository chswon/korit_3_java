package ch06_condition;
    /*
    switch문

    형식 :
    switch(변수명)
        case 조건1:
            실행문1
           break;
        case 조건2:
            실행문2
           break;
        case 조건3:
            실행문3
           break;
        case 조건4:
            실행문4
           break;
       default:
            실행문5
     */


import java.util.Scanner;

public class Condition07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String selected = null;

        System.out.println("[선택 프로그램]");
        System.out.println("a. 메뉴1");
        System.out.println("b. 메뉴2");
        System.out.println("c. 메뉴3");
        System.out.println("d. 메뉴4");
        System.out.println("e. 메뉴5");
        System.out.println("메뉴를 선택하세요 >>> ");

        int selected2 = scanner.nextInt();

        switch (selected2) {
            case 1:
                System.out.println("메뉴 1을 선택하셨습니다.");
                 break;
            case 2:
                System.out.println("메뉴 2을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("메뉴 3을 선택하셨습니다.");
                break;
            case 4:
                System.out.println("메뉴 4을 선택하셨습니다.");
                break;
            case 5:
                System.out.println("메뉴 5을 선택하셨습니다.");
                break;
            default:
                System.out.println("잘못 선택하셨습니다.");
        }





//        if (selected == "a") {
//            System.out.println("메뉴 1을 선택하셨습니다.");
//        } else if (selected.equals("b")) {
//            System.out.println("메뉴 2를 선택하셨습니다.");
//        }  -> 가독성이 구림

//        switch (selected) {
//            case "a":
//                System.out.println("메뉴 1를 선택하셨습니다.");
//                break;
//            case "b":
//                System.out.println("메뉴 2를 선택하셨습니다.");
//                break;
//            case "c":
//                System.out.println("메뉴 3를 선택하셨습니다.");
//                break;
//            case "d":
//                System.out.println("메뉴 4를 선택하셨습니다.");
//                break;
//            case "e":
//                System.out.println("메뉴 5를 선택하셨습니다.");
//                break;
//            default :
//                System.out.println("잘못 선택하셨습니다.");
//        }
    }
}
