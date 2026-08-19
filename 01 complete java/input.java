import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = scanner.nextLine(); 
        System.out.println("hello " + name);

        System.out.print("enter another name: ");
        String name1 = scanner.next();
        System.out.println("hi " + name1);
        
        //integer
        System.out.print("enter your age: ");
        int age = scanner.nextInt();
        System.out.println("your age is: " + age);

        //Double
        System.out.print("what is your gpa: ");
        double gpa = scanner.nextDouble();
        System.out.println("Your gpa is: " + gpa);

        System.out.print("are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("student: " + isStudent);

        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("you are NOT enrolled");
        }

        scanner.close();
    }
}
