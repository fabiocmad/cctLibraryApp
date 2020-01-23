/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryapp;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Fabio Curcio Madeira SBA18010
 */
public class Menu {

    /**
     * Method used to create a menu that the user can interact. Menu: ((1)) -
     * Show books by title. ((2)) - Show books by genre. ((3)) - Show books by
     * year. ((4)) - Show books by ISBN. ((5)) - Show books by Author and title.
     * ((6)) - Show books by Author and genre. ((7)) - Show books by Author and
     * year. ((8)) - Show books by Author and ISBN. ((9)) - Show all books info.
     * ((0)) - exit.
     *
     * @param data
     */
    public static void userMenu(DataStore data) {
        int exit = 0;
        int choice;
        Scanner kb = new Scanner(System.in);
        Scanner keyBoard = new Scanner(System.in);

        ArrayList<Book> booksOfTheAuthorChoosen = new ArrayList<>();
        ArrayList<Book> allBooks = new ArrayList<>();
        

        System.out.println("Welcome to the LibrayApp.");

        while (exit == 0) {
            System.out.println(" \n Please choose an option from below: \n"
                    + "((1)) - Show books by title. \n"
                    + "((2)) - Show books by genre. \n"
                    + "((3)) - Show books by year. \n"
                    + "((4)) - Show books by ISBN. \n"
                    + "((5)) - Show books by Author book titles. \n"
                    + "((6)) - Show books by Author book genres. \n"
                    + "((7)) - Show books by Author and book year. \n"
                    + "((8)) - Show books by Author and book ISBN. \n"
                    + "((9)) - Show all books info. \n"
                    + "((0)) - exit. \n");

            System.out.print("Insert the option number: ");
            choice = kb.nextInt();

            switch (choice) {
                case 1: //Show books by title.
                {

                    System.out.println(data.titlesList);
                    System.out.println("\nPress enter to continue.");
                    keyBoard.nextLine();

                }
                break;

                case 2: //2 - Show books by genre. Find a way to print genres without repeating or think about something else
                {
                    System.out.println(data.getGenresList());
                    System.out.print("\nPress enter to continue.");
                    keyBoard.nextLine();
                }
                break;

                case 3: //3 - Show books by year.
                {
                    System.out.println(data.getYearPublishedList());
                    System.out.print("\nPress enter to continue.");
                    keyBoard.nextLine();
                }
                break;

                case 4: //4 - Show books by ISBN.
                {
                    System.out.println(data.books);
                    System.out.print("\nPress enter to continue.");
                    keyBoard.nextLine();
                }
                break;

                case 5: //5 - Show books by Author and title.
                {

                    System.out.println("Please enter the name of the author: 'Sally Young', 'Aleena Gibbons', 'Cleo Fuller', 'Faye Barnes', 'Kyla Mcdonald', 'Poppy Graham', 'Cora Curry', 'Aiden Michael', 'Orla Mosley', 'Maia Booke' ");

                    ArrayList<String> titles = new ArrayList<>();

                    switch (keyBoard.nextLine()) {
                        case "Sally Young":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Sally Young")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }

                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                titles.add(booksOfTheAuthorChoosen.get(i).getTitle());
                            }

                            Sort.doBubbleSort(titles);

                            break;

                        case "Aleena Gibbons":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Aleena Gibbons")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }

                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                titles.add(booksOfTheAuthorChoosen.get(i).getTitle());
                            }

                            Sort.doBubbleSort(titles);

                            break;
                        case "Cleo Fuller":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Cleo Fuller")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }

                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                titles.add(booksOfTheAuthorChoosen.get(i).getTitle());
                            }

                            Sort.doBubbleSort(titles);

                            break;
                        case "Faye Barnes":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Faye Barnes")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                titles.add(booksOfTheAuthorChoosen.get(i).getTitle());
                            }

                            Sort.doBubbleSort(titles);
                            break;
                        case "Kyla Mcdonald":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Kyla Mcdonald")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                titles.add(booksOfTheAuthorChoosen.get(i).getTitle());
                            }

