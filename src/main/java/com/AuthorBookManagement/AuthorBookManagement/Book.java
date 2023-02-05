package com.AuthorBookManagement.AuthorBookManagement;

public class Book {
    private String bookName;
    private String authorName;
    private int pages;  //no of pages in book

    public Book(String bookName, String authorName, int pages) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pages = pages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}





//
//    Create an author and book management system which can help us easily to perform CRUD operations.
//    POST :Add book(been there), add author
//        GET : the bookName with highest no. of pages.
//        PUT the (path bookname, updated pages);
//        GET author who has written the highest no. of pages