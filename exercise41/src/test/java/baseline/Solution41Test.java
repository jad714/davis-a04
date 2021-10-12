/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    @Test
    void sortNames() {
        /* This test will verify that the file IO functionality is good, as well as checking the
        names are appropriately sorted. The test file will contain letters, A to Z scrambled.
        The test list will be created already sorted for comparison. If true, the tested program
        will function as expected. */
        Solution41 testApplication = new Solution41();
        List<String> testList = new ArrayList<>();
        for(char i = 'A';i <= 'Z';i++){
            testList.add(Character.toString(i));
        }
        assertEquals(testList, testApplication.sortNames("./data/testfile_input.txt"));
    }
}