package com.AuthorBookManagement.AuthorBookManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    BookService bookService;


    //Adding the Book
    @PostMapping("/add_book")
    public ResponseEntity addBook(@RequestBody Book book){
        String response = bookService.addBook(book);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    //Adding the author
    @PostMapping("/add_author")
    public ResponseEntity addAuthor(@RequestBody Author author) {
        String response = bookService.addAuthor(author);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    //GET : the bookName with Highest no. of pages.
    @GetMapping("/get_highjestPageBook")
    public ResponseEntity bookNameWithHighestPages(){
        String response = bookService.bookNameWithHighestPages();
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    //  PUT the (path bookname, updated pages) updating the book
    @PutMapping("/update_bookPages/{bookName}/{newPages}")
    public ResponseEntity updateBookPage(@PathVariable("bookName") String bookName, @PathVariable("newPages") int newPages){
        String response = bookService.updateBookPage(bookName,newPages);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    //GET author who has written the highest no. of pages
    @GetMapping("/get_authorNameWithHigestPage")
    public ResponseEntity authorNameWithHighestPages(){
        String response = bookService.authorNameWithHighestPages();
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

}
