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
    public Store(double revenue){
        this.revenue = revenue;
    }

    /** Method to order Book */
    public Books orderBook(BookCollection[] bookCollections) throws NoMoreBooksException {
        if (stock.getBook() > 0) {
            Books book = new Books();
            revenue += pricelist.getBookPrice();
            stock.setBook(stock.getBook() - 1);
            return book;
        }
        return null;
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
