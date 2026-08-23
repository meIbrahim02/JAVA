public class overloaded_method {
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        return a + b + c + d;
    }
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name, but different parameters signature = name + parameters
        System.out.println(add(1, 2));
        System.out.println(add(3, 5, 6));
        System.out.println(add(4,7,9,1));
    } 
}
