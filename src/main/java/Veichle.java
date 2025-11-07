interface Vehicle {
    void drive();
}
class Car implements Vehicle {
    public void drive() {
        System.out.println("Driving a car 🚗");
    }
}
class Bike implements Vehicle {
    public void drive() {
        System.out.println("Riding a bike 🚲");
    }
}
class Truck implements Vehicle {
    public void drive() {
        System.out.println("Driving a truck 🚚");
    }
}