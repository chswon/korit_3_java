package ch09_classes;
    /*
        생성자(Constructor)
            생성자는 객체가 생성될 때 호출되는 '특별한' 메서드
        클래스명      객체명       뉴 클래스명
        ClassExample example = new ClassExample();
        : 사실 ClassExample()가 생성자였습니다.

        특징 :
            1. 클래스의 이름과 생성자 이름은 동일하다.
                (다른 메서드들과 달리 대문자로 시작한다.)
            2. return 값이 없다 -> call1() call2() 유형으로 볼수있다
            3. 객체 초기화 : 생성자느 객체의 필드(속성) 초기화를 담당한다.

        생성자의 정의 방식
            1. 기본생성자 : 매개 변수가 없는 생성자
                (사실 클래스를 만들때 default로 생성되어 정의하지 않을 때도 있음)
                ClassA, Car 에서 기본 생성자를 정의하지 않고
                ClassMain, CarMain에서 객체를 생성해봤습니다.
            2. 매개변수 생성자 : 하나 이상의 매개변수를  가지는 생성자

     */

public class Constructor {
    //필드선언
    int num;
    String name;

    //기본 생성자 정의 -> 직접하면 call1()유형과 같은 형태 [ x | x ]
    Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }
    //매개변수 생성자 -> 기본적으로 만들어지지 않습니다. 개발자가 정의해야함.
    // 근데 그 경우에 기본 생성자와 매개변수 생성자 둘다 쓰고싶다면
    // 기본 생성자도 정의해야함.

    Constructor(int number) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = number;  // this : 해당 클래스에서 객체를 만들게 되면 객체 이름으로 대체됨.
    }

    // String title 을 매개변수로 하는 생성자를 정의하고,
    // RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)라는 안내문을 출력할수 있도록 작성한 뒤
    // constructorMain으로 가셔서 constroctor4 라는 객체명을 지니고. title에 이름으로 지어 객체를 생성한 뒤
    // sout constrortor.name을 입력

    Constructor(String title) {
        this.name = title;
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)");
    }


    //두개 이상의 매개변수를 지니는 생성자
    Constructor(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("AllArgsConstructor(int, String)");

    }

        // method를 정의
        void showInfo () {
            System.out.println("이 객체의 num값 ; " + num);
            System.out.println("이 객체의 name값 ; " + name);
        }



}
