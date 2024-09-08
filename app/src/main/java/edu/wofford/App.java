package edu.wofford;

import java.io.*;
import java.util.Scanner;

public class App {
    /**
     * This function reads the grades from the given file object and
     * returns them as an array of integers.
     * 
     * @param fileObject the file object to read
     * @return an array of grades
     */
    public static int[] loadGradesFromFile(File fileObject) {
        int[] grades = null;
        
        // TODO:
        // Load the grades from the file object and return them.
        // 1. Read the number of grades N from the file.
        // 2. Create an integer array of size N.
        // 3. Loop through the rest of the file (N values), storing
        //    each in the appropriate element of the array.
        
        

        
        return grades;
    }

    /**
     * This function creates the bins given the data and the
     * upper bounds for each bin. The function returns an array
     * of integers of the same length as the upperBound array
     * containing the count of elements in data that fall into
     * that particular bin.
     * 
     * @param data an array of grades
     * @param upperBound an array containing the upper bounds of each bin
     * @return an array of counts
     */
    public static int[] createBins(int[] data, int[] upperBound) {
        int[] bin = null;
        
        // TODO:
        // Create the bin array and fill it with the appropriate counts.
        // The size of the bin array should be the same as the size of the
        // upperBound array. Any data element <= to an upper bound should
        // fall in that bin.
        



        return bin;
    }

    /**
     * This function produces an array of strings representing each
     * bin (range and count). For instance, if the bin were 0 to 5
     * with a count of 12, then that string should be 
     * [0-5]: 12
     * 
     * @param upperBound an array containing the upper bounds of each bin
     * @param bin an array of counts
     * @return an array of bin strings
     */
    public static String[] displayBins(int[] upperBound, int[] bin) {
        String[] display = null;

        // TODO:
        // Create the display array and fill it with the appropriate strings.
        // The size of the display array should be the same as the size of the
        // upperBound array. Every element of the array should be of the form
        // [lo - hi]: count
        // where lo and hi are inclusive. The lowest value is always 0.



        return display;
    }
}
