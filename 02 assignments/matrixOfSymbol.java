import java.util.Scanner;

public class matrixOfSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.print("enter the # of rows: ");
        rows = sc.nextInt();

        System.out.print("enter the # of rows: ");
        columns = sc.nextInt();

        System.out.print("enter the symbol to use: ");
        symbol = sc.next().charAt(0);


        for(int j = 0; j < rows; j++){
            for(int i = 0; i < columns; i++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        sc.close();
    }
}
