/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ProductSearch {
    // Create an inventory instance field.
    Inventory inventory;
    // Create a filepath instance variable.
    final String filePath;
    public ProductSearch(String filePath){
        this.filePath = filePath;
    }

    public void parseJson() {
        // Instantiate new Gson object.
        Gson gson = new Gson();
        // Instantiate new buffered reader (for file IO).
        // Try to read the file.  Catch the IO exception.
        try {
            Reader fileReader = Files.newBufferedReader(Paths.get(filePath));
            // Create a list of objects to store json information in, scan the information using gson library.
            // The list of objects will be contained in the "inventory" instance field due to the structure of the json file.
            inventory = gson.fromJson(fileReader, Inventory.class);
            fileReader.close();
        } catch (IOException e) {
            // The program can only continue if the filename can be found. This prints the error and exits the program gracefully.
            System.err.println("Unable to locate file.");
            System.exit(0);
        }
    }

    public void displayResults() {
        // Instantiate new Scanner object for capturing user input.
        Scanner userInput = new Scanner(System.in);
        // Create new String for search.
        String search;
        this.parseJson();
        // Loop until valid product information can be displayed.
        while (true) {
            System.out.print("What is the product name? ");
            search = userInput.nextLine();
            for (int i=0; i<inventory.products.size();i++) {
                if (inventory.getProducts(i).isFound(search)) {
                    System.out.printf("Name: %s%nPrice: %.2f%nQuantity: %d%n", inventory.getProducts(i).getName(), inventory.getProducts(i).getPrice(), inventory.getProducts(i).getQuantity());
                    return;
                }
            }
            System.out.println("Sorry, that product was not found in our inventory.");
        }
    }
}