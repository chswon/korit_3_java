package ch18_static.singleton;

import lombok.Getter;

/*

 */
public class Samsung {
    // 정적 변수
    private static Samsung instance;
    //멤버 변수
    @Getter     // getCompany() 메서드만 만들겠다는 뜻
    private String company;
    private int serialNumber;



    private Samsung(){
        company = getClass().getSimpleName();
        serialNumber = 20250000;
    }

    public static Samsung getInstance(){
        if (instance == null){
            instance = new Samsung();
        }
        return instance;
    }

    public String createSeiralNumber(String model){
        return model + "_" + ++serialNumber;
    }


}
