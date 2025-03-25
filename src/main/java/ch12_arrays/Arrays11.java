package ch12_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/*
    배열의 출력
    이전 수업에서 sout(arr)형태로 배열을 출력하게 되면 배열은 참조 변수이기 때문에
    주소값만 출력된다는 점을 확인했습니다. 그리고 반복문을 통해 element들을
    불러올 수는 있지만 배열 전체를 출력하는 방법은 현재까진 없었습니다.

    Array 클래스를 사용하고 정적 메서드 .toString(배열명)을 사용하면
    배열 전체를 출력할 수 있습니다

    여기서 클래스명.메서드명()이라는 점에 주목할 필요가 있습니다.
    scanner.nextLine()과는 다릅니다.
    그리고 또한 toString()이라는 메서드도 곧 사용하니다

    여기서 기억해야 할 점은 동일한 메서드명ㅇ라고 하더라도 어떤클래스에 종속 돼잇는가에 따라
    다른 결과값을 지닐 수 있다는 점입니다.
    ex) random.nextInt(); -> int 범위 내에 있는 임의의 정수를 반환
    ex) scanner.nextInt(); -> int를 콘솔에 입력해서 그 값을 대입

     */
public class Arrays11 {
    public static void main(String[] args) {
        //동일한 메서드명이지만 클래스에 따라 다른 로직이라는 점의 예시

        //빈 배열 nums 를 선언하고 1~10까지 집어넣
        // 그리고 1234 10 출력
        int[] nums = new int[10];

        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = i+1;
            System.out.print(nums[i]+" ");
        }

        System.out.println();

        for(int num : nums){
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(nums)); //보기만 할때 쓰는애

        Integer[] numbers = {4,7,1,9,6,2,5,8,10,3};

        System.out.println("정렬 전 배열 : " + Arrays.toString(numbers));

        //오름차순 정렬
        Arrays.sort(numbers);
        // 대부분의 경우에는 메서드를 사용하고 나면 그 결과값을 변수에 대입해왔지만,
        // .sort() 메서드의 경우 numbers 배열의 순서 자체를 다 바꿔버립니다.(원본의 배열을 바꿈.)
        // 그래서 인덱스 넘버에 따른 결과도 다 달라집니다.

        for(int i = 0 ; i < numbers.length ; i++){
            numbers[i] = i+1;
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.println("정렬 후 배열 : " + Arrays.toString(numbers));

        //내림 차순 배열
        Arrays.sort(numbers, Comparator.reverseOrder());
        // .sort() 내부의 argument가 두개라는 점에서 여러분들은
        // overloading이 이루어졌다는 점을 추축할 수 있으면 현재는 만족스럽습니다.
        // Comparator.reverseOrder() 메서드를 사용하기 위해서
        // int[]를 Interger[]로 바꿨는데 기본잘형 int를 String처럼 클래스로 바꿨다고만 일단 생각

        double a =1.2;
        double b = 1.2;












    }
}
