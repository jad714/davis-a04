/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */


package baseline;

import java.util.Scanner;

public class Solution45{

    public static void main(String[] args){
        // Instantiate new word replacer object with argument containing the path of the file to be read and the one to be written, along with the string to replace and the desired replacement.
        // But first, prompt user for the output file name. It will be assumed extensions will not be included, as accounting for this error would require
        String outputFile = "data/";
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the name of the output text file: ");
        outputFile = outputFile.concat(userInput.nextLine());
        outputFile = outputFile.concat(".txt");
        WordReplacer wordRep = new WordReplacer("data/exercise45_input.txt", outputFile, "utilize", "use");
        // Call the "processOutput" method for the word replacer object. This will, in turn, call the other methods required.
        wordRep.processOutput();
    }
}
