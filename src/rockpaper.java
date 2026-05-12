import java.util.*;

public class rockpaper {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        String [] options={"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String continuePlay="yes";
        int playerScore = 0;
        int computerScore = 0;

        do{


            computerChoice = options[random.nextInt(3)];


            do {
                System.out.println("Enter your move (rock,paper,scissors)");
                playerChoice = scanner.nextLine().toLowerCase();

                if (!playerChoice.equals("rock") &&
                        !playerChoice.equals("paper") &&
                        !playerChoice.equals("scissors")) {
                    System.out.println("Invalid Input");

                }
            }while(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors"));

            System.out.println("Computer chose: "+computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a Tie!");
            } else if
            (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                            playerChoice.equals("scissors") && computerChoice.equals("paper") ||
                            playerChoice.equals("paper") && computerChoice.equals("rock")) {

                System.out.println("You won!");
                playerScore++;
            }
            else {
                System.out.println("You lose!");
                computerScore++;
            }
            System.out.println("Player score: "+playerScore);
            System.out.println("Computer score: "+computerScore);
            System.out.println("Do you want to play again? (yes/no)");
            continuePlay=scanner.nextLine().toLowerCase();
        }while(continuePlay.equals("yes"));










        scanner.close();
    }
}