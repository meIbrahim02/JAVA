import java.util.Scanner;
import java.util.Random;
public class rockPaperScissors {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // declare variables
        String[] userChoice = {"rock", "paper", "scissors"}; 
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        // get a choice from the user
        System.out.print("enter your move (rock, paper, scissors) : ");
        playerChoice = sc.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") && 
                !playerChoice.equals("paper") && 
                    !playerChoice.equals("scissors")){
            System.out.println("Invalid ");
        }

        // get random choice for the computer
        computerChoice = userChoice[random.nextInt(3)];
        System.out.println("computer choice: " + computerChoice);
        
        // check win conditons
        // ask to play again
        // goodbye message
        sc.close();
    }
}
