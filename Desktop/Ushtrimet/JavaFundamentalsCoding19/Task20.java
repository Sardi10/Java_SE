package JavaFundamentalsCoding19;

import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje numer");
        int n = sc.nextInt();
        Random r = new Random();
        int randomNumber = r.nextInt(101); //1-100
        System.out.println("Numri random eshte " + randomNumber);
        while(n != randomNumber) {
            if(n > randomNumber) {
                System.out.println("Too much!");
            } else {
                System.out.println("Not enough!");
            }
            System.out.println("Vendoseni numrin perseri: ");
            n = sc.nextInt();
        }
        System.out.println("Congrats!!!");
    }
}
