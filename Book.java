/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryapp;

/**
 *
 * @author Fabio Curcio Madeira SBA18010
 */
public class Book {

    
    String yearPublished;
    int isbn;
    String title;
    String author;
    String genre;
    
    /**
     *
     * @param title
     * @param author
     * @param genre
     * @param yearPublished
     * @param isbn
     */
    public Book(int isbn, String yearPublished, String title, String author, String genre) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.yearPublished = yearPublished;
            this.isbn = isbn;
    }
   
    
    
    //Contructor:

    /**
     *
     * @param title
     */
         public Book(String title) {
        this.title = title;
    }

        
    //Getters and Setters:

    /**
     *
     * @return
     */
        public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *
     * @return
     */
    public String getGenre() {
        return genre;
    }

    /**
     *
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     *
     * @return
     */
    public String getYearPublished() {
        return yearPublished;
    }

    /**
     *
     * @param yearPublished
     */
    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    /**
     *
     * @return
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     *
     * @param isbn
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\nBook{" + ", ISBN: " + isbn + ", Title: " + title + "Year: " + yearPublished +   ", Author: " + author + ", Genre: " + genre + '}';
    }
}
