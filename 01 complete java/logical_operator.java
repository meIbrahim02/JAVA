
public class logical_operator {
    public static void main(String[] args) {
        // && = AND
        // || = OR
        // !  = NOT

        double temp = -10 ;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("the weather is good");
            System.out.println("the weather is Sunny");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("the weather is good but NOT sunny");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("the temperature is bad");
        }
    }
}
