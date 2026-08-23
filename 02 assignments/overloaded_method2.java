public class overloaded_method2 {
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }
    public static void main(String[] args) {
        String pizza = bakePizza("flat bread", "mozzarella", "pepporoni");
        System.out.println(pizza);
    }
}
