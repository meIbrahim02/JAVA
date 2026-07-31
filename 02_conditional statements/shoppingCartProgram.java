import java.util.Scanner;

public class shoppingCartProgram {
    public static void main(String[] args) {
        // SHOPPING CART PROGRAM

        Scanner scan = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$'; 
        double total;

        System.out.print("what item would you like to buy?: ");
        item = scan.nextLine();
        System.out.println(item);

        System.out.print("what is the price of your item?: ");
        price = scan.nextDouble();
        System.out.println(price);

        System.out.print("how many would you like?: ");
        quantity = scan.nextInt();
        System.out.println(quantity);


        total = price * quantity;
        System.out.println("\nyou have bought " + quantity + " " + item + "/s" );
        System.out.println("Your total is " + currency + total);

        scan.close();
    }
}
