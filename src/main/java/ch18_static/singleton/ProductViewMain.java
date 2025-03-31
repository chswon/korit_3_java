package ch18_static.singleton;

public class ProductViewMain {
    public static void main(String[] args) {
        //객체생성
        //ProductView productView1 = new ProductView();
        // ProductView에 생성자를 프라이빗으로 선언해서 오류발생
        ProductView productView1 = ProductView.getInstance();
        ProductView productView2 = ProductView.getInstance();
        ProductView productView3 = ProductView.getInstance();
        ProductView productView4 = ProductView.getInstance();

        //이상의 코드에서 복수의 객체를 만든 것처럼 보이지만 실제로 ProductView.getInstance();
        //의 결과값은 동일한 instance이기 때문에 실제 생성된 객체의 개수는 한개밖에 없음.

        //콘솔창에 이상으 ㅣ코드를 실행시킨 결과로
        //1번째 객체가 생성되엇습니다. 가 한줄만 출력되었습니다.
        //생성자 내부의 int counter가 지역변수이기 때문에
        //1번째 객체가 생성되었습니다.
        //1번째 객체가 생성되었습니다.
        //1번째 객체가 생성되었습니다.
        //1번째 객체가 생성되었습니다.
        //로 네줄이 출력되어야 하는데.


        //생성자 호출 자체가 한번만 있었다는 의미

        productView1.showMainView();
        productView2.showMainView();
    }
}
