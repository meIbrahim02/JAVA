public class Main {
    public static void main(String[] args) {

        // super = Refers to the parent class (subclass <- superclass)
        //          used in constructors and method overriding
        //          calls the parent constructor to initialize attributes

        Person person = new Person("Harry", "Potter");
        Student student = new Student("tom", "riddle", 4);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);


        person.showName();
        student.showName();

        student.showGPA();

        employee.showSalary();
    }
}
