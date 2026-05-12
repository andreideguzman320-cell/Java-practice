import java.util.*;

public class aarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {"Who am i? ", "Whats my age?", "Where am I from?", "Whats my gender", "Yurrr?"};
        String[][] options = {{"1. you", "2. are", "3. me", "4. bitch"},
                {"1. 1", "2. 2", "3. 23", "4. 4"},
                {"1. here", "2. there", "3. SUH", "4. sIB"},
                {"1. male", "2. attack helicopter", "3.gigachad", "4.chad"},
                {"1. YURRRRR", "2. SUH DUD", "3. GET THAT NIGGER BITCH OFF THE PLANE", "4. YUHHH"}};


        int[] answers = {3, 3, 4, 2, 1};
        int score = 0;
        int choice;


        System.out.println("Quiz Time Motherfucker!");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.println("Enter your Answer: ");
            choice = scanner.nextInt();

            if (choice ==  answers[i]){
                System.out.println("Correct!");
                score++;
            }else
                System.out.println("Wrong!");


        }
        System.out.println("You got "+ score+ " out of " + questions.length);


        scanner.close();


    }

}
