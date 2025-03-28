package ch14_abstraction.Interface;

public class TempUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("온도를 한칸 올립니다.");
    }

    @Override
    public String onUp() {
        return "온도를 계속 " + super.onUp();
    }
}
