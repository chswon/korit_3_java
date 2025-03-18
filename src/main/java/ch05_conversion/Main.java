package ch05_conversion;

public class Main {
    public static void main(String[] args) {

        /*
            Conversion 형변환 -> 용량 상의 문제로 일어나는 이슈를 해결하기 위해서 사용.

            1) upcasting(업캐스팅) : 더 큰 용량의 자료형으로 변환시키는것

         */
        char cast1 = 'A';
        System.out.println("원형 : " + cast1);  //65
        // 업캐스팅 방법 #1
        // 형변환을 하기 위해서는 '(바꿀 데이터타입)변수명' 으로 작성하시면 됩니다.
        System.out.println("변형 : " + (int)cast1); //65 -> 시험 자주나옴

        char cast2 = 'a';
        System.out.println("원형 : "+ cast2);
        System.out.println("원형 : "+ (int)cast2); //97 -> A만큼은 아니자만 나옴

        //업캐스팅 방법 2
        char  cast3 = 'b';
        //새로운 변수를 선언하여 집어넣는 방법
        int cast4 = cast3;

        // 2) downcasting 다운캐스팅 : 더 적은 용량의 자료형으로 변환시키는 것
        int cast5 = 99;
        int cast6 = 100;

        System.out.println("원형 : " + cast5);
        System.out.println("변형 : " + (char)cast5);

        char cast7 = (char)cast6;
//        char cast7 = cast6; 오류발생. 업캐스팅과 다운캐스팅의 성격차이
        System.out.println("원형 : " + cast6);
        System.out.println("변형 ; " + cast7);

        /*
            추후 수업 예정
            upcasting의 경우는 메모리 용량이 커지기만 하면 기존 데이터가 변형이 일어나지는 않기때문에
            임시적(implicit)으로 변형이 가능한 반면 downcasting 의 경우에는 데이터를 축소하는 과정에서 메모리 용량을 벗어나게 되는
            경우가 있음. 용량 오버에 해당하는 현상을 미리 점검하기 위해
            다운캐스팅 시에는 명시적(explicit)으로만 변형이 가능합니다.
         */



    }
}
