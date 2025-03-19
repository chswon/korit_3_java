package ch09_classes.student;
/*
    1. Student 클래스 필드 정의
    int studentCode
    String name
    double score

    2. 기본 생성자를 정의하고 객체를 생성했을 떄
     "기본 생성자로 객체가 생성되었습니다" 라고 출력

     3. int studentcode를 매개변수로 하는 매개변수 생성자를 정의하고
        "int  매개변수 생성자로 객체가 생성되었습니다" 라고 출력

    4. String anme를 매개변수로 하는 매개변수 생성자를 정의하고
        "String  매개변수 생성자로 객체가 생성되었습니다" 라고 출력

    5. studentCode, name를 매개변수로 하는 매개변수 생성자를 정의하고
        "int, String 매개변수 생성자로 객체가 생성되었습니다" 라고 출력

    6. studentCode, name, score를 매개변수로 하는 매개변수 생성자를 정의하고
        "int, String, double 매개변수 생성자로 객체가 생성되었습니다" 라고 출력

    7. student1 2025001 / 김일 / 4.5
    7. student2 2025002 / 김이 / 100
    7. student3 2025003 / 김삼 / 95.8
    7. student4 2025004 / 김사 / 4.0
    7. student5 2025005 / 김오ㅓ / 80.7

    학생의 정보가 출력될수 있도록 하는 showInfo() 메서드를 call1()타입





 */
public class Student {
    int studentcode;
    String name;
    double score;

    Student(){
        System.out.println("기본 생성자로 객체가 생성되었습니다");
    };

    Student(int studentcode){
        this.studentcode = studentcode;
        System.out.println("int  매개변수 생성자로 객체가 생성되었습니다");
    }

    Student(String name){
        this.name = name;
        System.out.println("String  매개변수 생성자로 객체가 생성되었습니다");
    }

    Student(int studentcode, String name){
        this.studentcode = studentcode;
        this.name = name;
        System.out.println("int, String 매개변수 생성자로 객체가 생성되었습니다");
    }

    Student(int studentcode, String name, double score){
        this.studentcode = studentcode;
        this.name = name;
        this.score = score;
        System.out.println("int, String, double 매개변수 생성자로 객체가 생성되었습니다");
    }




    void showInfo() {
        System.out.println();
        System.out.println(name + " 학생의 정보입니다.");
        System.out.println("학번 : " + studentcode);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);



    }

}
