/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

/* NOTE: TA please read!!! As I understand the instructions at the time
of writing this program, I have structured my files to be written with data
as the parent directory for "website" and everything else contained within.
At the time of your opening this program, data should be EMPTY (to provide you with a clean
slate for your own testing), and should therefore not be tracked by GitHub. However, once you
run the program, the "data" folder and all of the required contents should populate as specified by the user. */

package baseline;

import java.util.Scanner;

public class Solution43{

    public static void main(String[] args){
        // Instantiate new scanner object.
        Scanner userInput = new Scanner(System.in);
        // Prompt user for the four pieces of information we need.
        System.out.print("Site name: ");
        String site = userInput.nextLine();
        System.out.print("Author: ");
        String author = userInput.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        // Keep track of bad input so I can yell at the user for it after the first time.
        int badInputCount = 0;
        String jsAns = "";
        // Loop for bad input until correct input is given (case insensitive).
        while(!jsAns.equals("y")&&!jsAns.equals("n")){
            if(badInputCount>0){
                System.out.print("Invalid input. Please enter 'y' or 'n': ");
            }
            jsAns = userInput.nextLine().toLowerCase();
            badInputCount = 1;
        }
        badInputCount = 0;
        String cssAns = "";
        System.out.print("Do you want a folder for CSS? ");
        while(!cssAns.equals("y")&&!cssAns.equals("n")){
            if(badInputCount>0){
                System.out.print("Invalid input. Please enter 'y' or 'n': ");
            }
            cssAns = userInput.nextLine().toLowerCase();
            badInputCount = 1;
        }
        // Instantiate new WebsiteGenerator object with arguments according to user input.
        WebsiteGenerator webGen = new WebsiteGenerator(jsAns, cssAns, author, site);
        // Call folder creator (folder creator will call the rest of the files as required).
        webGen.folderCreator();
    }
}
