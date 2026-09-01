public class main {
    public static void main(String[] args) {
        
        // static = makes a variable or method belong to the class
        //          rather than to any speicific object.
        //          commonly used for utility methods or shared resources

        Friend friend1 = new Friend("spongebob");
        Friend friend2 = new Friend("patrick");
        Friend friend3 = new Friend("sandy");
        Friend friend4 = new Friend("tom");
        Friend friend5 = new Friend("jerry");

        System.out.println(friend1.numOfFriends);
        System.out.println(friend2.numOfFriends);
        System.out.println(friend3.numOfFriends);

        System.out.println(Friend.numOfFriends);

        Friend.showFriends();

    }
}
