package ch14_abstraction.abstract_class;
/*
    지시사항
    1.
 */
public class TablitFactory extends Factory {
    public TablitFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 태블릿을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("태블릿 공장을 관리합니다.");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    public void upgrade(String model){
        System.out.println(model + "로 업그레이드 합니다.");
    }
}
