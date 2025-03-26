package ch13_inheritance;
/*
    Tiger.java처럼 Animal 클래스를 상속받고
    생성자 및 getter/setter 다 정의하시고
    Animal 클래스의 move 메서드를 오버라이디이 하여
    :사람이 두 발로 걷습니다 : 만 출력하도록 재정의하고

    main.java 에서
    human1 객체를 생ㅅ어하여 setter를 활용,
    여러분이름과 여러분 나이를 입력, gette를 활용하여
    "안녕하세요, 제 이름은 여러분 이름이고 나이는 몇살입니다."
    내년에는 몇+1살이 됩니다 출력

    또한
 */
public class Human extends Animal {
    //상속 받게 되면 Animal 클래스의 필드를 그대로 사용 가능합니다.
    //고유 메서드처럼 고유 속성도 가질 수 있습니다.
    String smartPhone;





    public Human() {
        System.out.println("사람 객체가 생성되었습니다.");
    }

    public Human(String animalName) {
        super(animalName);
    }

    public Human(int animalAge) {
        super(animalAge);
    }

    public Human(String animalName, int animalAge, String smartPhone) {
        super(animalName, animalAge); //  부모 필드를 그대로 대입하는 것.
        this.smartPhone = smartPhone;
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override
    public void move() {
        System.out.println(getAnimalName() + "이 두 발로 걷습니다.");
    }

    void read(String read1) {
        System.out.println(getAnimalName() + "은 " + read1 + "를 읽는 중입니다.");
    }

    //새로 만든 필드인 스마트폰에 관한 게터세터는 추가작성

    public String getSmartPhone() {
        return smartPhone;
    }

    public void setSmartPhone(String smartPhone) {
        this.smartPhone = smartPhone;
    }
}
