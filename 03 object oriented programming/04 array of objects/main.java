public class main {
    public static void main(String[] args) {
        
        Car car1 = new Car("mustang", "red");
        Car car2 = new Car("corvette", "blue");
        Car car3 = new Car("Charger", "Yellow");

        Car[] cars = {car1, car2, car3};

        for(Car car : cars){
            car.drive();
        }

        // Car[] cars = new Car[3];
    }
}
