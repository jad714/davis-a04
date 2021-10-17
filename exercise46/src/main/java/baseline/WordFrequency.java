/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordFrequency{
    // Declare instance variable of type String for the filepath and two lists, one for the entire file, and one for unique words.
    private final String inputPath;
    private List<String> uniqueWords = new ArrayList<>();
    private List<String> entireFile = new ArrayList<>();
    public WordFrequency(String inputPathString){
        // Use the constructor to initialize a Path for inputPathString.
        this.inputPath = inputPathString;
    }

    public List<String> readFile(){
        // Reads the file as a list of Strings and returns that list.
        // Declare List to store the entire file as separate entries.
        // Instantiate new Scanner object of File(inputPath) in a try-catch for FileNotFound exception.
        try{
            Scanner fileInput = new Scanner(new File(inputPath));
            // Read the file word by word until there are no more left. Add each word to the List.
            while(fileInput.hasNext()){
                entireFile.add(fileInput.next());
            }
            // Close the Scanner.
            fileInput.close();
        }
        catch(FileNotFoundException e){
            // Print an error if the file could not be located. Exit the program gracefully.
            System.err.println("Input file \"" + inputPath + "\" could not be found! Please check the file path and try again.");
            System.exit(0);
        }
        return entireFile;
    }

    public int frequencyCounter(String wordToCount){
        // Counts the frequency of a given word in the list. Returns that number.
        int count = 0;
        for (String word : entireFile) {
            if (wordToCount.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public List<String> uniqueWordListCreator(){
        // This method will create and return a list of the unique words in the file.
        // The first word will always be unique. This should save resources during the loop.
        uniqueWords.add(entireFile.get(0));
        // Loop word by word to see if the list of unique words already contains this word. If not, add it.
        for(int i=1;i<entireFile.size();i++){
            if(!uniqueWords.contains(entireFile.get(i))){
                uniqueWords.add(entireFile.get(i));
            }
        }
        return uniqueWords;
    }

    public void processOutput(){
        // Call the readFile function and then the frequencyCounter function for each step of the process.
        entireFile = this.readFile();
        uniqueWords = this.uniqueWordListCreator();
        // Send each word in uniqueWords to the frequencyCounter function.
        for (String uniqueWord : uniqueWords) {
            // thisCount refers to the count for each unique word, to be printed to the console.
            int thisCount = this.frequencyCounter(uniqueWord);
            // Purely for the sake of output, each unique word gets a ":" added to it.
            String word = uniqueWord.concat(":");
            // Print each unique word for output.
            System.out.printf("%-10s", word);
            // Print a "*" for each time the word appears.
            for (int j = 1; j <= thisCount; j++) {
                System.out.print("*");
            }
            // Add a newline at the end of processing each line of the histogram.
            System.out.printf("%n");
        }
    }
}
