package tests;

/**
 * Created by Robert on 26/07/15.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import exercises.Fizzbuzz;

public class FizzbuzzTest {

    @Test
    public void testFizzPassThree(){
        assertTrue(new Fizzbuzz().fizzTest(3));
    }

    @Test
    public void testFizzPassSix(){
        assertTrue(new Fizzbuzz().fizzTest(6));
    }

    @Test
    public void testFizzPass33(){
        assertTrue(new Fizzbuzz().fizzTest(33));
    }


    @Test
    public void testFizzFalseTwo(){
        assertFalse(new Fizzbuzz().fizzTest(2));
    }

    @Test
    public void testBuzzPass(){
        Fizzbuzz fb = new Fizzbuzz();
        assertTrue(fb.buzzTest(5));
        assertTrue(fb.buzzTest(10));
        assertTrue(fb.buzzTest(60));
    }


    @Test
    public void testBuzzNotPass(){
        Fizzbuzz fb = new Fizzbuzz();
        assertFalse(fb.buzzTest(2));
    }
}
