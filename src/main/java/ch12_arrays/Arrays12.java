package ch12_arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
    여태까지 배운 Java클래스
    String
    Scanner
    Arrays
    Integer
    Double
    Comparator
    Random
    방금 배운거
    Math

    지시사항
    배열이름은 numbers[]

    1.인덱스가 10개인 빈 배열을 만들고 math.ramdom()을 활용하여 값을 넣을겁니다
        1이상 10 이하의 int 값으로

    2. 1을 끝내게 되면 numbers 배열 안에는 1~10의 element를 가지게 될겁니다(중복)
        1)배열 전체 출력 -> Arrays를 사용
        2) 각 요소에 10씩 곱해서 한줄에 출력 -> element별로 뽑아내서 연산
    3. 해당 배열의 합의 크기를 구할것
        (랜덤으로 element 집어넣으니까 실행할때마다 값이 다를 예정)
    4. 짝수만 출력해서 합

    5. 배열 오름차순 출력
    6. 내림차순
 */
public class Arrays12 {
    public static void main(String[] args) {
        // Math 클래스를 사용한 임의의 실수 대입
        //double a = Math.random(); //0.0초과 1.0미만의 난수 생성해서 반환
//        System.out.println(a);
        Integer[] numbers = new Integer[10];
        /*
            Math.random()의 결과값은 0.0~1.0미만 이므로
            0.0< a <1.0    에서 10 곱해주고
            0.0< a <10.0   에사 1 더해줍니다
            0.0< a <11.0   그럼 이렇게 되는데 int로 형변환
         */

        for(int i = 0 ; i < numbers.length ; i++){
            numbers[i] = (int)(Math.random()*10)+1;
        }

        System.out.println(Arrays.toString(numbers));

        for(int i = 0 ; i < numbers.length ; i++){
            numbers[i] = (int)((Math.random()*10)+1)*10;
        }

        System.out.println(Arrays.toString(numbers));

        int sum = 0;

        for(int i = 0 ; i < numbers.length ; i++){
            numbers[i] = (int)(Math.random()*10+1);
            sum += numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);

        for(int i = 0 ; i < numbers.length ; i++){
            numbers[i] = (int)(Math.random()*10+1);
            if (numbers[i]%2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);


        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numbers));

    }
}
