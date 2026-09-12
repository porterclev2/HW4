package Aggregation;

public class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String t, String a, String p) {
        this.title = t;
        this.author = a;
        this.publisher = p;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public void setAuthor(String a) {
        this.author = a;
    }

    public void setPublisher(String p) {
        this.publisher = p;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPublisher() {
        return this.publisher;
    }
}
