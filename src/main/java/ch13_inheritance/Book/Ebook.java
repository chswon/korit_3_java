package ch13_inheritance.Book;

public class Ebook extends Book{

    private double fileSize;
    private String format;


    public Ebook(String title, String auther, double fileSize, String format) {
        super(title, auther);
        this.fileSize = fileSize;
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Ebook(String title, String auther) {
        super(title, auther);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getAuther() {
        return super.getAuther();
    }

    @Override
    public void setAuther(String auther) {
        super.setAuther(auther);
    }

    public void displayInfo(){
        System.out.println("제목 : "  + this.getTitle());
        System.out.println("저자 : "  + this.getAuther());
        System.out.println("파일 크기 : "  + fileSize + "MB");
        System.out.println("파일 형식 : "  + format);
    }
}
