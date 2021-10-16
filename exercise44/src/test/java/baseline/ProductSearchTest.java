/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ProductSearchTest {

    // Note that no test has been written for the display function as it only scans input and prints
    // and uses the Products and Inventory classes' getters. It changes nothing and
    // relies on the functionality of the parseJson class.

    @Test
    void parseJson(){
        // Test that a sampling of object contents match what is in the json file.
        Gson gsonTest = new Gson();
        ProductSearch searchProductTest = new ProductSearch("data/exercise44_inputTest.json");
        searchProductTest.parseJson();
        assertEquals("testItem1",searchProductTest.inventory.getProducts(0).getName());
        assertEquals(5.00, searchProductTest.inventory.getProducts(2).getPrice());
    }
}