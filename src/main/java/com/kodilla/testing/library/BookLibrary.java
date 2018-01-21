package com.kodilla.testing.library;
import java.util.*;

public class BookLibrary {
    LibraryDatabase libraryDatabase;
    LibraryUser libraryUser;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }
    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book>listBooksInHandsOf(LibraryUser libraryUser){
        List<Book> bookList = new ArrayList<Book>();
        //bookList.add(new Book("Secrets of Alamo", "John Smith", 2008));
       // bookList.add(new Book("Secretaries and Directors", "Dilbert Michigan", 2012));
        //bookList.add(new Book("Secret life of programmers", "Steve Wolkowitz", 2016));
        //bookList.add(new Book("Secrets of Java", "Ian Tenewitch", 2010));
        //bookList.add(new Book("Clockwork orange", "J.J. Kubrik", 1976));


        //List<Book> resultList = libraryDatabase
               // .listBooksInHandsOf(libraryUser);
       // System.out.println(libraryDatabase
          //      .listBooksInHandsOf(libraryUser));
        //if (resultList.size() > 20) return bookList;
        //bookList = resultList;
        return bookList;

    }


}
