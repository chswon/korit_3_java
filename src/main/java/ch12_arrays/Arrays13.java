package ch12_arrays;

import java.util.Arrays;

/*
    다차원 배열(Multi Demensional Array) 중 2차원 배열

    : 다차원 배열은 2차원 이상의 배열을 의미하지만, 개발 관경 상 2차원 배열 이상을 다루는 경우는
    극히 드물기 때문에 2차원 배열을 기준으로 강의합니다.

    형식 :
    int[][] arr01 = new int[크기][크기];   -선언방식 1
    int[][] arr02 = new int[크기][];   -선언방식 2
    int[][] arr03 = {{1,2}, {3,4}, {5,6}}   -선언방식 3
    2차원 배열 선언시, 열의 크기는 지정하지 않아도 되지만, 형의 크기는 항상 지정해야 함.
    -> 2번 방식이 해당합니다.

                1열 2열(column)
                { 1,2 },            → 가로줄 : 행 - 1행(row)
                { 3,4 },                           2행
                { 5,6 }                            3행

 */
public class Arrays13 {
    public static void main(String[] args) {
        int[][] arr01 = {
                { 1,2 },
                { 3,4 },
                { 5,6 }
        };
        System.out.println(arr01[2][0]);
        System.out.println(arr01);
        System.out.println(arr01[1]);
        System.out.println(Arrays.toString(arr01));

//        System.out.println(arr01[0][0]);
//        System.out.println(arr01[0][1]);
//        System.out.println(arr01[1][0]);
//        System.out.println(arr01[1][1]);
//        System.out.println(arr01[2][0]);
//        System.out.println(arr01[2][1]);

        //2중 for문을 통한 2차배열의 element 추출
        for (int i = 0 ; i < arr01.length ; i++){
            for (int j = 0 ; j < arr01[i].length ; j++ ){
                System.out.println(arr01[i][j]);
            }
        }

        //향상된 for문으로 추출
        for(int[] element : arr01 ){
            for (int number : element){
                System.out.print(number + "/");
            }
        }





    }
}
