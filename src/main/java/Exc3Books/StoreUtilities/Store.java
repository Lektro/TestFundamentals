package Exc3Books.StoreUtilities;

import Exc3Books.books.BookCollection;
import Exc3Books.books.Books;

public class Store extends Seller {

    /** Class variables */
    private PriceList pricelist;
    private Stock stock;
    private Revenue revenue;

    /** default constructor */
    public Store(){}
    public Store (PriceList pricelist, Stock stock, Revenue revenue){
        this.pricelist = pricelist;
        this.stock = stock;
    }

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

    @Override
    public Revenue getRevenue() {
        return revenue;
    }

    public void setRevenue(Revenue revenue) {
        this.revenue = revenue;
    }

    @Override
    public Books orderBook(BookCollection[] bookCollections) throws NoMoreBooksException {
        return null;
    }
}
