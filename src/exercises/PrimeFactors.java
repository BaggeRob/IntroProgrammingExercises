package exercises;

import java.util.ArrayList;

/**
 * Created by Robert on 26/07/15.
 */
public class PrimeFactors {


    public ArrayList<Integer> generatePrimeFactorsList(int n) {
        ArrayList<Integer> listOfFactors = new ArrayList<Integer>();

        int halfOfN = n/2;

        for(int i = 2; i <= n/2; i++){
            if(primeCheck(i, n, listOfFactors)){
                listOfFactors.add(i);
            }
        }
        return listOfFactors;
    }

    private boolean primeCheck(int numberToCheck, int numberToFactorize, ArrayList<Integer> listOfPreviousFactors){
        if(numberToFactorize % numberToCheck == 0 && !listOfPreviousFactors.contains(numberToCheck)){
            if(checkFactorsOfNumber(numberToCheck, listOfPreviousFactors)){
                return true;
            }
        }
        return false;
    }

    private boolean checkFactorsOfNumber(int numberToCheck, ArrayList<Integer> listOfPreviousFactors){
        for(int i = 0; i < listOfPreviousFactors.size(); i++){
            if(numberToCheck % listOfPreviousFactors.get(i) == 0){
                return false;
            }
        }
        return true;
    }
}
