package ch15_casting.centralcontrol;

public class Main {
    public static void main(String[] args) {
        //각 클래스의 객체 생성
        Computer computer1 = new Computer();
        LED led1 = new LED();
        Mouse mouse1 = new Mouse();
        Speaker speaker1 = new Speaker();
        Tv tv1 = new Tv();
        SmartPhone smartPhone1 = new SmartPhone();
        Centralcntrol centralcntrol = new Centralcntrol(new Power[8]);

        centralcntrol.addDevice(computer1);     //업캐스팅이 암시적으로 일어남
        centralcntrol.addDevice(led1);
        centralcntrol.addDevice(mouse1);
        centralcntrol.addDevice(speaker1);
        centralcntrol.addDevice(tv1);
        centralcntrol.addDevice(smartPhone1);

        centralcntrol.powerOn();
        centralcntrol.powerOff();
        System.out.println();


        centralcntrol.displayInfo();
        System.out.println();

        centralcntrol.performSpecofocMethod();

    }
}
