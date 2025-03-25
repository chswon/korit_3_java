package ch12_arrays;

public class Arrays06 {

    //얘의 총합
    private int calcsum(int[] scores){
       int sum= 0;  //지역변수
        for (int i = 0 ; i < scores.length ; i++){
            sum += scores[i];
        }
        return sum;
    }

    //얘의 평균
    private double calcavg(int[] scores) {
        double avg = 0;
        int sum = 0;
        sum = calcsum(scores);
//        for (int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//        }     보니까 이부분이 위랑 같네 -> 이 연산의결과가 sum
        avg = (double) sum/scores.length;
        return avg;
    }


 //    등급 인원수

private void countGrade(int[] scores) {
    int[] grade = {0, 0, 0, 0, 0};
    for (int i = 0; i < scores.length; i++) {
        if (scores[i] > 89) {
            grade[0]++;
        } else if (scores[i] > 79) {
            grade[1]++;
        } else if (scores[i] > 69) {
            grade[2]++;
        } else if (scores[i] > 59) {
            grade[3]++;
        } else if (scores[i] < 60) {
            grade[4]++;
        }
    }
    System.out.println("A 학생 수 : " + grade[0]);
    System.out.println("B 학생 수 : " + grade[1]);
    System.out.println("C 학생 수 : " + grade[2]);
    System.out.println("D 학생 수 : " + grade[3]);
    System.out.println("E 학생 수 : " + grade[4]);
}


public void printTotalInfo(int[] scores){
        // 얘만 실행시키면 합계 평균 인원수 다 나왔으면 좋겠다
    System.out.println("총합 : " + calcsum(scores));
    System.out.println("평균 : " + calcavg(scores));
    countGrade(scores);

}


    public static void main(String[] args) {
        //Array06 클래스의 메서드를 호출하기 위한 객체 생성
        Arrays06 arrays06 = new Arrays06();
        //점수 데이터를 사전에 마련
        int[] scores = {100,97,55,24,49,60,20,77,89};

//        System.out.println("총합 : " + arrays06.calcsum(scores));
//        System.out.println("평균 : " + arrays06.calcavg(scores));
//        arrays06.countGrade(scores);  // a인원수 ... f인원수

        arrays06.printTotalInfo(scores);

    }
}
