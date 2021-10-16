/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */


package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordReplacerTest {
    @BeforeEach
    void instantiateTestObject(){
        WordReplacer testObj = new WordReplacer("data/exercise45_inputTest1.txt", "data/exercise45_outputTest.txt", "Josh", "-redacted-");
    }


    @Test
    void readFile(){
        // Assert that test file is read correctly.
    }

    @Test
    void replaceString(){
        // Assert that the test file string is correctly produced.
    }

    @Test
    void processOutput(){
        // Assert that the output file is successfully created.
    }
}