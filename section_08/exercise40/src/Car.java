public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheel;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheel = 4;
    }

    public String startEngine(){
        return "Car's Engine is Starting";
    }

    public String accelerate(){
        return "Car is accelarating";
    }

    public String brake(){
        return "Car is breaking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
