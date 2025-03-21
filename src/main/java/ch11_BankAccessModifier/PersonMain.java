package ch11_BankAccessModifier;

class Person {
    private String name;

    //private 이기 때문에 이 person 클래스 외부에서는 name을 참조할수 없다. -우회방법은 게터 세터

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter / setter 보니까 access modifier가  public이니까 클래스 외부에서 사용할수 있겠다
    // 그러니까 우회를 통해서 person  클래스의 객체의 속성값을 바꿀수 있다.
    // 어제 했던것처럼 말도 안되는 데이터값을 걸러내는 로직을 쓸수 있다.
}


public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("김일");
        System.out.println(person1.getName());
        person1.setName("김이");
        System.out.println(person1.getName());



    }
}
