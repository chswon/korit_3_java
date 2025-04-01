package ch18_static.builders;

public class Person {
    // argument 대입이 아니라 builder 객체의 속성값을 그대로 Person 생성자에 대입하여
    // Person 객체를 생성하겠다는 의미. private이라서
    // builder를 통해서만 객체 생성이 가능

    private String name;
    private int age;
    private String address;

    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    //객체를 생성하는 main단계에서 일반 생성자가 아니라
    //Builder를 통해 Person 생성자
    // 그리고 public
    public static class Builder{
        private String name;
        private int age;
        private String address;
    }

    //이하의 코드는 일단 method에 해당
    // 대부분의 경우 동사는 행위를 나타내기 때문에 동사로 작성되지만
    //builder 패턴의 경우 대입될 필드의이름과 동일한
    // 메서드명을 짓습니다.
    // 즉 Builder.name("안근수"); 와 같은 식으로 코드 작성이 되며,
    // 이 Person 객체는 name에 "안근 수"라는 속성값을 갖게 됩니다.

    //
    }

