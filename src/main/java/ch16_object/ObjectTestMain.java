package ch16_object;

public class ObjectTestMain {
    public static void main(String[] args) {
        String strExample1 = "안근수";
        String strExample2 =new String( "안근수");

        boolean result1 = strExample1 == strExample2;
        System.out.println(result1);
        boolean result2 = strExample1.equals(strExample2);
        System.out.println(result2);

        ObjectTest objectTest1 = new ObjectTest("안근수","부산광역시 연제구");
        objectTest1.displayInfo1();

        ObjectTest objectTest2 = new ObjectTest();
        objectTest2.setName("채수원");
        objectTest2.setAdress("부산광역시 연제구");
        objectTest2.displayInfo2();
        System.out.println(objectTest2.displayInfo2());
        System.out.println(objectTest2);
        Teacher teacher = new Teacher("채수원","브니엘고등학교");
        System.out.println(teacher);
    }
}
