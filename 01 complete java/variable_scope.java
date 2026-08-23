public class variable_scope {

    static int y = 3; // CLASS scope
    public static void main(String[] args) {
        // variable scope = where a variable can be accessed

        int x = 1; // local variable
        System.out.println(x);

        doSomething(); 

        System.out.println(y);
        // java uses local variable first before the class variable
    }
    static void doSomething(){
        int x = 2; 
        System.out.println(x);

        System.out.println(y);
    }
}
