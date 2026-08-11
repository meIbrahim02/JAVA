import java.util.Scanner;
public class binomial_coeffienct {
    public static int calculateFactorial(int number) {
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static int binCoeff(int n, int r){
        int fact_n = calculateFactorial(n);
        int fact_r = calculateFactorial(r);
        int fact_nmr = calculateFactorial(n - r);

        int binCoeff = (fact_n / fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int r;
        System.out.println("enter n : ");
        n = sc.nextInt();
        System.out.println("enter r : ");
        r = sc.nextInt();

        System.out.println(binCoeff(n, r));

        sc.close();
        
    }
}