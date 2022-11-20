package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2; i < n; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int i) {
        for(int j = 2; j < i; j++) {
            if(i % j == 0)
                return false;
        }
        return true;
    }
}
