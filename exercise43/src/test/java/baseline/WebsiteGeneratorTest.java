/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {

    File testFile = new File("data/website/testSite/index.html");
    File testJS = new File("data/website/testSite/js");
    File testCSS = new File("data/website/testSite/css");

    @Test
    void indexCreatorTest(){
        // This test asserts that the index.html file is created successfully and correctly.
        WebsiteGenerator webGenTest = new WebsiteGenerator("y", "y", "testAuthor", "testSite");
        webGenTest.folderCreator();
        try{
            Scanner fileScan = new Scanner(testFile);
            assertEquals("<title>testSite</title><meta>testAuthor</meta>", fileScan.nextLine());
        }
        catch(FileNotFoundException e){
            fail();
        }
        // If the below tests pass that means the tested method successfully created the files in the first run.
    }

    @Test
    void folderCreatorTest(){
        // This test asserts that the folders created by the folderCreator method exist after Program runs with two "yes" inputs.
        assertTrue(testJS.exists());
        assertTrue(testCSS.exists());
    }
}