public class method2 {
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        double result = square(3);
        System.out.println(result);
        System.out.println(square(3));
        System.out.println(cube(4));
        String fullname = getFullName("Spongebob", "Squarepants");
        System.out.println(fullname);

        int age = 12;
        if(ageCheck(age)){
            System.out.println("you may sign up");
        }
        else{
            System.out.println("you must be 18+ to sign up");
        }
    }
}
