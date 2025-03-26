package ch13_inheritance.Book;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성");
        System.out.println("이 책의 제목은 " + book1.getTitle() + "입니다.");
        System.out.println("이 책의 저자는 " + book1.getAuther() + "입니다.");
        System.out.println();


        Ebook ebook1 = new Ebook("스프링 입문", "이강준", 5.2,"EPUB");
        ebook1.setFormat("PDF");
        System.out.println("이 전자책의 포맷은 " + ebook1.getFormat() + "입니다.");
        ebook1.displayInfo();







    }
}
