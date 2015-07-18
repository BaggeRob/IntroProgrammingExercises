package exercises;

/**
 * Created by Robert on 18/07/15.
 */
public class Triangle {
    public String easiestExerciseEver() {

        return "*";
    }

    public String horizontalLine(int n){
        String line = "";
        for(int i= 0; i < n; i++){
            line = line + "*";
        }
        return line;
    }

    public String verticalLine(int n) {
        String line = "";
        while (n > 0) {
            line = line + "*";
            n--;
            if(n > 0){
                line = line + System.lineSeparator();
            }
        }
        return line;
    }
}
