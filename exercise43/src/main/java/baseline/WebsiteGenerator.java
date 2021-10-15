/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WebsiteGenerator{
    // Define four instance variables for responses regarding folder and file creation.
    private final String js;
    private final String css;
    private final String webAuthor;
    private final String webSite;
    private final String createdConstant; // SonarLint made me add this silly constant.
    public WebsiteGenerator(String jsAns, String cssAns, String author, String site){
        // Initialize instance variables.
        js = jsAns;
        css = cssAns;
        webAuthor = author;
        webSite = site;
        createdConstant = "Created ";
    }

    public void folderCreator(){
        // This method will create the required folders and call the other method to add files.
        // First create a string with desired directory path.
        String path = "data/website";
        path = path.concat("/");
        path = path.concat(webSite);
        // Then create the main website directory file.
        File website = new File(path);
        if(!website.mkdirs()){
            System.err.println("Unable to create website directory!!! Directory may already exist!!!");
        }
        else{
            System.out.println(createdConstant + path);
        }
        // Call the indexCreator method.
        this.indexCreator(path);
        // Then, according to user input (either, both, or neither), create folders in directory.
        if(js.equals("y")){
            String jsPath = path.concat("/js");
            File jsFile = new File(jsPath);
            if(!jsFile.mkdir()){
                System.err.println("Unable to create JavaScript folder!!! Folder may already exist!!!");
            }
            else{
                System.out.println(createdConstant + jsPath);
            }
        }
        if(css.equals("y")){
            String cssPath = path.concat("/css");
            File cssFile = new File(cssPath);
            if(!cssFile.mkdir()){
                System.err.println("Unable to create CSS folder!!! Folder may already exist!!!");
            }
            else{
                System.out.println(createdConstant + cssPath);
            }
        }
    }

    private void indexCreator(String path){
        // Creates index.html according to user specifications.
        path = path.concat("/index.html");
        try{
            File index = new File(path);
            String contents = "<title>";
            contents = contents.concat(webSite);
            contents = contents.concat("</title><meta>");
            contents = contents.concat(webAuthor);
            contents = contents.concat("</meta>");
            PrintWriter fileWriter = new PrintWriter(index);
            fileWriter.write(contents);
            fileWriter.close();
            System.out.println(createdConstant + path);
        }
        catch(FileNotFoundException e){
            System.err.println("Could not create file to write!!! File may already exist!!!");
            System.exit(0);
        }
    }
}
