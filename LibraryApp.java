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
public class LibraryApp {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       DataStore data = new DataStore();
       
       data.fillBookTitleFile();
       data.createBookList();
       Menu.userMenu(data);
       
      
    }
    
}
