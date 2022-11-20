package JavaFundamentalsCoding19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni tekstin");
        String text = sc.nextLine();
        //achooooooooooo! achooo! acho! achoooo!

        Pattern p = Pattern.compile("^acho+!");
        Matcher match = p.matcher(text);
        if(match.matches()) {
            System.out.println("Perdoruesi teshtiti");
        } else {
            System.out.println("Perdoruesi nuk teshtiti");
        }
    }
}
