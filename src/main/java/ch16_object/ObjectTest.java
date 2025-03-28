package ch16_object;

public class ObjectTest {
    //필드선언
    private String name;
    private String adress;

    public ObjectTest() {
    }

    public ObjectTest(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void displayInfo1(){
        System.out.println("이름 : " +  name);
        System.out.println("주소 : " +  adress);
    }

    public String displayInfo2(){
        return "이름 : " + name + "\n주소 : " + adress;
    }


    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + adress;
    }
}
