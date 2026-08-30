public class Object {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println( "you drive the car " + car1.model + " and " + car2.model); // will be explained in constructors

        car1.isRunning = true;

        System.out.println(car1.isRunning);
        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.price);
        System.out.println(car1.year);



        // start or stop
        car1.start();
        System.out.println(car1.isRunning);
        car1.stop();
        System.out.println(car1.isRunning);

        car1.drive();
        car1.brake();
    }
}