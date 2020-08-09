package Exc3Books.StoreUtilities;

public class Stock {
    /** Class variable */
    /**
     * variable name very poorly chosen. Confusing to call a quantity the name of the entity book...
     * Shouldn't this contain a collection of all the books available instead of an arbitrary number?
     * 10 books in stock, which books?
     * This would work for a shop that sells exactly one uniform product.
     */
    private int book;

    /** Default constructor */
    public Stock(){}

    /** Constructor */
    public Stock (int book){
        this.book = book;
    }

    /** auto-gen get and set */
    public int getBook() {
        return book;
    }

    public int setBook(int book) {
        return book;
    }

}
