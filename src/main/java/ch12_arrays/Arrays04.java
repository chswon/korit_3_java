package ch12_arrays;

import java.util.Scanner;

public class Arrays04 {

    public void writeNames(String[] names){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < names.length ; i++  ){
            System.out.println((i+1) + "번 학생 : ");
            names[i] = scanner.nextLine();
        }
    }

    public void printNames(String[] names){
        for (int i = 0 ; i < names.length ; i++){
            System.out.println((i+1) + "번 학생 : " + names[i]);
        }
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays04 array04 = new Arrays04();
        // 인덱스 넘버 확정
        System.out.println("몇 명의 학생을 입력 하시겠습니까 >>> ");
        int indexNum = scanner.nextInt();
        scanner.nextLine();
        // 비어있는 배열 선언
        String[] names = new String[indexNum];

        array04.writeNames(names);
        System.out.println();
        array04.printNames(names);




    }
}
