package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a=1; //kufiza e pare e Fib
        int b=1; //kufiza e dyte e Fib
        int kufizaFib=0;   //kufiza pasardhese
        for (int i=2;i<n;i++) {
            kufizaFib=a+b;
            // spostojme nje me djathtas kufizat
            a=b;
            b=kufizaFib;

        }
        if (n==1 || n==2) {
            System.out.println(1);
        } else {
            System.out.println(kufizaFib);
        }
    }
}
