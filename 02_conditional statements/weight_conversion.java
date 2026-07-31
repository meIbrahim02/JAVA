import java.util.Scanner;
public class weight_conversion {
    public static void main(String[] args) {
        // WEIGHT CONVERSION PROGRAM

        Scanner scan = new Scanner(System.in);
        // DECLARE VARIABLES

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // PROMPOT FOR USER CHOICE
        System.out.print("choose an option: ");
        choice = scan.nextInt();
        // OPTION 1 CONVERT LBS TO KGS
        if(choice == 1){
            System.out.println("enter the weight in lbs: ");
            weight = scan.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("the new weight in kgs is: %.3f", newWeight);
        }
        else if(choice == 2){// OPTION 2 CONVERT KSG TO LBS
            System.out.println("enter the weight in kgs: ");
            weight = scan.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("the new weight in lbs is: %.3f", newWeight);
        }
        else{
            System.out.println("please select an option.");
        }


        scan.close();
    }
}
