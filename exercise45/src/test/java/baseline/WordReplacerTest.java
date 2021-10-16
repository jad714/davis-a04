/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */


package baseline;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WordReplacerTest {
    /* Note: The test file will not be present inside of data/ until the grader runs the tests. */
    static final WordReplacer wordReplacerTest = new WordReplacer("data/exercise45_inputTest.txt", "data/exercise45_outputTest.txt", "input", "output");


    @Test
    void readFile(){
        // Assert that test file is read correctly.
        String comparison = "Hello, my name is Josh, and this is my input test for Exercise 45!";
        assertEquals(comparison, wordReplacerTest.readFile());
    }

    @Test
    void replaceString(){
        // Assert that the test file string is correctly produced.
        String comparison1 = "Hello, my name is Josh, and this is my input test for Exercise 45!";
        String comparison2 = "Hello, my name is Josh, and this is my output test for Exercise 45!";
        assertEquals(comparison2, wordReplacerTest.replaceString(comparison1));
    }

    @Test
    void processOutput(){
        // Assert that the output file is successfully created.
        Path testPath = Path.of("data/exercise45_outputTest.txt");
        wordReplacerTest.processOutput();
        assertTrue(Files.exists(testPath));
    }
}