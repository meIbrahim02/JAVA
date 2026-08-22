import java.util.Scanner;
import java.util.Random;

public class numberGuessingGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 50;
        int randomNumbers = random.nextInt(min, max + 1);

        System.out.println("number guessing game");
        System.out.printf("Guess a number between %d - %d\n", min, max);

        do{
            System.out.print("enter a guess");
            guess = sc.nextInt();
            attempts++;

            if(guess < randomNumbers){
                System.out.println("TOO LOW!");
            }
            else if(guess > randomNumbers){
                System.out.println("TOO HIGH");
            }
            else{
                System.out.println("CORRECT! the number was : " + randomNumbers);
                System.out.println("# number of attempts : " + attempts);
            }
        }while(guess != randomNumbers);

        System.out.println("you have won");
        sc.close();
    }
}
