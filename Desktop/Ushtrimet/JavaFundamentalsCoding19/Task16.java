package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int count=1, max=1;
        int arr[]= new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i < arr.length; i++) {
            System.out.println("Vendos numrin e "+(i+1));
            arr[i]=sc.nextInt();
        }

        for (int i=0; i < arr.length-1; i++) {
            if (arr[i]<arr[i+1]) {
                count++;
                if (count>max) {
                    max=count;
                }

            } else {
                count=1;
            }
        }
        System.out.println("Gjatesia me e madhe e subseq rrites: "+max);
    }
}
