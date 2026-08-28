import java.util.Scanner;

public class array2dQuiz {
    public static void main(String[] args) {
        // 2d array quiz game

        // questions array[]
        String[] questions = {"what is the main function of a router?",
                            "which part of the computer is considered the brain?",
                            "what year was facebook launched?",
                            "who is known as the father of computers?",
                            "what was the first programming language?"};

        // options array[][]
        String options[][] = {  {"1. Stroing files", "2. Encrypting data", "3. Directing traffic", "4. managing passwords"}, 
                                {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"}, 
                                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"}, 
                                {"1. Steve jobs", "2. bill gates", "3. alan turing", "4. Chal=rles Babbage"}, 
                                {"1. COBOL", "2. C", "3. Firtran", "4. Assembly"}};
                                
        // declare variables
        int[] answers = {3, 1, 2, 4, 3}; // correct answers 
        int score = 0; // score variable
        int guess; // user guess variable

        Scanner scanner = new Scanner(System.in);

        // welcome message
        System.out.println("Welcome to the 2D Array Quiz Game!");
        System.out.println();

        // question (loop)
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]); // display question
            for(String option : options[i]){
                System.out.println(option); // display options
            }
            System.out.print("Enter your guess (1-4): ");
            guess = scanner.nextInt(); // get user input 

            
        }


        // get guess from user
        // check our guess if correct, increment score
        // display final score

        scanner.close();
        
    }
}
