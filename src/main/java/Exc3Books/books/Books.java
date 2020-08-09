package Exc3Books.books;

import Exc3Books.books.authors.BookCollection;

/**
 * Should be called Book singular! Use the refactor function in IntelliJ to change.
 */
public class Books {

    /** Class variables */

    /*
     * These variable names should just be title, author, price, like you named quantity.
     */
    private String bookTitle;
    /*
     * You created a class called author but you store the author of a book as a string?
     */
    private String bookAuthor;
    private double bookPrice;
    private int quantity;

    /*
     * This class models a single book. Putting a collection of books in the 'Book' class is not done.
     * This would be more suitable for the BookCollection class.
     * Otherwise every book object you create has a collection inside of it...
     */
    private Books[] books;

    public Books(){
        books = new Books[0];
    }

    public Books(BookCollection[] bookCollections){}

    /** get end set for books */
    public Books[] getBooks() {
        return books;
    }

    public void setBooks(Books[] books) {
        this.books = books;
    }

    /** method to add books */

    public void addBooks(Books book){

        /*
         * If the book you want to add is not an instance of this Books class then you add it...
         * Don't think that's what it's supposed to do?
         */
        if (!(book instanceof Books)) {
            Books[] result = new Books[books.length + 1];
            for (int i = 0; i < books.length; i++) {
                result[i] = books[i];
            }
            result[result.length - 1] = (Books) book; // your if statement is wrong, that's why intellij warns this will always be null.
            books = result;
        }
    }

    /** auto-gen get and set */

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /** to String method to print all the info inside this class */
    @Override
    public String toString() {
        return "Books{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                ", quantity=" + quantity +
                '}';
    }
}
