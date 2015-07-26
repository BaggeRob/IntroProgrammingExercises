package exercises;

/**
 * Created by Robert on 26/07/15.
 */
public class Fizzbuzz {
    private final static String FIZZ = "Fizz";
    private final static String BUZZ = "Buzz";

    public boolean fizzTest(int n) {
        if(n % 3 == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean buzzTest(int n) {
        if(n % 5 == 0){
            return true;
        }else{
            return false;
        }
    }

    public String fizzBuzzTest(int n){
        boolean buzz = buzzTest(n);
        boolean fizz = fizzTest(n);

        if(fizz){
            if(buzz){
                return Fizzbuzz.FIZZ + Fizzbuzz.BUZZ;
            }else{
                return Fizzbuzz.FIZZ;
            }
        }else if(buzz){
            return Fizzbuzz.BUZZ;
        }else{
            return Integer.toString(n);
        }
    }


    public static void main(String[] args){
        Fizzbuzz fb = new Fizzbuzz();

        for(int i = 1; i <= 100; i++){
            System.out.println(fb.fizzBuzzTest(i));
        }
    }
}
