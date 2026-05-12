import java.util.*;

public class Arrayexample {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String [] foods;
        int size;

        System.out.print("How many # of foods do you want to enter? ");
        size=scanner.nextInt();
        scanner.nextLine();
        foods= new String [size];

        for (int i=0; i < foods.length; i++ ){
            System.out.print("Enter Foods: ");
            foods[i]=scanner.nextLine();
        }

        for ( String food:foods){
            System.out.println(food);
        }

    }
}





