public class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getHeight() {
        if(height<0){
            return 0;
        }else {
            return height;
        }

    }

    public double getVolume(){
        return getArea() * getHeight();
    }
}
