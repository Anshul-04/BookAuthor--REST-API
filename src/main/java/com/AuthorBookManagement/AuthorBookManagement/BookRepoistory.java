package com.AuthorBookManagement.AuthorBookManagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class BookRepoistory {

    //Creating database for book and author
    Map<String,Book> book_DB = new HashMap<>();
    Map<String,Author> author_DB = new HashMap<>();

    //Adding the Book
    public String addBook(Book book){
        String bk = book.getBookName();
        //Checking if book present or not
        if(book_DB.containsKey(bk)){
            return "Book is Already present in database.";
        }
        book_DB.put(bk,book);
        return "Book added Successfully.";
    }

    //Adding the author
    public String addAuthor(Author author){
        String auth = author.getAuthorName();
        //Checking if Author present or not
        if(author_DB.containsKey(auth)){
            return "Author already present in database";
        }
        author_DB.put(auth,author);
        return "Author added successfully.";
    }

    //GET : the bookName with Highest no. of pages.
    public String bookNameWithHighestPages(){
        String bookName ="";
        int maximumPages =0;

        for(Book book : book_DB.values() ){
            if(book.getPages() > maximumPages){
                maximumPages = book.getPages();  //updating the maxPages
                bookName = book.getBookName();   //getting the name of book with maximum pages
            }
        }
        return bookName;
    }

     //  PUT the (path bookname, updated pages) updating the book
    public String updateBookPage(String bookName,int newPages){
        int initialPages = book_DB.get(bookName).getPages();  //getting the no of pages in the book
        book_DB.get(bookName).setPages(initialPages + newPages);  //adding the newPages to the old pages in the book.
        return "Book Pages updated Successfully.";
    }

     //GET author who has written the highest no. of pages
    public String authorNameWithHighestPages(){
        String authorName ="";
        int maximumPages =0;

        for(Book book : book_DB.values() ){
            if(book.getPages() > maximumPages){
                maximumPages = book.getPages();     //updating the maxPages
               authorName = book.getAuthorName();  //getting the author name whose book has higest no of pages
            }
        }
        return authorName;
    }

//    public String authorNameWithHighestPages(){
//        String authorname ="";
//        int highest=0;
//        for(Author author : author_DB.values()){
//            int count =0;
//            for(Book book : book_DB.values()){
//              if(author.getAuthorName().equals(book.getAuthorName())){
//                 count += book.getPages();
//              }
//            }
//            highest = Math.max(highest,count);
//            authorName = book.getAuthorName();
//        }
//        return authorName;
//    }

// a   b  c a
// 2  1  3  4
}

