package ch13_inheritance;

public class Tiger extends Animal {      //(자식 클래스명) extends (부모 클래스명)

    public Tiger() {
    }

    public Tiger(String animalName) {
        super(animalName);      //얘가 아까 필기한 super 키워드
    }

    public Tiger(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    public Tiger(int animalAge) {
        super(animalAge);
    }

    @Override           //얘가 붙어있다면 해당 메서드는 상속받은것
    public String getAnimalName() {
        return super.getAnimalName();       //키워드 super.메서드
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
        //super.move();
        System.out.println("네 발로 움직입니다."); //여기가 재정의 파트
    }

    // Tiger 객체를 생성
    public void hunt(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
