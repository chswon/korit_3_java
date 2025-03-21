package ch00_review;
    /*
        Constroctor(생성자) : 객체가 생성될 때 호출되는 특별한 메서드
        특징 :
            1) 클래스명과 생성자명은 동일
            2) 기본생성자 / 매개변수 생성자
                a. 기본생성자 : 정의하지 않아도 default로 있지만, 생성자를 하나라도 정의하는 순간 기본 생성자도 적어야함.
                b. 매개변수 생성자 : 객체를 생성할 때 필수적으로 요구되어야 하는 속성을 명시한 생성자
            3) return이 없다. call1()이거나(기본 생성자) / call2()거나(매개변수 생성자)
            4) 형식:
                a. 기본생성자
                 클래스명() {}
                b. 매개변수 생성자
                클래스명(매개변수1, 매개변수2) {
                 this 매개변수1 = 매개변수1;
                 this 매개변수2 = 매개변수2;
                 }

          생성 방법 :
            1) 일일이 타이핑.
            2) 햄버거 -> code -> generate
            3) alt -> inselt

     */
class Building{
    //필드 선언
        String title;
        int wall;
        int door;
        int window;
        boolean elevator;
        boolean stair;

        // 기본 생성자 정의
        // 이름만 있는 매개변수 생성자 정의
        // 다있는 매개변수 생성자 정의
            /*
            1. 빌딩1 - 기본생성자
            엘베 없음
            계단 없음
            벽 5
            창문 6
            문 2
            이름 코리아아이티타운

            2 빌딩2 이름만 잇는
            엘베 잇음
            계단 있음
            벽 8
            문4
            창문 230
            이름 코리아아이티타운

            빌딩3 - 전부다
            엘베 없음
            계단 잇음
            벽 3
            문1
            창문 0
            이름 컴퓨터 타운

            showInfo() 메서드 정의   call1()
            building.showInfo();
            실행예
            이 건물은 - 이고, 벽이 -개, 문이 -개, 창문이 -개 있습니다.
            엘리베이터 유무 :
            계단 유무 :



             */

        public Building() {
        }

        public Building(String title) {
            this.title = title;
        }

        public Building(String title, int wall, int door, int window, boolean elevator, boolean stair) {
            this.title = title;
            this.wall = wall;
            this.door = door;
            this.window = window;
            this.elevator = elevator;
            this.stair = stair;
        }

        void showInfo(){
            System.out.println("이 건물의 이름은 " + title + "이고, 벽이 " + wall + "개, 문이 " + door + "개, 창문이 " + window + "개 있습니다.");
            System.out.println("엘리베이터 유무 : " + elevator);
            System.out.println("계단 유무 : " + stair);
        }




    }




public class Review08 {
    public static void main(String[] args) {
    Building building1 = new Building();
    Building building2 = new Building("코리아 아이티 타운");
    Building building3 = new Building("컴퓨터 타운",3,1,0,false,true);

    building1.title = "코리아 아이티 타운";
    building1.elevator = false;
    building1.stair = false;
    building1.door = 2;
    building1.window = 6;
    building1.wall = 5;

    building2.elevator = true;
    building2.stair = true;
    building2.door = 4;
    building2.window = 230;
    building2.wall = 8;


    building1.showInfo();
        System.out.println();
    building2.showInfo();
        System.out.println();
    building3.showInfo();


    }

}
