import java.util.Scanner;

public class circumference {
public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scan.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.printf("the circumference of the circle is: %.2f", circumference);

        area = Math.pow(radius, 2);
        System.out.printf("the area of the circle is %.2f ", area);

        // volume = 
        scan.close();
    }
}