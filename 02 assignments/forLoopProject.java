import java.util.*;

public class forLoopProject {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.print("how many seconds to count down from? :");
        int start = sc.nextInt();
        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("happy new year");
        sc.close();
    }
}
