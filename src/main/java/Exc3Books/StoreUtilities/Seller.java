package Exc3Books.StoreUtilities;

import Exc3Books.books.authors.BookCollection;
import Exc3Books.books.Books;
import Exc3Books.main.NoMoreBooksException;

public interface Seller extends Revenue {

    /**
     * Should be called orderBooks plural if ordering a list of books, to avoid confusing colleagues.
     */
    Books orderBook(BookCollection[] bookCollections ) throws NoMoreBooksException;


    } // should be on same tab width as block that it closes.

