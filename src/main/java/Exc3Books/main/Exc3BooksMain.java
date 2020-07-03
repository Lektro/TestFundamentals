package Exc3Books.main;

import Exc3Books.StoreUtilities.Seller;
import Exc3Books.StoreUtilities.Store;
import Exc3Books.books.BookCollection;
import Exc3Books.books.Books;
import Exc3Books.StoreUtilities.PriceList;
import Exc3Books.StoreUtilities.Stock;

import java.util.ArrayList;

public class Exc3BooksMain {
    public static void main(String[] args) throws NoMoreBooksException {
        PriceList ls = new PriceList(25);

        Stock st = new Stock(5);

        Seller bookstore1 = new Store(ls, st);

        ArrayList<Books> bookOrder1 = new ArrayList<>();

        bookOrder1.add(bookstore1.orderBook(new BookCollection[]{BookCollection.Hamlet}));
        System.out.println("You bought a book written by: " + bookstore1.toString());
        System.out.println("The total revenue for this order is: " + bookstore1.getRevenue());






    }
}
