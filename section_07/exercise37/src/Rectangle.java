public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        if(width<0){
            return 0;
        }else {
            return width;
        }
    }

    public double getLength() {
        if(length <0){
            return 0;
        }else {
            return length;
        }
    }

    public double getArea(){
        return getLength() * getWidth();
    }
}
