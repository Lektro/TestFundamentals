package Exc3Books.StoreUtilities;

/*
 * Not really a list if it only contains one price.
 * Class is redundant if every book object already holds a price variable.
 */
public class PriceList {
    /** Class variable */
    private double bookPrice;

    /** Default constructor */
    public PriceList(){}

    /**Constructor */
    public PriceList(double bookPrice){
        this.bookPrice = bookPrice;
    }

    /** auto-gen get and set */
    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}
