package exercises;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Robert on 18/07/15.
 */
public class TriangleTest {

    @Test
    public void easiestExerciseEverTest() {
        Triangle triangle = new Triangle();
        assertEquals("*", triangle.easiestExerciseEver());
    }

    @Test
    public void horizontalLineZero() {
        assertEquals("", new Triangle().horizontalLine(0));
    }

    @Test
    public void horizontalLineOne() {
        assertEquals("*", new Triangle().horizontalLine(1));
    }

    @Test
    public void horizontalLineThree() {
        assertEquals("***", new Triangle().horizontalLine(3));
    }

    @Test
    public void verticalLineZero() {
        assertEquals("", new Triangle().verticalLine(0));
    }

    @Test
    public void verticalLineOne() {
        assertEquals("*", new Triangle().verticalLine(1));
    }

    @Test
    public void verticalLineTwo() {
        String temp = new Triangle().verticalLine(2);
        assertEquals("*" + System.lineSeparator() + "*", temp);
        System.out.println(temp);
    }

    @Test
    public void verticalLineThree() {
        String temp = new Triangle().verticalLine(3);
        assertEquals("*" + System.lineSeparator() + "*" + System.lineSeparator() + "*", temp);
        System.out.println(temp);
    }

    @Test
    public void verticalLineSix() {
        String temp = new Triangle().verticalLine(6);
        assertEquals("*" + System.lineSeparator() + "*" + System.lineSeparator() + "*" + System.lineSeparator() + "*" + System.lineSeparator() + "*" + System.lineSeparator() + "*", temp);
        System.out.println(temp);
    }



}