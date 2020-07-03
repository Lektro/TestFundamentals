package Exc3Books.StoreUtilities;

import Exc3Books.books.BookCollection;
import Exc3Books.main.NoMoreBooksException;

import java.awt.print.Book;

public class Store implements Seller {

    /** Class variables */
    private PriceList pricelist;
    private Stock stock;
    private double revenue;

    /** default constructor */
    public Store(){}
    public Store (PriceList pricelist, Stock stock, Revenue revenue){
        this.pricelist = pricelist;
        this.stock = stock;

    }

    /** Method to order CPU */
    public Book orderCpu(BookCollection[] bookCollections) throws NoMoreBooksException {
        if (stock.getBook() > 0) {
            Book book = new Book();
            revenue += pricelist.getBookPrice();
            stock.setBook(stock.setBook() - 1);
            return book;
        } else throw new NoMoreBooksException("Sorry we are out of CPU's!");
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
}
