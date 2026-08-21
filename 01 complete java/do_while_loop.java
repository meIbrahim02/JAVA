import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("enter your number");
        number = sc.nextInt();
        

        while (number < 0 || number > 10){
            System.out.println("number should be between 1 - 10");
            System.out.println("enter your number");
            number = sc.nextInt();
        }

        System.out.println("your number is : " + number);

        sc.close();
    }
}
