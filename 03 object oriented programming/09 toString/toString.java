public class toString {
    public static void main(String[] args) {
        // .toString() = Method inherited from the Object class. 
        //                  used to return a string represntation of an object.
        //                  By default, it returns a heash code as a uniwue identifier. 
        //                  It can be overriden to provide meaningful details

        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Chervorlet", "Corvette", 2026, "Blue");

        System.out.println(car1);
        System.out.println(car2);
    }
}
