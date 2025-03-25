package ch12_arrays;

public class Arrays07 {
    public static void main(String[] args) {
        int[] mathScores = {60,20,48,56,58,80,95,100,50,36,78,95,84,53};
        //그럼 이제 Array06에 정의한 메서드를 사용하여
        // 총합 평균과 garde당 인원수 출력하기

        Arrays06 arrays06 = new Arrays06();
        arrays06.printTotalInfo(mathScores);

    }


}
