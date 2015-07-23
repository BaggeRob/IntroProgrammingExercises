package exercises;

import java.util.ArrayList;

/**
 * Created by Robert on 18/07/15.
 */
public class Triangle {
    private final static String name = "Robert";
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

    public String isoscelesTriangleRefac(int n) {
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

    public String isoscelesTriangle(int n){
        ArrayList<String> isosceles = createArrayListWithDiamondStrings(n);

        String isoscelesStr = "";
        for(int i = 0; i < isosceles.size(); i++){
            String str = isosceles.get(i);
            if(i < isosceles.size()-1){
                str += System.lineSeparator();
            }
            isoscelesStr += str;
        }
        return isoscelesStr;
    }


    public String diamondOfStars(int n){
        return diamond(n, false);
    }

    public String diamondWithName(int n){
        return diamond(n, true);

    }

    private String diamond(int n, boolean withName){
        ArrayList<String> diamond = createArrayListWithDiamondStrings(n);

        String middle = "";
        String top = "";
        String bottom = "";

        String[] topBottom = createDiamondTopAndBottom(diamond);
        top = topBottom[0];
        bottom = topBottom[1];

        if(diamond.size() > 0){
            if(withName){
                middle = Triangle.name;
            }else{
                middle = diamond.get(diamond.size() - 1);
            }
            if(diamond.size() > 1){
                middle += System.lineSeparator();
            }
        }

        return top + middle + bottom;
    }

    private String[] createDiamondTopAndBottom(ArrayList<String> diamond){
        String top = "";
        String bottom = "";

        for (int i = 0; i < diamond.size() - 1; i++){
            String newStarsTop = diamond.get(i) + System.lineSeparator();
            String newStarsBottom = diamond.get(i);

            if(i != 0){
                newStarsBottom += System.lineSeparator();
            }

            top = top + newStarsTop;
            bottom = newStarsBottom + bottom;
        }

        return new String[]{top, bottom};


    }

    private ArrayList<String> createArrayListWithDiamondStrings(int n){
        ArrayList<String> isosceles = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            String line = "";


            for (int j = 0; j < (2 * i - 1); j++) {
                line += "*";
            }
            line = addPadding(n-i, line);

/*            if (i != n) {
                line += System.lineSeparator();
            }*/
            isosceles.add(line);
        }
        return isosceles;
    }

    private String addPadding(int paddingNbr, String stringToPad){
        String padding = "";
        for (int k = 0; k < paddingNbr; k++) {
            padding += " ";
        }
        return padding + stringToPad;

    }
}
