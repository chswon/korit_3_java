package ch18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        // Person 객체인 person1 생성
       // Person person1 = new Person("안근수", 38,"부산광역시 연제구");
        //이상이 여태까지의 방식
        // 빌더 적용시에는
        //Person person1 = new Person.Builder()
                //.name("안근수")
                //.age(38)
                //.address("부산광역시 연제구")
                //.build();

        //System.out.println(person1);
    }
}
