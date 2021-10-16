/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

/* Note: per Dr. Hollander's instructions (see Discord), the "class can be a record" warning will be
ignored. */

package baseline;

public class Products{
    // Stores the name, price and quantity of the inventory record for each product.
    private final String name;
    private final double price;
    private final int quantity;

    public Products(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for this object below.

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public boolean isFound(String search){
        return (this.name.equals(search));
    }

}
