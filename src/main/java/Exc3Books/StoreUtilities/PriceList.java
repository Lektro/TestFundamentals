package Exc3Books.StoreUtilities;

public class PriceList {
    private double bookPrice;

    /** Default constructor */
    public PriceList(){}

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
