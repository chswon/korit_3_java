package ch00_review;
/*
    Getter / Setter

    객체명.속성명 = 속성값; 의 형태로 여태까지 속성값을 대입하하거나 바꾸는게 가능했습니다.
    그래서 예를 들어 batteryTime에 음수를 집어넣더라도, 자료형이 int이기 때문에
    속성값을 대입하는 것이 가능합니다. 그것이 논리적으로는 불가능할지라도
    컴퓨터는 멍청하기 때문에 자료형만 맞아 떨어지면 그대로 받아들인다고 볼 수 있습니다.

    그러면 악의적으로 클래스 외부에서 데이터를 조작하는 것도 가능하다는 의미가 됩니다.
    이와 같은 잠재적 문제를 막기 위해서 다른 클래스에서 직접적으로 속성값을
    바꾸는 것을 막고, 특정 method를 경유해야지만 속성값을 대입할 수 있도록 처리하는 것이
    Getter / Setter 및 접근 지정자으 개념입니다.

    1. Setter : 속성값을 대입(변경)하기 위한 method를 통칭합니다.
     set+속성명으로 이루어져 있습니다
     ex) setBatteryTime()
     a. call2 유형입니다.
     b. 내부에 로직을 장성하여 필드의 논리적인 개념에 맞지 않는 데이터를 걸러낼 수 있습니다.
         (배터리 타임이 음수면 아예 메서드를 정지시킬수 있음.)

    2. Getter : 속성값을 조회하기 위한 method를 통칭
        get+속성명으로 이루어져 있습니다.
        ex) getBatteryTime()
        a. call3() 유형
        b. main 단계에서 데이터 조회시의 조작이 가능합니다.

        ex) System.out.println(watch1.getButton() + "!"); // true!

    지시사항
    1. 기본생성자 / 이름을 필수로 갖는 매개 변수 생성자 정의
    2. 모든 필드에 대해 Setter를 정의할 것
    3. setBatteryTime() 의 구현부에 BatteryTime이 10 미만이라면 method 정지시킬것
    4. watch1에 setter를 활용하여.
       버튼 트루
       셀룰러 트루
       배터리 -10 실패하고 18
       이름 애플워치
       로 객체 생성
   5. 쇼인포 정의
    이 시계는 `입니다. 배터리 타임이 `이지요
    감사합니다
 */
class Smartwatch {
    private boolean button;
    private boolean celular;
    int batteryTime;
    private String title;


    public Smartwatch() {}

    public Smartwatch(String title) {
        this.title = title;
    }

    public void setButton(boolean button) {
        this.button = button;
    }

    public void setCelular(boolean celular) {
        this.celular = celular;
    }

    public void setBatteryTime(int batteryTime) {
        if (batteryTime < 10) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        this.batteryTime = batteryTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    void showInfo() {
            System.out.println("이 시계는 " + title + "입니다. 배터리타임이 " + batteryTime + "이지요.");
            System.out.println("감사합니다.");

    }

}

public class Review09 {
    public static void main(String[] args) {
        Smartwatch watch1 = new Smartwatch();
        watch1.setTitle("애플워치");
        watch1.setCelular(true);
        watch1.setButton(true);

        watch1.setBatteryTime(-10);
        watch1.showInfo();

        System.out.println();

        watch1.setBatteryTime(18);
        watch1.showInfo();



    }


}
