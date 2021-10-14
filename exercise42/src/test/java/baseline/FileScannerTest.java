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
    List<String> fileInputTest1 = new ArrayList<>();
    List<String> fileInputTest2 = new ArrayList<>();
    List<String> fileInputTest3 = new ArrayList<>();

    void defineTest(){
        // Builds the comparison list.
        fileInputTest1.add("a");
        fileInputTest1.add("d");
        fileInputTest2.add("b");
        fileInputTest2.add("e");
        fileInputTest3.add("c");
        fileInputTest3.add("f");
    }

    @Test
    void readFileTest() {
        // Effectively, this file tests the readFile method by utilizing the get method.
        FileScanner fsTest = new FileScanner();
        this.defineTest();
        fsTest.readFile("data/exercise42_test.txt");
        /* Success of this test will confirm not only that the file was opened and read properly,
        but also that the "split" is functioning properly, as these names were in the center of the list.
        If the test list matches the production list, we're golden. */
        assertEquals(fileInputTest1, fsTest.getLNames());
        assertEquals(fileInputTest2, fsTest.getFNames());
        assertEquals(fileInputTest3, fsTest.getSalaries());
    }
}