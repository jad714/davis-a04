/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

public class Solution44 {
    public static void main(String[] args){
        // Instantiate new ProductSearch with the path of the json file as argument.
        ProductSearch searchProduct = new ProductSearch("data/exercise44_input.json");
        // Call the displayResults function to execute the entire program.
        searchProduct.displayResults();
    }
}
