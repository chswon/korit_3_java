package ch12_arrays;

import java.util.Arrays;

public class Arrays14 {


    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        int number = 0;

        // 1부터 100까지의 숫자를 nums 배열에 순서대로 값을 넣으시오.
        for (int i = 0 ; i < nums.length ; i++){
            for (int j = 0 ; j < nums[i].length ; j++){
                nums[i][j] = number++;
            }
        }

        for (int i = 0 ; i < nums.length ; i++){
            for (int j = 0 ; j < nums[i].length ; j++){
                System.out.print(nums[i][j] + "/");
            }
            System.out.println();
        }

        //2차 배열의 출력
        //Array.toString()이 안먹힌다는 것이 확인했었습니다.
        System.out.println(Arrays.deepToString(nums));





    }
}
