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
        PriceList ls = new PriceList(25);

        Stock st = new Stock(5);

        Books books = new Books();

        Seller bookstore1 = new Store(ls, st);

        ArrayList<Books> bookOrder1 = new ArrayList<>();

        bookOrder1.add(bookstore1.orderBook(new BookCollection[]{BookCollection.Hamlet}));

        System.out.println("You bought these books: " + books.getBookTitle() + books.getBookAuthor());

        /** prints out the Price for the order */
        System.out.println("The total price for this order is: " + bookstore1.getRevenue());






    }
}
