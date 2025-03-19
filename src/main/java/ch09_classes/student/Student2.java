package ch09_classes.student;

public class Student2 {
    int studentcode;
    String name;
    double score;

    Student2() {
    }

    Student2(int studentcode) {
        this.studentcode = studentcode;
    }

    Student2(String name) {
        this.name = name;
    }

    Student2(int studentcode, double score) {
        this.studentcode = studentcode;
        this.score = score;
    }

    Student2(int studentcode, String name, double score) {
        this.studentcode = studentcode;
        this.name = name;
        this.score = score;
    }

    void showInfo() {
        System.out.println();
        System.out.println(name + " 학생의 정보입니다.");
        System.out.println("학번 : " + studentcode);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);
}
}
