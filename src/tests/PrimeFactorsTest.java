package tests;

/**
 * Created by Robert on 26/07/15.
 */


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import exercises.PrimeFactors;

import java.util.ArrayList;

public class PrimeFactorsTest {
    PrimeFactors primeFactors;

    @Before
    public void buildUp(){
        primeFactors = new PrimeFactors();
    }


    @Test
    public void testListFor4(){
        ArrayList<Integer> factorsList = primeFactors.generatePrimeFactorsList(4);
        assertEquals(1, factorsList.size());
        assertEquals(2, factorsList.get(0).intValue());
    }

    @Test
    public void testListFor1(){
        ArrayList<Integer> factorsList = primeFactors.generatePrimeFactorsList(1);
        assertEquals(0, factorsList.size());
    }

    @Test
    public void testListFor8(){
        ArrayList<Integer> factorsList = primeFactors.generatePrimeFactorsList(8);
        assertEquals(1, factorsList.size());
        assertEquals(2, factorsList.get(0).intValue());
    }

    @Test
         public void testListFor30(){
        ArrayList<Integer> factorsList = primeFactors.generatePrimeFactorsList(30);
        assertEquals(3, factorsList.size());
        assertEquals(2, factorsList.get(0).intValue());
        assertEquals(3, factorsList.get(1).intValue());
        assertEquals(5, factorsList.get(2).intValue());
    }

    @Test
    public void testListFor9(){
        ArrayList<Integer> factorsList = primeFactors.generatePrimeFactorsList(9);
        assertEquals(1, factorsList.size());
        assertEquals(3, factorsList.get(0).intValue());
    }

}
