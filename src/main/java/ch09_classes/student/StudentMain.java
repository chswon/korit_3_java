package ch09_classes.student;

public class StudentMain {
    public static void main(String[] args) {
        Student2 student6 = new Student2();
        Student2 student7 = new Student2(2025002);
        Student2 student8 = new Student2("김삼");
        Student2 student9 = new Student2(2025004,4.0);
        Student2 student10 = new Student2(2025005,"김오",80.7);

        student6.studentcode = 2025001;
        student6.name = "김일";
        student6.score = 4.5;

        student7.name = "김이";
        student7.score = 100;

        student8.studentcode = 2025003;
        student8.score = 95.8;

        student9.name = "김사";



        student6.showInfo();
        student7.showInfo();
        student8.showInfo();
        student9.showInfo();
        student10.showInfo();

    }
}
