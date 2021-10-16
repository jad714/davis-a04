/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    // Note that tests have not been written for getters as they only retrieve data.

    @Test
    void isFound(){
        // Test that a valid search returns true and an invalid search returns false.
        Products productsTest = new Products("testItem1", 25.00, 4);
        assertTrue(productsTest.isFound("testItem1"));
        assertFalse(productsTest.isFound("All your base are belong to us."));
    }
}