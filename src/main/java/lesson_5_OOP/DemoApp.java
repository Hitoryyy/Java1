package lesson_5_OOP;

public class DemoApp {

    public static void main(String[] args) {
        Car car = new Car("Dodge", 2020);



        car.info();
        car.printModel();

        car.crash();
        car.info();

        String carModel = car.getModel();



        //Car.info() - нельзя т.к. не статический

        /*Car car2 = new Car();
        car2.model = "Ford";
        car2.year = 1990;
        car2.wheelsNumber = 6;

        System.out.println("Model = " + car2.model + " year = " + car2.year
                + " wasCrashed = " + car2.wasCrashed + car.wheelsNumber);
        System.out.println("Model = " + car2.model + " year = " + car2.year
                + " wasCrashed = " + car2.wasCrashed + car2.wheelsNumber);

        int wheelsNumber = Car.wheelsNumber;
        String model = car.model;


        Car[] cars = new Car[]{car, car2};*/

        //stringpool


    }
}
