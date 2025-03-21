package ch00_review;
    /*
        클래스 - 설계도 /틀 / 청사진
        클래스 내부에는 속성(필드, 멤버변수, 인스턴스변수) / 행위 (메서드)

     */
class Developer {
        //필드 선언
        String name;
        boolean window;
        boolean java;
        boolean python;
        int career;
        String campany;

        //생성자 정의 -> 원래 기본생성자는 default로 있습니다.

        void introduce() {
            System.out.println("안녕하세요 제 이름은 " + name + "입니다.");
            System.out.println("현재 저는 " + campany + "에서 일하고 있으며, " + career + "년 경력자입니다.");
            System.out.println("window PC 소유 : " + window);
            System.out.println("Java 역량 : " + java);
            System.out.println("Python 역량 : " + python);
            System.out.println("인 상황입니다. 열심히 하겠습니다.");
        }


    }


    public class Review07 {
        public static void main(String[] args) {
            //기본 생성자로 객체 생성 하고싶다면 바로가능
            Developer developer1 = new Developer();
        /*
            이름 여러분이름
            window 컴 소유여부
            company 코리아 아이티아카데미
            java 능력 소유여부
            파이썬 능력 소유 여부
            career에 3


            안녕하세요 제 이름은 입니다
            현재 저는 ~에서 일하고 있으며,
            윈도우 피씨 소유:
            자바 역량
            파이썬 역량
            인 상황입니다. 잘부탁드립니다.
         */

           developer1.name = "채수원";
           developer1.campany = "코리아 아이티 아카데미";
           developer1.career = 3;
           developer1.window = true;
           developer1.java = true;
           developer1.python = false;
           developer1.introduce();

        }
    }