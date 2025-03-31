package ch18_static;

public class ProductMain {
    public static void main(String[] args) {
        //정적 메서드의 호출
        System.out.println(Product.getCount());

        //객체 생성
        Product product1 = new Product();

        // count / instanceCount 값 확인
        System.out.println(Product.getCount());                 // 정적 메서드 호출
        System.out.println(product1.getInstanceCount());        // 일반 메서드 호출

        // 객체 생성
        Product product2 = new Product();
        System.out.println(Product.getCount());
        System.out.println(product2.getInstanceCount());
        System.out.println();
        System.out.println(product1.getInstanceCount());

        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();
        Product product6 = new Product();

        System.out.println(Product.getCount());
        System.out.println(product3.getInstanceCount());
        System.out.println(Product.getCount());
        System.out.println(product4.getInstanceCount());
        System.out.println(Product.getCount());
        System.out.println(product5.getInstanceCount());
        System.out.println(Product.getCount());
        System.out.println(product6.getInstanceCount());

        //롬복을 사용하지 않은 gettitle()
        System.out.println(Product.getTitle());     //클래스명.메서드명()으로 static 메서드 호출

    }
}
