package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task7Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje numer");
        int pozicioni = sc.nextInt();
        int nrAktual = 1;
        int nrParardhese = 0;
        int nrFib = 0;
        int pozAktual = 1;
        while (pozAktual < pozicioni) {
            nrFib = nrParardhese + nrAktual;
            nrParardhese = nrAktual;
            nrAktual = nrFib;
            pozAktual++;
        }

        System.out.println(nrFib);
    }
}
