package ch09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        //기본 생성자를 통한 객체 생성
        Constructor constructor1 = new Constructor();

        // 매개변수 생성자를 통한 객체 생성
        Constructor constructor2 = new Constructor(20);
        System.out.println(constructor2.num);

        // AllArgsConstructo를 이용해서 객체 생성
        Constructor constructor3 = new Constructor(21,"김삼");



        Constructor constructor4 = new Constructor("채수원");
        System.out.println(constructor4.name);

        constructor1.num = 1;
        constructor1.name = "김삼";

        constructor2.name = "김사";

    }
}
