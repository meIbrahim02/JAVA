import java.util.*;

public class whileLoopGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String response = "";

        while(!response.equals("Q")){
            System.out.println("you are playing the game");
            System.out.println("pres Q to quit");
            response = sc.next().toUpperCase();
        }

        System.out.println("you quit the game");

        sc.close();
    }
}
