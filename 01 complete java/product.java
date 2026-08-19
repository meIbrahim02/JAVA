public class product {
    int multi(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int prod = new product().multi(a, b);
        System.out.println(prod);
    }
}
