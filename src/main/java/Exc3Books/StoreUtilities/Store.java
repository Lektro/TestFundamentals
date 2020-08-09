package Exc3Books.StoreUtilities;

import Exc3Books.books.authors.BookCollection;
import Exc3Books.books.Books;
import Exc3Books.main.NoMoreBooksException;

public class Store implements Seller {

    /** Class variables */
    private PriceList pricelist;
    private Stock stock;
    private double revenue;

    /** default constructor */
    public Store() {}

    public Store(PriceList pricelist, Stock stock) {
        this.pricelist = pricelist;
        this.stock = stock;
    }

    /*
     * One would never want to create a store with its revenues already known. Impossible: redundant constructor.
     */
    public Store(double revenue){
        this.revenue = revenue;
    }

    /** Method to order Book */
    public Books orderBook(BookCollection[] bookCollections) throws NoMoreBooksException {
        if (stock.getBook() > 0) {
            Books book = new Books();
            revenue += pricelist.getBookPrice();
            /*
             * 'stock - 1;' will do.
             * Getters and setters are mostly for variable hiding towards other classes.
             */
            stock.setBook(stock.getBook() - 1);
            return book;
        }
        return null;
        /* throw NoMoreBooksException; instead of return null;
         * This is what the no more books exception is for.
         * You should move the exception file up a package to make it available to all packages.
         */
    }

    @Override
    public String toString() {
        return "Store{" +
                "pricelist=" + pricelist +
                ", stock=" + stock +
                ", revenue=" + revenue +
                '}';
    }

    /** Auto-Gen Get and Set */
    public PriceList getPricelist() {
        return pricelist;
    }

    public void setPricelist(PriceList pricelist) {
        this.pricelist = pricelist;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public double getRevenue() {
        return revenue;
    }
}
