import java.util.*;

public class numberguessinggame {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random= new Random();

        int guess =0;
        int attempts = 0;
        int randomNumber= random.nextInt(1,11);

        System.out.println("Welcome to Random Number Guessing Game");
        System.out.println(" Guess from (1-10)");


        do{
            System.out.print("Enter your Guess: ");
            guess=scanner.nextInt();
            attempts++;

            if(guess<randomNumber){
                System.out.println("Too low Try again. ");

            }
            else if (guess>randomNumber){
                System.out.println("Guess too high try again. ");
            }
            else{
                System.out.println("Congratulations You Have guessed the correct number it took you "+guess+" tries");

            }
        } while(guess!=randomNumber);



        scanner.close();
    }
}


