package ch07_loops;
/*
    while을 써서

 */
public class Loop03 {
    public static void main(String[] args) {

        int num = 1;

//        while (num < 101) {
//            System.out.print(num + " ");
//            if (num%10 == 0) {
//                System.out.println();
//            }
//            num++;



        while (num < 101) {
            System.out.println(num + " " + (num+1) + " " + (num+2) + " " + (num+3) + " " + (num+4) + " " + (num+5) + " " + (num+6) + " " + (num+7) + " " + (num+8) + " " + (num+9));
            num += 10;
        }
    }
}
