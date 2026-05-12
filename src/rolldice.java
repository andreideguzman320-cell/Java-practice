import java.util.*;

public class rolldice {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("Enter the # of dice you want to roll: ");
        numOfDice= scanner.nextInt();

        if (numOfDice >0) {
            for(int i=0; i< numOfDice; i++){
                int roll= random.nextInt(1,7);
                System.out.println("You rolled: "+roll);
                total += roll;
            }
            System.out.println("total: "+ total);

        }else
            System.out.println("You must roll a amount of greater than 0 dice!");

    }
}





