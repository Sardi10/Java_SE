package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n;i++){
            if(i % 3==0 && i % 7 ==0){
                System.out.println("FizzBuzz");
            } else if (i % 3==0){
                System.out.println("Fizz");
            } else if (i % 7==0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
