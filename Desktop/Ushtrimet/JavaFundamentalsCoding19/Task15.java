package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for (int i=0; i<a.length;i++){

            a[i] = sc.nextInt();
        }

        for (int i=0; i<10;i++) {
            for (int j=i+1; j<10;j++) {
                if (a[i]==a[j]) {
                    System.out.println(a[i]);
                }
            }
        }

    }
}
