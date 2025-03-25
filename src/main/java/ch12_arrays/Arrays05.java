package ch12_arrays;
/*
    String[] scores = {"A","B","C","D","F"};
    를 선언하고 반복문을 잘성해서
    scores 배열의 결과가 {"A+","B+","C+","D+","F+"}; 이 되도록 한후

    실행 ㅖ
    점수 "A+","B+","C+","D+","F+"
    되도록 자성
  */
public class Arrays05 {







    public static void main(String[] args) {
//        String[] scores = {"A","B","C","D","F"};
//        System.out.print("점수 : ");
//        for (int i = 0 ; i < scores.length ; i++){
//            scores[i] += "+";
//            System.out.print(scores[i] + " ");
//        }

//        int[] scores2 = {100,90,80,70,60,20,88,52,25,1,0};
        int sum = 0;
        double avg = 0;
//        //총합과 평균 계산 및 출력
//        //총점 :
//        //평균 :

//        for (int i = 0 ; i < scores2.length ; i++){
//            sum += scores2[i];
//        }
//        System.out.println("총점 : " + sum);
//        for (int i = 0 ; i < scores2.length ; i++){
//            avg = sum/ scores2.length;
//        }
//        System.out.println("평균 : " + avg);

        int[] scores3 = {88,94,77,100,64,32,95,82,59};



        for (int i = 0 ; i < scores3.length ; i++){
            sum += scores3[i];
        }

        for (int i = 0 ; i < scores3.length ; i++){
            avg = sum/ scores3.length;
        }

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;


        for(int i = 0 ; i < scores3.length ; i++){
            if (scores3[i] > 89){
                A++;
            } else if (scores3[i] > 79) {
                B++;
            } else if (scores3[i] > 69) {
                C++;
            } else if (scores3[i] > 59) {
                D++;
            } else if (scores3[i] < 60) {
                F++;
            }
        }

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println("A 학생 수 : " + A );
        System.out.println("B 학생 수 : " + B );
        System.out.println("C 학생 수 : " + C );
        System.out.println("D 학생 수 : " + D );
        System.out.println("E 학생 수 : " + F );

        int[] grade = {0,0,0,0,0};
        for(int i = 0 ; i < scores3.length ; i++){
            if (scores3[i] > 89){
                grade[0]++;
            } else if (scores3[i] > 79) {
                grade[1]++;
            } else if (scores3[i] > 69) {
                grade[2]++;
            } else if (scores3[i] > 59) {
                grade[3]++;
            } else if (scores3[i] < 60) {
                grade[4]++;
            }
        }

        System.out.println("A 학생 수 : " + grade[0]);
        System.out.println("B 학생 수 : " + grade[1]);
        System.out.println("C 학생 수 : " + grade[2]);
        System.out.println("D 학생 수 : " + grade[3]);
        System.out.println("E 학생 수 : " + grade[4]);




    }
}
