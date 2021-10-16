/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */


package baseline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/* Note: The warning that a class can instead be a record is being ignored per Dr. Hollander's instructions (see Discord). */
/* Note: There will be no output file until the user specifies one, per the instructions. */

public class WordReplacer{
    // Declare instance variables for readFileName, writeFileName, the string to remove, and its replacement.
    private final String readFileName;
    private final String writeFileName;
    private final String toRemove;
    private final String replacement;
    public WordReplacer(String readFileName, String writeFileName, String toRemove, String replacement){
        // initialize instance variables readFileName, writeFileName, toRemove and replacement with passed arguments to constructor.
        this.readFileName = readFileName;
        this.writeFileName = writeFileName;
        this.toRemove = toRemove;
        this.replacement = replacement;
    }

    public String readFile(){
        // Reads the file from the input and returns this as a long string.
        // Declare string.
        // Instantiate new Path object inside of try, catch IO exception.
        // Read entire file to string.
        Path filePath;
        String returnString = "";
        try{
            // Create path for readFileName string.
            filePath = Path.of(readFileName);
            returnString = Files.readString(filePath); // Should throw IOException if unable.
        }
        catch(IOException e){
            // Program exits gracefully if unable to read file (nowhere for the program to go in that case).
            System.err.println("The specified file, \"" + readFileName +"\", could not be found!!!");
            System.exit(0);
        }
        return returnString;
    }

    public String replaceString(String originalString){
        // Replaces the toRemove string with replacement string in all instances in the originalString and returns that string.
        return originalString.replaceAll(toRemove, replacement);
    }

    public void processOutput(){
        // Call other methods sequentially to construct the output.
        String originalString = this.readFile();
        String modifiedString = this.replaceString(originalString);
        // Prints the output to the console for immediate user feedback, and also writes the output to a file.
        System.out.println("Writing below to specified file: ");
        System.out.printf("%n");
        System.out.println(modifiedString);
        System.out.printf("%n");
        System.out.println("Specified file: " + writeFileName);
        // Set up try/catch for IO regarding written file.
        try{
            Path writePath = Path.of(writeFileName);
            // Write the String to a file, creating a new one.
            Files.writeString(writePath, modifiedString, StandardOpenOption.CREATE_NEW);
        }
        catch(IOException e){
            // This catch will not end the program because it can still technically function, though a file would not be written.
            System.err.println("WARNING!!! File \"" + writeFileName + "\" could not be written!!!\nCheck for errors in file naming syntax and make sure no duplicates exist.");
        }
    }
}
