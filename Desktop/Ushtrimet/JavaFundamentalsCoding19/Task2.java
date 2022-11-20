package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni peshen ne kg: ");
        float pesha = sc.nextFloat();

        System.out.println("Vendosni gjatesine ne cm: ");
        int gjatesiaCM = sc.nextInt();

        float gjatesiaM = (float) gjatesiaCM/100;
        double BMI = pesha / Math.pow(gjatesiaM, 2);
        System.out.println("BMI juaj eshte " + BMI);

        //if(BMI >= 18.5 && BMI <= 24.9)
        if(BMI < 18.5 || BMI > 24.9){
            System.out.println("BMI juaj nuk eshte optimale");
        } else {
            System.out.println("BMI juaj eshte optimale");
        }
    }
}
