package edu.wofford;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

import edu.wofford.App;

class AppTest {
    @Test
    public void testLoadGradesFromFile1() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("testInput1.txt").getFile());
        int[] grades = App.loadGradesFromFile(file);
        int[] expected = {8, 6, 1, 5, 9, 2, 7, 3, 4, 0};
        assertEquals(expected.length, grades.length, "length should match");
        for (int i = 0; i < grades.length; i++) {
            assertEquals(expected[i], grades[i], "value " + i + " should match");
        }
    }

    @Test
    public void testLoadGradesFromFile2() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("testInput2.txt").getFile());
        int[] grades = App.loadGradesFromFile(file);
        int[] expected = {76, 89, 150, 135, 200, 76, 12, 100, 150, 28, 178,
                        189, 167, 200, 175, 150, 87, 99, 129, 149, 176,
                        200, 87, 35, 157, 189};
        assertEquals(expected.length, grades.length, "length should match");
        for (int i = 0; i < grades.length; i++) {
            assertEquals(expected[i], grades[i], "value " + i + " should match");
        }
    }

    @Test
    public void testLoadGradesFromFile3() {
        int[] grades = App.loadGradesFromFile(new File("nonexistent.txt"));
        assertEquals(null, grades);
    }

    @Test
    public void testCreateBins1() {
        int[] data = {8, 6, 1, 5, 9, 2, 7, 3, 4, 0};
        int[] upper = {3, 5, 6, 9};
        int[] bins = App.createBins(data, upper);
        int[] expected = {4, 2, 1, 3};
        assertEquals(expected.length, bins.length, "bins should have the correct length");
        for (int i = 0; i < bins.length; i++) {
            assertEquals(expected[i], bins[i], "bin " + i + " should have the correct value");
        }
    }

    @Test
    public void testCreateBins2() {
        int[] grades = {76, 89, 150, 135, 200, 76, 12, 100, 150, 28, 178,
                        189, 167, 200, 175, 150, 87, 99, 129, 149, 176,
                        200, 87, 35, 157, 189};
        int[] upper = {24, 49, 74, 99, 124, 149, 174, 200};
        int[] bin = App.createBins(grades, upper);
        int[] expected = {1, 2, 0, 6, 1, 3, 5, 8};
        assertEquals(expected.length, bin.length, "bins should have the correct length");
        for (int i = 0; i < bin.length; i++) {
            assertEquals(expected[i], bin[i], "bin " + i + " should have the correct value");
        }
    }

    @Test
    public void testCreateBins3() {
        int[] grades = {80, 60, 70, 50, 30, 0, 90};
        int[] upper = {25, 50, 75, 100};
        int[] bin = App.createBins(grades, upper);
        int[] expected = {1, 2, 2, 2};
        assertEquals(expected.length, bin.length, "bins should have the correct length");
        for (int i = 0; i < bin.length; i++) {
            assertEquals(expected[i], bin[i], "bin " + i + " should have the correct value");
        }
    }

    @Test
    public void testDisplayBins1() {
        int[] upper = {3, 5, 6, 9};
        int[] bin = {4, 2, 1, 3};
        String[] display = App.displayBins(upper, bin);
        String[] expected = {"[0 - 3]: 4", "[4 - 5]: 2", "[6 - 6]: 1", "[7 - 9]: 3"};
        assertEquals(expected.length, display.length, "display should have the correct length");
        for (int i = 0; i < display.length; i++) {
            assertEquals(expected[i], display[i], "display " + i + " should have the correct value");
        }
    }

    @Test
    public void testDisplayBins2() {
        int[] upper = {24, 49, 74, 99, 124, 149, 174, 200};
        int[] bin = {1, 2, 0, 6, 1, 3, 5, 8};
        String[] display = App.displayBins(upper, bin);
        String[] expected = {"[0 - 24]: 1", "[25 - 49]: 2", "[50 - 74]: 0", "[75 - 99]: 6",
                             "[100 - 124]: 1", "[125 - 149]: 3", "[150 - 174]: 5", "[175 - 200]: 8"};
        assertEquals(expected.length, display.length, "display should have the correct length");
        for (int i = 0; i < display.length; i++) {
            assertEquals(expected[i], display[i], "display " + i + " should have the correct value");
        }
    }


    @Test
    public void testDisplayBins3() {
        int[] upper = {25, 50, 75, 100};
        int[] bin = {1, 2, 2, 2};
        String[] display = App.displayBins(upper, bin);
        String[] expected = {"[0 - 25]: 1", "[26 - 50]: 2", "[51 - 75]: 2", "[76 - 100]: 2"};
        assertEquals(expected.length, display.length, "display should have the correct length");
        for (int i = 0; i < display.length; i++) {
            assertEquals(expected[i], display[i], "display " + i + " should have the correct value");
        }
    }


}
