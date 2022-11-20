package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = '*';
        char b = ' ';
        int count1 = 0;
        int count2=0;
        int nr= sc.nextInt();

        for(int i=2;i<=nr;i++) {
            count1 = count1 + 2;
        }

        for (int i=0;i<nr;i++) {
            for (int j=0;j<nr;j++) {
                for (int l=0; l<count2;l++) {
                    System.out.print(b);
                }
                System.out.print(a);
                for (int k=0;k<count1;k++) {
                    System.out.print(b);
                }
                System.out.print(a);
                for (int n=0;n<count2;n++) {
                    System.out.print(b);
                }

            }
            count1 = count1 - 2;
            count2 = count2 + 1;
            System.out.println();
        }
    }
}
