package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni numrin:");
        int n = sc.nextInt(); //123 -> 12 -> 1 -> 0
        int shuma = 0;

        while(n>0) {
            shuma += n%10; //123 % 10 = 3; 12%10=2; 1%10 = 1;
            n = n/10; //123 / 10 = 12; 12/10=1; 1/10 = 0
        }

        System.out.println("Shuma e shifrave te numrit "+n+" eshte: "+shuma);
    }
}
