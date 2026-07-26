public class precision {
    public static void main(String[] args) {
        // precision

        double price1 = 9.99;
        double price2 = 100.0022;
        double price3 = -54.01;

        System.out.printf("%.1f\n", price1);
        System.out.printf("%.3f\n", price2);
        System.out.printf("%.0f\n", price3);

        // + = outputs a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive
        
        System.out.printf("%+.1f\n", price1);
        System.out.printf("%,.1f\n", price1);
        System.out.printf("%(.1f\n", price2);
        System.out.printf("% .1f\n", price2);
    }
}
