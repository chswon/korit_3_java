package ch09_classes.product;
/*
    product.java에 여러가지 생성자를 정의하세요
    필드는

    int productNum;
    String productName;

    메서드

    showInfo() -> productNum과 productName정보가 콘솔에 출력

    필드가 두개이기때문에 생성자가 만들어질 경우의수는 4가지


    1 기본 생성자를 사용하여 객체를 생성하시오

                    productNum 123456
                    productName LG엘패드
    2 시리얼 넘저를 기본으로 입력하는 매개변수 생성자를 통해 객체를 생성하시오. product2
            productNum 987654
            productName 다이소 충전기
    3 제품명을 기본으로 입력하는 매개변수 생성자를 통해 객체를 생성하시오 prduct3
        productNum 159357
        productName USB-C 케이블
    4 AllArgsConstructor를 이용하여 객체 생성하시오 product4
    productNum 951753
    productName GFlip3



 */
public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();

        product1.productNum = 123456;
        product1.productName = "LG엘패드";
        product2.productNum = 987654;
        product2.productName = "다이소 충전기";
        product3.productNum = 159357;
        product3.productName = "USB-C 케이블";
        product4.productNum = 951753;
        product4.productName = "GFlip3";


        product1.showInfo();
        System.out.println();
        product2.showInfo();
        System.out.println();
        product3.showInfo();
        System.out.println();
        product4.showInfo();


    }
}
