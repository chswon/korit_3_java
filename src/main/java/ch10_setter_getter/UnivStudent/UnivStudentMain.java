package ch10_setter_getter.UnivStudent;

public class UnivStudentMain {
    public static void main(String[] args) {
        UnivStudent univStudent1 = new UnivStudent("김일",1,3.3);
        UnivStudent univStudent2 = new UnivStudent("김이",3,-30);
        UnivStudent univStudent3 = new UnivStudent("김삼",5, 2.7);
        UnivStudent univStudent4 = new UnivStudent("김사",4,3.8);
        UnivStudent univStudent5 = new UnivStudent("김오",2,1.0);

        univStudent2.showInfo();
        univStudent3.showInfo();

        univStudent2.setScore(4.0);
        univStudent3.setGrade(2);


        univStudent1.showInfo();
        univStudent2.showInfo();
        univStudent3.showInfo();
        univStudent4.showInfo();
        univStudent5.showInfo();









    }
}
