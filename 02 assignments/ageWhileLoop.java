import java.util.Scanner;

public class ageWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double age;

        System.out.println("enter your age");
        age = sc.nextDouble();
        // System.out.println("your age " + age);

        while(age < 0){
            System.out.println("your age cant be negative");
            System.out.println("enter your age");
            age = sc.nextDouble();
        }

        System.out.println("your age " + age);

        sc.close();
	}
}
