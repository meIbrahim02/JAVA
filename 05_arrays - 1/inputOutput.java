import java.util.*;

public class inputOutput {
    public static void main(String[] args) {
        int marks[] = new int[100];
        
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); // physics
        marks[1] = sc.nextInt(); // chemistry
        marks[2] = sc.nextInt(); // maths

        System.out.println("marks in physics : " + marks[0]);
        System.out.println("marks in chemistry : " + marks[1]);
        System.out.println("marks in maths : " + marks[2]);

        int percentage = (marks[0] + marks[2] + marks[3]) / 3;
        System.out.println("percentage is : " + percentage);

        System.out.println("length of array is : " + marks.length);
    }
}