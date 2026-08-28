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
        do{
            System.out.print("enter your move (rock, paper, scissors) : ");
        playerChoice = sc.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") && 
                !playerChoice.equals("paper") && 
                    !playerChoice.equals("scissors")){
            System.out.println("Invalid ");
            continue;
        }

        // get random choice for the computer
        computerChoice = userChoice[random.nextInt(3)];
        System.out.println("computer choice: " + computerChoice);

        // check win conditons
        if(playerChoice.equals(computerChoice)){
            System.out.println("its a tie!");
        }else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) || 
                    (playerChoice.equals("paper") && computerChoice.equals("rock") || 
                        (playerChoice.equals("scissors") && computerChoice.equals("paper")))){
            System.out.println("you win");    
        }else{
            System.out.println("you lose!");
        }
        // ask to play again
        System.out.println("play again (yes/no): ");
        playAgain = sc.nextLine().toLowerCase();


        } while(playAgain.equals("yes"));
        // goodbye message
        System.out.println("thanks for playing");
    sc.close();
        
    }
}
