public class function_overloading_dataTypes {
    public static int sum(int a, int b){
        return a + b;
    }
    public static double sum(double a, double b){
        return a + b;
    }
    public static float sum(float a, float b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 2 integers: " + sum(10, 20));
        System.out.println("Sum of 2 doubles: " + sum(10.5, 20.5));
        System.out.println("Sum of 2 floats: " + sum(10.5f, 20.5f));
    }
}
