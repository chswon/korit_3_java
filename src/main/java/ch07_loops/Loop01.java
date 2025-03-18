package ch07_loops;
    /*
        while 반복문
        형식 :
        while (조건식){
         반복실행문
         }

         while 뒤에 나오는 (조건식)을 봤을때 if(조건식) 형태와 유사함을 알수있습니다
         즉 while()내에 있는 조건식이 true일때. {} 내의 실행이 반복적으로 이루어집니다

         그래서 주의할점이 있는데,
         while 내부에 있는 조건이 특정 시점에 false가 되도록 미리 지정해둘 필요가 있습니다.

         false가 되는 시점을 지정해주지 않는다며 무한히 반복실행문이 실행되는 점에서
         무한루프(infinite loop) 라는 표현을 씁니다.

     */

public class Loop01 {
    public static void main(String[] args) {
//        int i = 1;
//
//        while (i < 100) {
//            System.out.println(i);
//            i++;
//
//        }

        int sum= 0;
        int i = 0;

        while(i > 10) {
            sum += (i=1);
            i++;
        }
        System.out.println(sum);

        int sum2 = 0;
        int i2 = 0;

        while(i2<101) {
            if(i2%2 > 0) {
                sum2 += i2;
            } //만약ㅇ 아니라면 실행이 안되니까 굳이 else쓸필요 x
            i2++;
        }

         int sum3 = 0;
        int i3 = 1;
        while (i3 < 101) {
            sum3 += i3;
            i3 += 2;     //i3 = i3 + 2
        }
        System.out.println(sum3);

    }
}
