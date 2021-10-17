/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyTest {

    @Test
    void readFileTest(){
        // Tests that a file is successfully read and placed in a List.
        WordFrequency wordFrequencyTest = new WordFrequency("data/exercise46_inputTest.txt");
        List<String> testList = new ArrayList<>();
        for(int i=0;i<3;i++) {
            testList.add("boop");
        }
        testList.add("beep");
        assertEquals(testList, wordFrequencyTest.readFile());
    }

    @Test
    void uniqueWordListCreatorTest(){
        // Test that the unique word list only contains unique words.
        WordFrequency wordFrequencyTest = new WordFrequency("data/exercise46_inputTest.txt");
        List<String> testList = new ArrayList<>();
        testList.add("boop");
        testList.add("beep");
        // Run readFile so that there is an entireFile list created.
        wordFrequencyTest.readFile();
        // Compare for equality.
        assertEquals(testList, wordFrequencyTest.uniqueWordListCreator());
    }


    @Test
    void frequencyCounterTest(){
        // Tests that the frequency of a given word is successfully counted.
        WordFrequency wordFrequencyTest = new WordFrequency("data/exercise46_inputTest.txt");
        // Hard code the number of expected "boop" instances.
        int boop = 3;
        // Run readFile so that there is something for frequency counter to count.
        wordFrequencyTest.readFile();
        // Check for the equality of expected boops vs actual boops.
        assertEquals(boop, wordFrequencyTest.frequencyCounter("boop"));
    }
}