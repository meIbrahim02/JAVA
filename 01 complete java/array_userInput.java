import java.util.Scanner;

public class array_userInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.println("number of foods you want: ");
        size = sc.nextInt();
        sc.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.println("enter a food: ");
            foods[i] = sc.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        } 

        sc.close();
    }
}
