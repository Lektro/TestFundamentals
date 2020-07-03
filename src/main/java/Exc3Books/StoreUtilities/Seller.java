package Exc3Books.StoreUtilities;

import Exc3Books.books.BookCollection;
import Exc3Books.books.Books;
import Exc3Books.main.NoMoreBooksException;

public interface Seller extends Revenue {
    Books orderBook(BookCollection[] bookCollections ) throws NoMoreBooksException;


    }

