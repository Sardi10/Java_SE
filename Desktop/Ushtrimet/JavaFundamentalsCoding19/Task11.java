package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Enter the words");
        Scanner input  = new Scanner(System.in);
        String str  = ".";
        String temp ="";
        int max = str.length();
        while (!str.equalsIgnoreCase("Enough!"))
        {
            if(str.equals(""))
            {
                System.out.println("No text provided");
                break;
            }
            else if(max<str.length())
            {
                max = str.length();
                temp = str;
            }
            else
                str = input.nextLine();
        }
        System.out.println("Fjala me e gjate eshte " + temp + "me gjatesi " + max);
    }
}
