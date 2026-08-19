import java.util.*;
public class if_statement {
    public static void main(String[] args) {
        // if statement = perform a block of code if its condition is true

        Scanner scan = new Scanner(System.in);


        String name;
        int age;
        boolean isStudent;

        System.out.println("enter your name: ");
        name = scan.nextLine();


        System.out.println("enter your age: ");
        age = scan.nextInt();

        System.out.println("are you a student? (true/false): ");
        isStudent = scan.nextBoolean();


        // GROUP 1
        if(name.isEmpty()){
            System.out.println("please enter your name");
        }
        else{
            System.out.println("HELLO " + name);
        }

        // GROUP 2
        if(age >= 18){
            System.out.println("you are adult.");
        }
        else if(age < 0){
            System.out.println("you are not born yet.");
        }
        else if(age >= 65){
            System.out.println("you are a senior");
        }
        else if(age == 0){
            System.out.println("you are a baby");
        }
        else{
            System.out.println("you are a child");
        }

        //group3
        if(isStudent){
            System.out.println("you are a student!");
        }
        else{
            System.out.println("you are NOT a student");
        }
    }
}
