package ch00_Review;
/*
    학생정보를 저장하는 클래스 구현
    다양한 접근 지정자를 조합하여 정보 은닉 및 제한된 접근을 적용

    학생클래스의 필드는 이름 나이 아이디 비밀번호
 */
class Student {
    public String name;
    public int age;
    int studentId;
    private String password;



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void showInfo() {
        System.out.println("학번 : " + studentId);
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}

public class Review12 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "김일";
        student1.age = 17;
        student1.studentId = 20250001;

        student1.setPassword("qwer1234");

        student1.showInfo();

    }
}
