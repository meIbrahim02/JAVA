public class method {
    static void happyBirthday(String name, int age){
        System.out.println("happy birthday to you");
        System.out.printf("happy birthday dear %s%n", name);
        System.out.printf("you are %d years old%n", age);
        System.out.println("happy birthday to you\n");
    }
    public static void main(String[] args) {
        // method = a block of reusable code that is executed when called()
        
        String name = "ibrahim";
        int age = 21;
        
        happyBirthday(name, age);
      
    }
    
}
