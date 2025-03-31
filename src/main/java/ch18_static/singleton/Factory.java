package ch18_static.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    private String factoryName;

    public SmartPhone produceSmartPhone(){
        System.out.println(factoryName + "에서 스마트폰을 생산합니다.");
        String model = "갤력시S26";    // SmartPhone의 필드에 대입되겠죠
        String serial = null;

        Samsung samsung = Samsung.getInstance();
        //Samsung 객체 생성 -> 싱글톤 적용했으니까 매번 동일한 객체가 대입됨.
        serial = samsung.createSeiralNumber(model);
        //여기서 SmartPhone 객체 생성 -> AllArgsConstructor
        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(),model,serial);
        return smartPhone;
    }
}
