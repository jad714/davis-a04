/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

public class Solution46{
    public static void main(String[] args){
        // Instantiate new WordFrequency object.
        WordFrequency wordFrequency = new WordFrequency("data/exercise46_input.txt");
        // Call the wordCounter method to count the frequency of each word.
        wordFrequency.processOutput();
    }
}
