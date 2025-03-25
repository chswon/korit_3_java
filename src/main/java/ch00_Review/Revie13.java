package ch00_Review;
/*
    목표 : 객체지향 설계 및 접근 지정자 이해를 바탕ㅇ로
    다양한 덥근 수준의 필드와 메서드를 갖는 캐릭터를 클래스를 저으이하고,
    이를 Review13Summary 클래스에서 테스트 합니다.
 */
class Character{
    //필드
    public String name;
    int health;
    int power;
    protected String skill;
    private int exp;
    int amount = 0;


    //생성자
    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;
        this.health = 100;
        this.exp = 0;
    }

    public int getHealth() {
        return health;
    }

    public void attack(){
        System.out.println(name + "이(가) " + power + "의 힘으로 공격!");
        this.gainExp(10); //메서드 내부에서 메서드를 호출한 사례

    }

    void heal(){
        health += 10;
        System.out.println("체력이 10 회복되었습니다. 현재 체력 : " + health);
    }

    private void gainExp(int amount){
        exp += amount;
        System.out.println(name +"이(가) 경험치 " + amount + "을(를) 얻었습니다.");
    }
}
public class Revie13 {
    public static void main(String[] args) {
        Character character1 = new Character("전사", 25,"난무");

        System.out.println("캐릭터 이름 : " + character1.name);
        System.out.println("체력 : " + character1.getHealth());
        character1.attack();
        character1.getHealth();
        character1.heal();

    }
}
