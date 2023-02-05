package com.AuthorBookManagement.AuthorBookManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepoistory bookRepoistory;

    //Adding the Book
    public String addBook(Book book){
       return bookRepoistory.addBook(book);
    }

    //Adding the author
    public String addAuthor(Author author) {
        return  bookRepoistory.addAuthor(author);
    }

    //GET : the bookName with Highest no. of pages.
    public String bookNameWithHighestPages(){
        return  bookRepoistory.bookNameWithHighestPages();
    }

    //  PUT the (path bookname, updated pages) updating the book
    public String updateBookPage(String bookName,int newPages){
       return bookRepoistory.updateBookPage(bookName,newPages);
    }

    //GET author who has written the highest no. of pages
    public String authorNameWithHighestPages(){
        return bookRepoistory.authorNameWithHighestPages();
    }

}
