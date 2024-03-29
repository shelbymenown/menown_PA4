/*
 * Shelby Menown
 * November 2, 2019
 * COP3330 - Object Oriented Programming
 *
 * Assignment 4 (IntelliJ) - Problem 2
 *
 * Create a class called DuplicateCounter. Create an instance method called count that takes a single parameter called
 * dataFile (representing the path to a text file) and uses a Map of Strings to count how many times each word occurs
 * in dataFile. The counts should be stored in an instance variable called wordCounter. Create an instance method called
 * write that takes a single parameter called outputFile (representing the path to a text file) and writes the contents
 * of wordCounter to the file pointed to by outputFile. The output file should be overwritten if it already exists, and
 * created if it does not exist.
 * Create a separate class called Application that contains a main method which illustrates the use of DuplicateCounter
 * by calling both the remove and write methods. Your input file must be called problem2.txt and your output file must
 * be called unique_word_counts.txt. You will not receive credit if you use different file names, as my graders will not
 * modify your code to make it work with their test files.
 * Your program should work on any text file. The TA's will provide their own version of problem1.txt when they run your code.
 */

import java.io.IOException;

public class Application {
    //Main function
    public static void main(String[] args) throws IOException{
        //Declaring variables
        DuplicateCounter testApplication = new DuplicateCounter();

        //Calling method to count all duplicate words from passed text file
        testApplication.count("problem2.txt");

        //Calling method to write all word and word counts into new file
        testApplication.write();
    }
}