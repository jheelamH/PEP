public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMake("Ford");
        car1.setModel("Mustang");
        car1.setYear(2023);
        car1.startEngine();

        Car car2 = new Car("Toyota", "Corolla", 2022);
        car2.startEngine();

        System.out.println("Car2 Make: " + car2.getMake());
        System.out.println("Car2 Model: " + car2.getModel());
        System.out.println("Car2 Year: " + car2.getYear());
    }
}
