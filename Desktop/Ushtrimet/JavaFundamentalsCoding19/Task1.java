package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni vleren e diametrit:");
        float d = sc.nextFloat();
        float PI = 3.14f;

        float perimetri = PI*d;
        double perimetri2 = Math.PI*d;

        System.out.println("Perimetri= " + perimetri);
        System.out.println("Perimetri 2= " + perimetri2);

    }
}
