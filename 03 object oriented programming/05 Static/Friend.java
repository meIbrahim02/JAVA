public class Friend {

    String name;
    // int numOfFriends;
    static int numOfFriends;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("you have " + numOfFriends + " total friends");
    }

}

    
