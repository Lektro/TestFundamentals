package Exc3Books.main;

import Exc3Books.StoreUtilities.Seller;
import Exc3Books.StoreUtilities.Store;
import Exc3Books.books.authors.BookCollection;
import Exc3Books.books.Books;
import Exc3Books.StoreUtilities.PriceList;
import Exc3Books.StoreUtilities.Stock;

import java.util.ArrayList;

public class Exc3BooksMain {
    public static void main(String[] args) throws NoMoreBooksException {
        /** making a new price list */
        PriceList ls = new PriceList(25);

        /** making stock */
        Stock st = new Stock(5);

        /** adding books */
        Books books = new Books();
        books.setBookTitle("Hamlet");
        books.setBookAuthor("William Shakespeare");

        /** creating store */
        Seller bookstore1 = new Store(ls, st);

        /** put the order in arraylist */
        ArrayList<Books> bookOrder1 = new ArrayList<>();

        /** add a new book to the order to the bookstore*/
        bookOrder1.add(bookstore1.orderBook(new BookCollection[]{BookCollection.Hamlet}));

        /** prints out the order*/
        System.out.println("You bought these books: " + books.getBookTitle() + " by " + books.getBookAuthor());

        /** prints out the Price for the order */
        System.out.println("The total price for this order is: " + bookstore1.getRevenue());

    }
}
