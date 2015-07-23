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
    }

    @Test
    public void verticalLineThree() {
        String temp = new Triangle().verticalLine(3);
        assertEquals("*" + System.lineSeparator() + "*" + System.lineSeparator() + "*", temp);
    }

    @Test
    public void verticalLineSix() {
        String temp = new Triangle().verticalLine(6);
        assertEquals("*" + System.lineSeparator() + "*" + System.lineSeparator() + "*" + System.lineSeparator() + "*" + System.lineSeparator() + "*" + System.lineSeparator() + "*", temp);
    }


    @Test
    public void rightTriangleZero(){
        assertEquals("", new Triangle().rightTriangle(0));
    }

    @Test
    public void rightTriangleOne(){
        assertEquals("*", new Triangle().rightTriangle(1));
    }

    @Test
    public void rightTriangleTwo(){
        assertEquals("*" + System.lineSeparator() + "*" + "*", new Triangle().rightTriangle(2));
    }

    @Test
    public void rightTriangleFour(){
        assertEquals("*" + System.lineSeparator() + "**" + System.lineSeparator() + "***" + System.lineSeparator() + "****", new Triangle().rightTriangle(4));
    }

    @Test
    public void isoscelesTriangleZero(){
        assertEquals("", new Triangle().isoscelesTriangle(0));
    }

    @Test
    public void isoscelesTriangleOne(){
        assertEquals("*", new Triangle().isoscelesTriangle(1));
    }

    @Test
    public void isoscelesTriangleTwo(){
        assertEquals(" " + "*" + System.lineSeparator() + "***", new Triangle().isoscelesTriangle(2));
    }

    @Test
    public void isoscelesTriangleThree(){
        assertEquals("  " + "*" + System.lineSeparator() + " ***" + System.lineSeparator() + "*****", new Triangle().isoscelesTriangle(3));
    }

    @Test
    public void isoscelesTriangleFour() {
        assertEquals("   " + "*" + System.lineSeparator() + "  ***" + System.lineSeparator() + " *****" + System.lineSeparator() + "*******", new Triangle().isoscelesTriangle(4));
    }

    @Test
      public void diamondOfStarsZero(){
        assertEquals("",  new Triangle().diamondOfStars(0));
    }

    @Test
    public void diamondOfStarsOne(){
        assertEquals("*", new Triangle().diamondOfStars(1));
    }

    @Test
    public void diamondOfStarsTwo(){
        assertEquals(" *" + System.lineSeparator() + "***" + System.lineSeparator() + " *", new Triangle().diamondOfStars(2));
    }

    @Test
    public void diamondOfStarsThree(){
        assertEquals("  *" + System.lineSeparator() + " ***" + System.lineSeparator() + "*****" + System.lineSeparator() + " ***" + System.lineSeparator() + "  *", new Triangle().diamondOfStars(3));
    }

    @Test
    public void diamondWithNameZero(){
        assertEquals("",  new Triangle().diamondWithName(0));
    }

    @Test
    public void diamondWithNameOne(){
        assertEquals("Robert", new Triangle().diamondWithName(1));
    }

    @Test
    public void diamondWithNameTwo(){
        assertEquals(" *" + System.lineSeparator() + "Robert" + System.lineSeparator() + " *", new Triangle().diamondWithName(2));
    }

    @Test
    public void diamondWithNameThree(){
        assertEquals("  *" + System.lineSeparator() + " ***" + System.lineSeparator() + "Robert" + System.lineSeparator() + " ***" + System.lineSeparator() + "  *", new Triangle().diamondWithName(3));
    }

}