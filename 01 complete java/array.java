import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        // array = a collection of values of the same data type

        String[] fruits = {"apple", "orange", "banana", "coconut"};
        
        System.out.println(fruits[0]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        
        // fruits[0] = "pineapple";
        // System.out.println(fruits[0]);

        // int numOfFruits = fruits.length;
        // System.out.println(numOfFruits);

        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapples");
         

        // for(int i = 0; i < fruits.length; i++){
        //     System.out.println(fruits[i]);
        // }

        // enhanced for loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
} 
