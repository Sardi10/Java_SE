package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni numrat a,b dhe c te ekuacionit");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d = (Math.pow(b,2)- 4*a*c);
        System.out.println("Dallori = " + d);
        if (d<0){
            System.out.println("Dallori eshte negativ");
        } else if(d==0){
            double x = (double)-b/(2*a);
            System.out.println("Ekuacioni ka vetem nje rrenje x = " +x);
        } else {
            double x1 = ((-b)- Math.sqrt(d))/(2*a);
            System.out.println("Rrenja e pare e ekuacionit x1 = "+ x1);
            double x2= ((-b)+ Math.sqrt(d))/(2*a);
            System.out.println("Rrenja e pare e ekuacionit x2 = "+ x2);

        }

    }
}