                            Sort.doBubbleSort(titles);
                            break;
                        case "Poppy Graham":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Poppy Graham")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                titles.add(booksOfTheAuthorChoosen.get(i).getTitle());
                            }

                            Sort.doBubbleSort(titles);
                            break;
                        case "Cora Curry":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Cora Curry")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                titles.add(booksOfTheAuthorChoosen.get(i).getTitle());
                            }

                            Sort.doBubbleSort(titles);
                            break;
                        case "Aiden Michael":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Aiden Michael")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                titles.add(booksOfTheAuthorChoosen.get(i).getTitle());
                            }

                            Sort.doBubbleSort(titles);
                            break;
                        case "Orla Mosley":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Orla Mosley")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                titles.add(booksOfTheAuthorChoosen.get(i).getTitle());
                            }

                            Sort.doBubbleSort(titles);
                            break;
                        case "Maia Booke":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Maia Booke")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                titles.add(booksOfTheAuthorChoosen.get(i).getTitle());
                            }

                            Sort.doBubbleSort(titles);
                            break;
                    }

                    //System.out.println(booksOfTheAuthorChoosen);
                }

                break;

                case 6: //6 - Show books by Author and genre.
                {

                    System.out.println("Please enter the name of the author: 'Sally Young', 'Aleena Gibbons', 'Cleo Fuller', 'Faye Barnes', 'Kyla Mcdonald', 'Poppy Graham', 'Cora Curry', 'Aiden Michael', 'Orla Mosley', 'Maia Booke' ");

                    ArrayList<String> genres = new ArrayList<>();

                    switch (keyBoard.nextLine()) {
                        case "Sally Young":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Sally Young")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                genres.add(booksOfTheAuthorChoosen.get(i).getGenre());
                            }

                            Sort.doBubbleSort(genres);
                            break;
                        case "Aleena Gibbons":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Aleena Gibbons")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                genres.add(booksOfTheAuthorChoosen.get(i).getGenre());
                            }

                            Sort.doBubbleSort(genres);
                            break;
                        case "Cleo Fuller":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Cleo Fuller")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                genres.add(booksOfTheAuthorChoosen.get(i).getGenre());
                            }

                            Sort.doBubbleSort(genres);
                            break;
                        case "Faye Barnes":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Faye Barnes")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                genres.add(booksOfTheAuthorChoosen.get(i).getGenre());
                            }

                            Sort.doBubbleSort(genres);
                            break;
                        case "Kyla Mcdonald":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Kyla Mcdonald")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                genres.add(booksOfTheAuthorChoosen.get(i).getGenre());
                            }

                            Sort.doBubbleSort(genres);
                            break;
                        case "Poppy Graham":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Poppy Graham")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                genres.add(booksOfTheAuthorChoosen.get(i).getGenre());
                            }

                            Sort.doBubbleSort(genres);
                            break;
                        case "Cora Curry":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Cora Curry")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                genres.add(booksOfTheAuthorChoosen.get(i).getGenre());
                            }

                            Sort.doBubbleSort(genres);
                            break;
                        case "Aiden Michael":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Aiden Michael")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                genres.add(booksOfTheAuthorChoosen.get(i).getGenre());
                            }

                            Sort.doBubbleSort(genres);
                            break;
                        case "Orla Mosley":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Orla Mosley")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                genres.add(booksOfTheAuthorChoosen.get(i).getGenre());
                            }

                            Sort.doBubbleSort(genres);
                            break;
                        case "Maia Booke":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Maia Booke")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                genres.add(booksOfTheAuthorChoosen.get(i).getGenre());
                            }

                            Sort.doBubbleSort(genres);
                            break;
                    }

                    //System.out.println(booksOfTheAuthorChoosen);
                }

                break;

                case 7: //Show books by Author and year.
                {

                    System.out.println("Please enter the name of the author: 'Sally Young', 'Aleena Gibbons', 'Cleo Fuller', 'Faye Barnes', 'Kyla Mcdonald', 'Poppy Graham', 'Cora Curry', 'Aiden Michael', 'Orla Mosley', 'Maia Booke' ");

                    ArrayList<String> year = new ArrayList<>();

                    switch (keyBoard.nextLine()) {
                        case "Sally Young":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Sally Young")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                year.add(booksOfTheAuthorChoosen.get(i).getYearPublished());
                            }

                            Sort.doBubbleSort(year);
                            break;
                        case "Aleena Gibbons":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Aleena Gibbons")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                year.add(booksOfTheAuthorChoosen.get(i).getYearPublished());
                            }

                            Sort.doBubbleSort(year);
                            break;
                        case "Cleo Fuller":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Cleo Fuller")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                year.add(booksOfTheAuthorChoosen.get(i).getYearPublished());
                            }

                            Sort.doBubbleSort(year);
                            break;
                        case "Faye Barnes":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Faye Barnes")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                year.add(booksOfTheAuthorChoosen.get(i).getYearPublished());
                            }

                            Sort.doBubbleSort(year);
                            break;
                        case "Kyla Mcdonald":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Kyla Mcdonald")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                year.add(booksOfTheAuthorChoosen.get(i).getYearPublished());
                            }

                            Sort.doBubbleSort(year);
                            break;
                        case "Poppy Graham":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Poppy Graham")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                year.add(booksOfTheAuthorChoosen.get(i).getYearPublished());
                            }

                            Sort.doBubbleSort(year);
                            break;
                        case "Cora Curry":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Cora Curry")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                year.add(booksOfTheAuthorChoosen.get(i).getYearPublished());
                            }

                            Sort.doBubbleSort(year);
                            break;
                        case "Aiden Michael":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Aiden Michael")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                year.add(booksOfTheAuthorChoosen.get(i).getYearPublished());
                            }

                            Sort.doBubbleSort(year);
                            break;
                        case "Orla Mosley":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Orla Mosley")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                year.add(booksOfTheAuthorChoosen.get(i).getYearPublished());
                            }

                            Sort.doBubbleSort(year);
                            break;
                        case "Maia Booke":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Maia Booke")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            for (int i = 0; i < booksOfTheAuthorChoosen.size(); i++) {
                                year.add(booksOfTheAuthorChoosen.get(i).getYearPublished());
                            }

                            Sort.doBubbleSort(year);
                            break;
                    }

                    //System.out.println(booksOfTheAuthorChoosen); Tried to print before using bubble sort to make sure information was being transferred
                }

                break;

                case 8: //8 - Show books by Author and ISBN.
                {

                    System.out.println("Please enter the name of the author: 'Sally Young', 'Aleena Gibbons', 'Cleo Fuller', 'Faye Barnes', 'Kyla Mcdonald', 'Poppy Graham', 'Cora Curry', 'Aiden Michael', 'Orla Mosley', 'Maia Booke' ");

                    //ArrayList<String> isbn = new ArrayList<>();
                    
                    switch (keyBoard.nextLine()) {
                        case "Sally Young":

                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Sally Young")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                               
                            }

                            break;
                        case "Aleena Gibbons":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Aleena Gibbons")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            break;
                        case "Cleo Fuller":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Cleo Fuller")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            break;
                        case "Faye Barnes":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Faye Barnes")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            break;
                        case "Kyla Mcdonald":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Kyla Mcdonald")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            break;
                        case "Poppy Graham":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Poppy Graham")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            break;
                        case "Cora Curry":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Cora Curry")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            break;
                        case "Aiden Michael":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Aiden Michael")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            break;
                        case "Orla Mosley":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Orla Mosley")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            break;
                        case "Maia Booke":
                            for (int i = 0; i < data.books.size(); i++) {

                                if (data.getBooks().get(i).getAuthor().contains("Maia Booke")) {
                                    booksOfTheAuthorChoosen.add(data.getBooks().get(i));
                                }
                            }
                            break;
                    }

                    System.out.println(booksOfTheAuthorChoosen);
                }

                break;

                case 9: //9 - Show all books info.
                {
                    for (int i = 0; i < data.getBooks().size(); i++) {

                        allBooks.add(data.getBooks().get(i));
                    }

                    System.out.println(allBooks);
                }
                break;
                    
                case 0:
                {
                    System.out.println("Thank you for using the Library App.");
                    
                }
                break;

                default: {
                    System.out.println("\nPlease select a valid option. \n \n");
                }
            }
        }
    }
}
