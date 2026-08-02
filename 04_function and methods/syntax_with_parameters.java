import java.util.Scanner;
public class syntax_with_parameters {
    
    public static int calculatesum(int num1, int num2){ // prameters and formal parameters
        int sum = num1 + num2;
        return sum;
    }
       
    public static void main(String[] args) {
        // returnType name (type param1, type para2){
        //     body
        //     return statement
        // }
         Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: \n");
        int num1 = sc.nextInt();
        System.out.println("enter second number: \n");
        int num2 = sc.nextInt();
        int sum = calculatesum(num1, num2); // arguments or actual paramteresSystem.out.println("sum of the numbers are: " + sum);
        System.out.println("sum of the numbers are: " + sum);

        sc.close();
    }
}
