public class Mitsubishi extends  Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi is Starting";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi is Accelarating";
    }

    @Override
    public String brake() {
        return "Mitsubishi is Breaking";
    }
}
