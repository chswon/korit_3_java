package ch13_inheritance.Book;

public class Book {
    private String title;
    private String auther;

    public Book(String title, String auther) {
        this.title = title;
        this.auther = auther;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }
}
