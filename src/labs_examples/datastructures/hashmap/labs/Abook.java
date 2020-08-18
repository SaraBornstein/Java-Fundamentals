package labs_examples.datastructures.hashmap.labs;

class Abook {
    private String title;
    private String author;

    //constructor
    public Abook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //to string

    @Override
    public String toString() {
        return "Abook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
