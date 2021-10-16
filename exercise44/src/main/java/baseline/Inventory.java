/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.List;

public class Inventory{
    // This class was created because of how the json file was constructed.
    // it basically just contains a list of products, and has a getter method.
    List<Products> products;
    public Inventory(List<Products> products){
        // Set the products equal to whatever was passed to Inventory by Gson.
        this.products = products;
    }

    public Products getProducts(int i){
        // Prints the product at a given index.
        return products.get(i);
    }
}
