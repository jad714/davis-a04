/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileScannerTest {

    @Test
    void readFileTest() {
        // Effectively, this file tests the readFile method by utilizing the get method.
        FileScanner fsTest = new FileScanner();
        fsTest.readFile("data/exercise42_input.txt");
        List<String> employeeFNameTest = new ArrayList<>();
        employeeFNameTest.add("Mai");
        employeeFNameTest.add("Jim");
        employeeFNameTest.add("Aaron");
        employeeFNameTest.add("Chris");
        employeeFNameTest.add("Geoffrey");
        employeeFNameTest.add("Fong");
        employeeFNameTest.add("Sabrina");
        /* Success of this test will confirm not only that the file was opened and read properly,
        but also that the "split" is functioning properly, as these names were in the center of the list.
        If the test list matches the production list, we're golden. */
        List<String> compListTest = new ArrayList<>();
        assertEquals(employeeFNameTest, fsTest.getFNames());
    }
}