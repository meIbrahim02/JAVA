import java.util.*;

public class enhancedSwitches {
    public static void main(String[] args) {
        // enhanced switches = a replacement to many if else statements
        // introduced in java 14

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day of the week");
        String day = sc.nextLine();

        switch(day){
            case "monday", "tuesday", "wednesday", "thrusday" -> System.out.println("it is a weekday😒");
            case "saturday", "sunday" -> System.out.println("it is weekend");
            default -> System.out.println(day + " is not a day");
        }

        sc.close();
    }
}
