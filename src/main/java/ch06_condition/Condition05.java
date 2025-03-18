package ch06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("계산할 년도를 입력하세요 >>> " );
        int year = scanner.nextInt();

        String leapyear = "";

        if((year%100 == 0) && (year%400 == 0)) {
            leapyear = "은 윤년입니다.";
        } else if (year%100 == 0) {
            leapyear = "은 윤년이 아닙니다.";
        } else if (year%4 == 0) {
            leapyear = "은 윤년입니다.";
        } else {
            leapyear = "은 윤년이 아닙다.";
            }
        System.out.println(year + "년은" + leapyear);

    }
}
