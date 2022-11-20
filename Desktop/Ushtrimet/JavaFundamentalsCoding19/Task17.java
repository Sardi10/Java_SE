package JavaFundamentalsCoding19;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje date ne formatin yyyy-mm-dd");
        String data = sc.nextLine();
        LocalDate ld = LocalDate.parse(data);
        LocalDate sot = LocalDate.now();
        long ditet = ChronoUnit.DAYS.between(sot, ld);
        System.out.println(ditet);
    }
}
