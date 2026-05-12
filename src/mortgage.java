
import java.text.NumberFormat;
import java.util.*;

public class mortgage {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        final byte months_in_year=12;
        final byte percent=100;
        int principal =0;
        float monthlyInterest;
        byte year;
        int numberOfPayments;
        float annualInterest;

        while(true){
            System.out.print("Principal: ");
            principal=scanner.nextInt();
            if (principal >=1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }
        while (true){
            System.out.print("Annual Interest Rate: ");
            annualInterest=scanner.nextFloat();
            if  (annualInterest>=1 && annualInterest <=30){
                monthlyInterest=annualInterest/percent/months_in_year;
                break;
            }
            System.out.println("Enter a Value between 1 and 30");
        }
        while(true){
            System.out.print("Period (Years): ");
            year=scanner.nextByte();
            if (year>=1 && year <=30){
                numberOfPayments=year*months_in_year;
                break;
            }
            System.out.println("Enter  a value between 1 and 30.");

        }
        double mortage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String mortageFormatted=currency.format(mortage);
        System.out.println("Mortgage: "+mortageFormatted);










        scanner.close();
    }



}

