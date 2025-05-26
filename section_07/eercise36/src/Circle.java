import static java.lang.Math.PI;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        if(radius<0){
            return 0;
        }else {
            return radius;
        }
    }

//    public void setRadius(double radius) {
//
//        if(radius<0){
//            this.radius = 0;
//        }else {
//            this.radius = radius;
//        }
//    }

    public double getArea(){
        return getRadius()*getRadius()*PI;
    }
}
