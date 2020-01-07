class Vehicle {

    protected String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    //Vehicle{licensePlate=ABC123}

    @Override
    public String toString() {
        return "Vehicle{licensePlate="+licensePlate+"}";
    }
}

class Car extends Vehicle {

    protected int numberOfSeats;

    public Car(String licensePlate, int numberOfSeats) {
        super(licensePlate);
        this.numberOfSeats = numberOfSeats;
    }

    //Car{licensePlate=ABC123,numberOfSeats=4}
    @Override
    public String toString() {
        return "Car{licensePlate="+super.licensePlate+",numberOfSeats="+numberOfSeats+"}";
    }
}