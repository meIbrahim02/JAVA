import java.util.Scanner;
public class array_elementSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {1, 9, 4, 6, 7, 8, 2};
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;
        String target;

        System.out.println("Enter a fruit to search for: ");
        target = sc.nextLine();

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the array");
        }

        sc.close();
    }
}
