// multiple function with same name but different parameters is called function overloading.

public class function_overloading_parameters {
    // using parameters
    // sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // sum of 3 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    };

    public static void main(String[] args) {
        System.out.println("Sum of 2 numbers: " + sum(10, 20));
        System.out.println("Sum of 3 numbers: " + sum(10, 20, 30));
    }
}

