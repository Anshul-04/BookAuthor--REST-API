package com.AuthorBookManagement.AuthorBookManagement;

public class Author {
    private String authorName;
    private int rating; //rating of the books

    public Author(String authorName, int rating) {
        this.authorName = authorName;
        this.rating = rating;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
