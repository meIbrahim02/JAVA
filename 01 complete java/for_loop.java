import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        // for loop -> executes code for a certain amount of time
        System.out.println("this is increment");
        for(int i = 0; i <= 10 ; i++){
            System.out.println("hello " + i);
        }

        System.out.println("this is decrement");
        for(int i = 0; i <= 10 ; i++){
            System.out.println("hello " + i);
        }

        System.out.println("inrementing 2");
        for(int k = 0; k <= 10 ; k+=2){
            System.out.println(k);
        }

        System.out.println("decrementing 2");
        for(int l = 10; l >= 0 ; l-=2){
            System.out.println(l);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter how many times you want loop");
        int max = scanner.nextInt();

        for(int m = 0; m < max; m++){
            System.out.println(m);
        }

        scanner.close();
    }
}
