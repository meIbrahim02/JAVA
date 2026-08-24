import java.util.Scanner;

public class bankingProject {
    // JAVA PROGRAM FOR BANKING
    static Scanner sc = new Scanner(System.in);

    //showBalance
    static void showBalance(double balance){
        System.out.printf("$%f\n", balance);

    }

    // deposite amount
    static double Deposite(){
        double amount;
        System.out.print("Enter the amount to be deposited : ");
        amount = sc.nextDouble();

        if(amount < 0){
            System.out.println("amount cant be negative.");
            return 0;
        }
        else{
            return amount;
        }
    }

    // Withdraw amount
    static double Withdraw(double balance){
        double amount;

        System.out.print("Enter the amount you want to wtihdraw : ");
        amount = sc.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0){
            System.out.println("amount cant be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
    public static void main(String[] args) {

        // Declare Variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        if(isRunning){
            // Display Menu
            System.out.println("Banking Program");
            System.out.println();
            System.out.println("1. Show Balance");
            System.out.println("2. Deposite");
            System.out.println("3. Withdraw");
            System.out.println("4. EXIT");
            System.out.println();
    
            // Get and Process User Choice
            System.out.print("Enter your choice (1 - 4): ");
            choice = sc.nextInt(); 
    
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += Deposite();
                case 3 -> balance = balance - Withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("invalid choice");
            }
        }
        // exit message
        System.out.println("thank you have a nice day");
        sc.close();

    }
}