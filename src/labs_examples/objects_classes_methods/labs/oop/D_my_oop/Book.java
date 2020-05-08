package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Book {
    String title;
    String author;
    int yearPublished;
    String summary;
    int rating;
    String review;
    String location;

    //constructor
    public Book(String title, String author, int yearPublished, String summary, int rating, String review, String location) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.summary = summary;
        this.rating = rating;
        this.review = review;
        this.location = location;
    }

    //getter and setter
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

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //to string
    @Override
    public String toString() {
        return "Book{" +
                "title: " + title + '\n' +
                ", author: " + author + '\n' +
                ", published: " + yearPublished +
                ", summary: " + summary + '\n' +
                ", rating: " + rating +
                ", review: " + review + '\n' +
                ", location: " + location +
                '}';
    }
}
