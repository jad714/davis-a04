/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileScanner {
    // No other class will require access to these values, and they will not be changed by any other classes or methods.
    private final List<String> employeeFNames = new ArrayList<>();
    private final List<String> employeeLNames = new ArrayList<>();
    private final List<String> employeeSalary = new ArrayList<>();

    public void readFile(String filename){
        // Performs the reading of the file and returns a 2D array with all of the data.
        // Instantiate new Scanner
        try{
            // Instantiate new scanner for the file.
            Scanner fileIO = new Scanner(new File(filename));
            while(fileIO.hasNextLine()) {
                // employeeData will be overwritten each time to be split into first names, last names, and salaries.
                String[] employeeData = fileIO.nextLine().split(",");
                employeeLNames.add(employeeData[0]);
                employeeFNames.add(employeeData[1]);
                employeeSalary.add(employeeData[2]);
            }
            fileIO.close();
        }
        catch(FileNotFoundException e){
            System.err.println("The specified file could not be located.");
            System.exit(-1);
        }
    }

    public void printData(){
        // Prints a formatted table with all of the employee data.
        System.out.printf("Last      First     Salary%n");
        System.out.printf("--------------------------%n");
        // For each employee (each list should be same size), print all data in formatted list.
        for(int i=0;i<employeeFNames.size();i++){
            System.out.printf("%-10s%-10s%-10s%n", employeeLNames.get(i), employeeFNames.get(i), employeeSalary.get(i));
        }
    }

    public List<String> getFNames(){
        /* Note: This method is exclusively used for testing in this case but could be used
        in conjunction with getters for the rest if such was the client's desires. */
        return employeeFNames;
    }
}
