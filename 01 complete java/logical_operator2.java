import java.util.*;
public class logical_operator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username;
        System.out.print("enter your username : ");
        username = sc.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("the username should be between 4 - 12 characters");
        }
        else if(username.contains("_") || username.contains("username") || username.contains(" ")){
        }
        else{
            System.out.println("welcome " + username);
        }

        sc.close();
    }
}
