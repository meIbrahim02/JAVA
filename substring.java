import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        // .substring() = A method used to extract a portion of a string
        //                      string.substring(start, end)

        Scanner scan = new Scanner(System.in);

        String email = "ibrahimsiddique339@gmail.com";
        String username = email.substring(0, 15);
        String domian = email.substring(19, 28);
        // other way for domain is 
        String domain1 = email.substring(email.indexOf("@") + 1);

        System.out.println(username);
        System.out.println(domian);
        System.out.println(domain1);

        String mail;
        String user;
        String dom;

        System.out.println("enter your email: ");
        mail = scan.nextLine();

        if(email.contains("@")){
            user = mail.substring(0, mail.indexOf("@"));
            dom = mail.substring(mail.indexOf("@")+1);
            
            System.out.println(user);
            System.out.println(dom);
        }
        else{
            System.out.println("emails must contain @");
        }

        scan.close();

    }
}
