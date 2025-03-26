package ch12_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    1차 배열을 기준으로 1부터 45까지의 임의의 숫자를 뽑아 배열에 대입

    목표는 1차배열 내에 6개의 int값 집어넣기
    근데 중복이 있으면 안됨.

    그래서 복습을 한다고 가정하고 1~45까지의 숫자를 여섯개짜리 빈배열에 집어넣는것부터 시작
 */
public class Arrays15LottoGame {
    public static void main(String[] args) {
        //생각해봐야할 점 Math.random()을 사용해서 1~45의 범위를 만들려면 어떡해야할까

        //빈 배열 선언
        int[] lottoNumbers = new int[6];
        int round = 5;
        int temp = 0;            //자주쓰는 변수명으로 temporary의 축약어
        boolean duplicate;       //중복이 되었을때 true로 바꿔서 조건문을 실행시킬 예정


        for(int j = 0 ; j < round ; j++) {

            for (int i = 0; i < lottoNumbers.length; i++) {
                duplicate = false;      //얘가 여기있어야하만 하는 이유가 중요
                temp = (int) (Math.random() * 45) + 1;
                //temp에 들어간 난수가 이전 배열의 element아 값이 겹치는지를 확인
                for (int k = 0 ; k < i ; k++){      //중복을 체크하기 위해 현재 만들어져서 element가 대입된 부분까지만 탐색
                    if (lottoNumbers[k] == temp){
                        duplicate = true;   //얘가 true가 됐으면 조건문이 하나 더 필요합니다.
                    }
                }
                if(!duplicate){       //duplicate가 false라면 !duplicate가 true이므로 중복
                    lottoNumbers[i] = temp;
                }else {
                    //대입이 아니라 다시뽑아야함
                    i--;
                    //i=3일때 예를 들어 얘가 실행이 됐다면 i=2로 바뀌게 됩니다.
                }
                //여기까지 내려와서 for (int i) 파트의 반복문이 끝이 나게되면
                //i++가 적용되면서
            }
            System.out.println(Arrays.toString(lottoNumbers));
        }



    }
}
