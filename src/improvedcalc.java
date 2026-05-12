import java.util.*;

public class improvedcalc {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double num1=0;
        double num2=0;
        String operator;
        double result=0;
        boolean isValid=true;

        System.out.print("Enter The first Number: ");
        num1=scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Choose Operator +,-,*,/,^: ");
        operator=scanner.nextLine();

        switch(operator){
            case "+","-","*","/","^" ->{
                System.out.print("Enter the Second Number: ");
                num2=scanner.nextDouble();

                switch(operator){
                    case"+"->result=num1 + num2;
                    case"-"->result=num1 - num2;
                    case"*"->result=num1 * num2;
                    case"/"->{
                        if(num2 == 0){
                            System.out.println("You cannot divide by 0!");
                        }
                        else {
                            result=num1 / num2;
                        }
                    }
                    case"^"->result=Math.pow(num1, num2);

                }
            }

            default-> {
                System.out.println("Invalid Operator!");
                isValid=false;
            }

        }
        if(isValid)
            System.out.printf("The Result is %.2f",result);


        scanner.close();
    }
}


