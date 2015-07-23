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

    public String rightTriangle(int n) {
        if(n == 0){
            return "";
        }else if(n == 1){
            return "*";
        }else{
            String temp = "";
            for(int i = 0; i < n; i++){
                temp += "*";
            }
            return rightTriangle(n-1) + System.lineSeparator() + temp;
        }
    }

    public String isoscelesTriangle(int n) {
        String isosceles = "";
        for (int i = 1; i <= n; i++) {
            String line = "";
            String padding = "";

            for (int j = 0; j < (2 * i - 1); j++) {
                line += "*";
            }

            int paddingNbr = n - i;
            for (int k = 0; k < paddingNbr; k++) {
                padding += " ";
            }

            isosceles += padding + line;
            if (i != n) {
                isosceles += System.lineSeparator();
            }
        }
        return isosceles;
    }
}
