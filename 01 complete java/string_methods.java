public class string_methods {
    public static void main(String[] args) {

        String name = "Ibrahim Codes";

        int length = name.length();
        System.out.println("the length of the string is: " + length);
        
        char letter = name.charAt(2);
        System.out.println(letter);

        int index = name.indexOf("o");
        System.out.println(index);

        int lastIndex = name.lastIndexOf("o");
        System.out.println(lastIndex);

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.replace("o", "a"));
        System.out.println(name.isEmpty());

        if(name.isEmpty()){
            System.out.println("your name is empty");
        }
        else{
            System.out.println("hello " + name);
        }

        if(name.contains(" ")){
            System.out.println("your name contains a space.");
        }
        else{
            System.out.println("your name doesnt contain space.");
        }

        String password = "password";
        if(password.equals("password")){ // to ignore case sensitivity use .equalsIgnoreCase
            System.out.println("please enter a strong password");
        }
        else{
            System.out.println("password accepted");
        }
    }
}
