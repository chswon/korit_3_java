package ch08_mechods;

import java.util.Scanner;

public class Scorecalo2 {

//    public static double addscore(double score1, double score2) {
//        return score1 + score2;
//    }
//
//    public static double addscore(double score1, double score2, double score3) {
//        return score1 + score2 + score3;
//    }
//
//    public static double addscore(double score1, double score2, double score3, double score4) {
//        return score1 + score2 + score3 + score4;
//    }
//
//    public static double addscore(double score1, double score2, double score3, double score4,  double score5) {
//        return score1 + score2 + score3 + score4 + score5;
//    }
//
//    public static double addscore(double score1, double score2, double score3, double score4, double score5, double score6) {
//        return score1 + score2 + score3 + score4 + score5 + score6;
//    }

    //이상까지의 결론 : 오버로딩이라는 개념 자체는 편하지면 (메서드명이 중복되어도 된다는 점에서)
    // 항상 만능은 아니다

    // 1. 그래서 일단 합계를 낼때 두개짜리만 생성할 예정
    public static double addSubject(double totalscore, double addedScore) {
        return totalscore + addedScore;
    }

    // 2. 평균을 내는 메서드
    public static double calculateAvg(double totalScore, int numberOfSubs) {
        return totalScore / numberOfSubs;
    }


    public static void main(String[] args) {
//        double sum = addscore(100,95);
//        System.out.println(sum);
//        System.out.println(addSubject(4.5, 3.5));
//        System.out.println(addSubject(4.5, 3.5) / 2);
//
//        System.out.println(calculateAvg(addSubject(4.5, 3.5),2));

        // 이상의 코드를 확인하게 됐을 때 알수있는 점은 addSubject method의 결과갑이 calculateAvg method의
        // 첫번째 argument가 됐다는 접입니다. -> 프로그래머스나 백준에서 코테 연습하는 문제 풀이에서
        // 이렇게 징그럽게 하는 사람이 있습니다.

//        double sumOfScore = addSubject(4.5, 3.5);
//        int subjects = 2;
//        double avgScore = calculateAvg(sumOfScore, subjects);

        // 이상의 코드는 일단 두 과목을 기준으로 합과 평균을 낸다는 점을 확인할 수 있습니다.
        // method로 두 과목부터 100과목 까지의 overloading을 통한 매개변수 늘리기 보다는
        // main 단꼐에서 addSubject를 반복해버리면 굳이 몇 과목일지도 모르는 overloading을 할 필요가 없습니다.

        Scanner scanner = new Scanner(System.in);

        //사용할 변수 목록
        boolean endOfCalc = false;
        double score1 = 0;
        double totalscore = 0;
        int totalSubjects = 1; // 과목수가 될텐데 반복횟수마다 ++시켜줄 예정
        double avgScore = 0;    //totalscore, totalSubject의 결과값이 대입될거니까 미리 double로  선언함

        //점수 입력을 횟수와 상관없이 받기 위한 반복문 작성
        while (!endOfCalc){
            System.out.println("점수를 입력하세요(종료하려면 -1을 입력하세요) >>> ");
            score1 = scanner.nextDouble();
            // socre1 = -1이 대입되었다면 반복문이 종료될수 있도록 하는 조건문 작성
        if(score1 == -1){       //왜 종료라든지 x가 아니라 -1을 입력했을 때 종료되도록 작성해야할까?
            break;
            //endOfCalc = true; //현재 반복은 이루어지고 다음 반복시에 종료가 되기 때문
            // 이코드 밑에 있는 모든 연산이 이루어진다는 점에서
        }
        // 합을 계산하는 코드
            totalscore = addSubject(totalscore,score1); //얘의 의미는 첫 반복문일때는 addSubject(0, score1)임

        // 평균을 계산하는 코드
            avgScore = calculateAvg(totalscore, totalSubjects);
            System.out.println("------ 점수 입력시마다 나오는 합계와 평균입니다. ------");
            System.out.println("입력한 점수의 합계 : " + totalscore);
            System.out.println("입력한 점수의 평균 : " + avgScore);

            totalSubjects++; //다음 반복시에는 한과목 더 늘어난 상태로 평균 계산의 분모가 되어야 하기때문


        }
        System.out.println("------ 점수 입력시마다 나오는 합계와 평균입니다. ------");
        System.out.println("입력한 점수의 합계 : " + totalscore);
        System.out.println("입력한 점수의 평균 : " + avgScore);


    }
}
