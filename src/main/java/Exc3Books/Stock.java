package Exc3Books;

public class Stock {
    /** Class variable */
    private int book;

    /** Default constructor */
    public Stock(){}

    public Stock (int book){
        this.book = book;

    }

    /** auto-gen get and set */
    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }
}
