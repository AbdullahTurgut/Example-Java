import java.text.NumberFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float montlyInterest = 0;
        int numberOfPayments = 0;
        //klavyeden girdi için
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if(principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

        while (true){
            System.out.println("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if(annualInterest>=1 && annualInterest <= 30){
                montlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true){
            System.out.println("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30){
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal
                * (montlyInterest * Math.pow(1 + montlyInterest , numberOfPayments))
                / (Math.pow(1 + montlyInterest, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
