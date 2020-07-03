package Exc3Books.books;

import Exc3Books.books.authors.BookCollection;

public class Books {
    /** Class variables */
    private String bookTitle;
    private String bookAuthor;
    private double bookPrice;
    private int quantity;

    private Books[] books;

    public Books(){
        books = new Books[0];
    }


    public Books(BookCollection[] bookCollections){}


    public Books[] getBooks() {
        return books;
    }

    public void setBooks(Books[] books) {
        this.books = books;
    }

    /** method to add books */
    public void addBooks(Books book){

        if (!(book instanceof Books)) {
            Books[] result = new Books[books.length + 1];
            for (int i = 0; i < books.length; i++) {
                result[i] = books[i];
            }
            result[result.length - 1] = (Books) book;
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
