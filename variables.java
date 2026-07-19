public class variables {
    public static void main(String[] args) {
        // variables = a reusable container for a value
        //              a variable behaves as if it was the value it contains
        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive vs Reference
        // ---------    ---------
        // int             string
        // double           array
        // char             object
        // boolean 
        
        // 2 steps to creating a variable 
        // ------------------------------
        // 1. declaration
        // 2. assignment

        // Primitive
        int age = 21;
        int year = 2026;
        int quantity = 1;

        System.out.println(age);
        System.out.println("the year is: " + year);
        System.out.println(quantity);

        double price = 19.99;
        double gpa = 7.5;
        double temperature = -12.5;

        System.out.println("the price is: " + price);
        System.out.println("gpa of the student is: " + gpa);
        System.out.println(temperature);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(symbol);
        System.out.println(grade);
        System.out.println(currency);

        boolean isStudent = true; //camelCase
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);

        // boolean are usually used internally 
        // they not used in printing mostly
        // they are mostly used in arguments or if else statements
        if (isStudent){
            System.out.println("you are a student");
        }
        else{
            System.out.println("you are NOT a student!");
        }

        // there are more data types 
        // byte
        // short
        // long
        // void

        // Reference 
        String name = "Ibrahim";
        String food = "Pizza";
        String email = "ibrahimsiddique339@gmail.com";
        System.out.println("my name is"+name);
        System.out.println(food);
        System.out.println("my email is: " + email);


        System.out.println("hello " + name + ", " + "i am " + age + " years old " + "my email is " + email);

    }
}