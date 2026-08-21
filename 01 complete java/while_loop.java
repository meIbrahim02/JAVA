import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        // while loop -> repeates the code forever while some condition is true
        Scanner sc = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.print("enter your name : ");
            name = sc.nextLine();
        }

        System.out.println("hello " + name);

        sc.close();
    }
}
