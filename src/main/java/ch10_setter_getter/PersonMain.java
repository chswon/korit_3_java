package ch10_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("안근수");
//        person1.name = "채수원";
////        System.out.println(person1.age);
//        person1.age = 27;     //private 적용후에 오류 발생해서 주석처리

        //메서드 호출 방식  : 객체명.메서드명();

        person1.setName("레오나르도 디카프리오");

        person1.setName("채수원");


//        person1.setAge(38);
//        person1.setAge(300);




    }


}
