package models;

public class Note {
    private final int id;
    //generate id randomly
    private String title;
    private String content;
    private static int counter = 1;

    public Note(String title, String content) {

        this.title = title;
        this.content = content;
        id = counter;
        counter++;

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return " { id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
