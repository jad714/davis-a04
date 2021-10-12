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

public class Solution41 {

    private List<String> fileIO(String filename){
        // Scans file for names and return an array of strings containing the names to be sorted. Return the String array.
        List<String> data = new ArrayList<>();
        try{
            Scanner fileIO = new Scanner(new File(filename));
            while(fileIO.hasNextLine()){
                data.add(fileIO.nextLine());
            }
            fileIO.close();
        }
        catch(FileNotFoundException e){
            System.err.println("Could not locate file!");
            e.printStackTrace();
            System.exit(-1);
        }
        return data;
    }

    public List<String> sortNames(String filename){
        // Sort the names in the passed list alphabetically and return the alphabetized list (first calls the fileIO method). Return.
        List<String> names = this.fileIO(filename);
        java.util.Collections.sort(names);
        return names;
    }

    private void printNames(List<String> names){
        // Takes in a sorted list of names and prints them to the output stream.
        System.out.println("Total of " + names.size() + " names");
        System.out.println("-----------------");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args){
        // Call sortNames to scan the files and sort the names alphabetically.  Print them in formatted fashion.
        Solution41 application = new Solution41();
        List<String> names = application.sortNames("./data/exercise41_input.txt");
        application.printNames(names);
    }
}
