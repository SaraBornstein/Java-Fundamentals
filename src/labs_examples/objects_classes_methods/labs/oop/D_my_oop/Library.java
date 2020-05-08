package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public class Library {
    private ArrayList <Book> bookshelf = new ArrayList<>();

    //getters and setters
    public ArrayList<Book> getBookshelf() {
        return bookshelf;
    }

    public void setBookshelf(ArrayList<Book> bookshelf) {
        this.bookshelf = bookshelf;
    }

    public void printBookshelf(){
        for(Book b : bookshelf){
            System.out.println(b.toString());
        }
    }

}
