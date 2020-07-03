package Exc3Books;

import Exc3Books.books.Books;

public class Seller implements Revenue {

    /** Class variables */
    private PriceList pricelist;
    private double revenue;
    private Seller sales;

    /** default constructor */
    public Seller(){}

    @Override
    public double getRevenue() {
        return revenue;
    }
}
