public class main2 {
    public static void main(String[] args) {
        Car[] cars = {new Car("mustang", "Red"), 
                        new Car("corvette", "Blue"),
                        new Car ("Charger", "yellow")};

        for (Car car : cars){
            car.color = "black";
        }

        for (Car car : cars){
            car.drive();
        }
    }
}
