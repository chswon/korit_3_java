package ch17_bean.Person;

import ch10_setter_getter.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person(20, "김일");
        Person person2 = new Person("김이");

        person2.setAge(38);

        System.out.println(person1);
        System.out.println(person2);

        PersonLombok person3 = new PersonLombok("김삼");
        PersonLombok person4 = new PersonLombok("김사", 14);

        person3.setAge(17);

        System.out.println(person3);
        System.out.println(person4);

        //이상을 실행시켜 봤을때 person1,2를 불러냈을때 콘솔창에 찍히는 방식과
        //3,4  를 불러냈을때 콘솔차엥 찍힌느 방식이 다르다는 것을 알 수 있습니다,
        // 이는 인텔리제이 자체에서의 toString()의 재정의한 default 방식과
        // project Lombok 상에서의 toString() 메서드의 재정의 방식이 차이가 납니다.


        System.out.println(person3.toString());

    }
}
