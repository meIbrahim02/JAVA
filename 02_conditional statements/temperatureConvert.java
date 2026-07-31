import java.util.Scanner;
public class temperatureConvert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature: ");
        temp = scan.nextDouble();

        System.out.println("convert to celcius or fahrenheit? (C or F): ");
        unit = scan.next().toUpperCase();

        // (condition) ? true : false 
        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;
        System.out.println(newTemp + unit);
           
    }
}
