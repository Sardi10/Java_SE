package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje fjali");
        String strg = sc.nextLine();
        float countSpace = 0.0f;
        for (int i = 0; i < strg.length(); i++){
            if(Character.isSpaceChar(strg.charAt(i)))
                countSpace++;
        }
        float perqindja = (countSpace/strg.length())*100;
        System.out.println("Numri i spaces " + countSpace);
        System.out.println("Gjatesia e fjalise: " + strg.length());
        System.out.println("% e hapesirave eshte: " + perqindja);

        double perqindjeSpaces = perqindjeSpaces(strg);
        System.out.println(perqindjeSpaces);
    }

    private static double perqindjeSpaces(String strg) {
        int spaces = 0;
        char[] karakteret = strg.toCharArray();
        for(char c : karakteret) {
            if(Character.isSpaceChar(c))
                spaces++;
        }

        double perqindja = (double) spaces/karakteret.length*100;
        return perqindja;
    }
}
