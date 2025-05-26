public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden is Starting";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi is Accelarating";
    }

    @Override
    public String brake() {
        return "Holding is Breaking";
    }
}
