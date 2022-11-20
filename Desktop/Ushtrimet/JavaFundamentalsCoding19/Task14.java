package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni 2 shkronja");
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        int m=a;
        int n=b;
        System.out.println(m);
        System.out.println(n);
        System.out.println(Math.abs(m-n)-1);
    }
}
