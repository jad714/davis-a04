/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

public class Solution42 {
    public static void main(String[] args){
        // Instantiate new FileScanner object.
        FileScanner fs = new FileScanner();
        // Call readFile from FileScanner and collect the data from the file.
        fs.readFile("data/exercise42_input.txt");
        // Print the information.
        fs.printData();
    }
}
