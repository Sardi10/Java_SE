package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje numer te plote");
        int n = sc.nextInt();

        //Llogaritja e shumes
        double shumaHn = 0.0;
        for(int i =1; i<= n; i++){
            shumaHn += (double) 1/i;
        }
        System.out.println("Shuma = " + shumaHn);
    }
}
