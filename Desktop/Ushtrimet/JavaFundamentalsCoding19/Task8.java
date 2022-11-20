package JavaFundamentalsCoding19;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Vendosni vleren e pare: ");
        float a=sc.nextFloat();
        System.out.println("Vendosni shenjen e veprimit: ");
        char v=sc.next().charAt(0);
        System.out.println("Vendosni vleren e dyte: ");
        float b=sc.nextFloat();

        switch(v) {
            case '+':
                System.out.println("Rezultati = "+(a+b));
                break;
            case '-':
                System.out.println("Rezultati = "+(a-b));
                break;
            case '*':
                System.out.println("Rezultati = "+(a*b));
                break;
            case '/':
                    if(b==0){
                        System.out.println("Nuk mund te kryhet pjestimi me 0");
                    } else {
                        System.out.println("Rezultati = " + (a / b));
                    }
                    break;
            default:
                System.out.println("Kjo llogaritje nuk mund te kryhet!");
        }


    }
}
