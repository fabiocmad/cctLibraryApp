/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fabio Curcio Madeira SBA18010
 */
public class DataStore {

    /**
     *
     */
    public ArrayList<String>    titlesList           = new ArrayList<>();
    private ArrayList<String>   authorsList          = new ArrayList<>();
    private ArrayList<String>   genresList           = new ArrayList<>();

    /**
     *
     */
    public ArrayList<String>    yearPublishedList    = new ArrayList<>();
    private ArrayList<String>   isbnList             = new ArrayList<>();

    /**
     *
     */
    public ArrayList<Book>      books                 = new ArrayList<>();

    /**
     *
     */
    public void fillBookTitleFile()
    {   
        File fileBookList =  new File("bookTitles.txt");
        ArrayList<String> filled = new ArrayList<>();
        
        try 
        {
            Scanner scan = new Scanner(fileBookList);
            while(scan.hasNextLine())
            {
                filled.add(scan.nextLine());
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        titlesList.addAll(filled);
        //System.out.println(titlesList);
    }
    
    /**
     *
     */
    public void createBookList(){
        
        int quantityOfBooks = 500;
    
        Random randomGenerator = new Random();
        String[] listOfAuthors = {"Sally Young", "Aleena Gibbons", "Cleo Fuller", "Faye Barnes", "Kyla Mcdonald", "Poppy Graham", "Cora Curry", "Aiden Michael", "Orla Mosley", "Maia Booker"};
        String[] listOfGenres = {"Action and adventure" , "Comic book" , "Drama" ,"Fantasy",  "Fairytale" ,"Horror" , "Romance" , "Science fiction" , "Suspense" , "Thriller"};
        String[] listOfYearPublished = {"1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990",
            "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005",
            "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"};
        
        for(int i=0; i<quantityOfBooks; i++){
           
                                
           int isbn = ((titlesList.size()) + 9501 + i );
           String author = listOfAuthors[(randomGenerator.nextInt(listOfAuthors.length))];
           authorsList.add(author);
           String genre = listOfGenres[(randomGenerator.nextInt(listOfGenres.length))]; 
           genresList.add(genre);
           String yearPublished = listOfYearPublished[(randomGenerator.nextInt(listOfYearPublished.length))];
           yearPublishedList.add(yearPublished);
           String title = titlesList.get(randomGenerator.nextInt(titlesList.size()));
           
           Book b = new Book (isbn, title, author, genre, yearPublished);
           books.add(b);
           
        }
        System.out.println(books);
        
    }
    
    
    
    //Getters and Setters:
   
    /**
     *
     * @return
     */
       
    public ArrayList<String> getTitlesList() {
        return titlesList;
    }

    /**
     *
     * @param titlesList
     */
    public void setTitlesList(ArrayList<String> titlesList) {
        this.titlesList = titlesList;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getAuthorsList() {
        return authorsList;
    }

    /**
     *
     * @param authorsList
     */
    public void setAuthorsList(ArrayList<String> authorsList) {
        this.authorsList = authorsList;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getGenresList() {
        return genresList;
    }

    /**
     *
     * @param genresList
     */
    public void setGenresList(ArrayList<String> genresList) {
        this.genresList = genresList;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getYearPublishedList() {
        return yearPublishedList;
    }

    /**
     *
     * @param yearPublishedList
     */
    public void setYearPublishedList(ArrayList<String> yearPublishedList) {
        this.yearPublishedList = yearPublishedList;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getIsbnList() {
        return isbnList;
    }

    /**
     *
     * @param isbnList
     */
    public void setIsbnList(ArrayList<String> isbnList) {
        this.isbnList = isbnList;
    } 

    /**
     *
     * @return
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     *
     * @param books
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        
        return "DataStore{" + ", isbnList=" + isbnList + ", titlesList=" + titlesList + ", authorsList=" + authorsList + ", genresList=" + genresList + ", yearPublishedList=" + yearPublishedList +  ", book=" + books + '}';
    }
}
