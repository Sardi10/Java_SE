package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje fjali");
        String fjalia = sc.nextLine(); //Sot eshte e shtune
        String[] fjalet = fjalia.split(" "); //["Sot", "eshte", "e", "shtune"]
        String fjaletPerseritje = "";
        for(String s : fjalet) {
            fjaletPerseritje += (s + " ").repeat(2);
        }

        System.out.println(fjaletPerseritje);
    }
}
