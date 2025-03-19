package ch10_setter_getter.UnivStudent;
    /*
     name grade(1 2 3) / score(double) - > 전부 private

     1) 기본
     2) 이름만
     2) 학년만
     2) 이름과 학년만
     2) 이름과 학년 점수

     3. Setter / Getter 메서드 정의
        setGrade의 범위 1~4
        setScore의 범위 0.0~4.5
        범위를 벗어나면 불가능한 입력
     4. 메인 생성후
        student1 -> 기본 생성자 김일 / 1 / 3.3
        student2 -> 기본 생성자 김이 / 3 / -30 -> 실패하고 4.0
        student3 -> 기본 생성자 김삼 / 5 -> 실패하고 2/ 2.7
        student4 -> 기본 생성자 김사 / 4 / 3.8
        student5 -> 기본 생성자 김오 / 2 / 1.0

     콘솔창에
     이름 :
     학년 :
     점수 :
     으로 출력할
     student1.showInfo()
     student2.showInfo()
     student3.showInfo()
     student4.showInfo()
     student5.showInfo()
     */
public class UnivStudent {
    private String name;
    private int grade;
    private double score;

    public UnivStudent() {
    }

    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade) {
        this.grade = grade;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGrade() {
            return grade;
        }
        public void setGrade(int grade) {
            if (grade > 4 || grade < 0) {
                System.out.println("불가능한 입력입니다.");
                return;
            }
            this.grade = grade;
        }

        public double getScore() {
            return score;
        }
        public void setScore(double score) {
            if (score > 4.5 || score < 0.0) {
                System.out.println("불가능한 입력입니다.");
                return;
            }
             this.score = score;
        }

        public void showInfo() {
        System.out.println();
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
        System.out.println("점수 : " + score);
    }
}
