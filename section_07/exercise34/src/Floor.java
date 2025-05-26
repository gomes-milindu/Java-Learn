public class Floor {
    
    private double length;
    private double width;

    Floor(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if(length<0){
            this.length = 0;
        }else{
            this.length = length;
        }
        
    }

    public void setWidth(double width) {
        if(width<0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }

    public double getArea(){
        return width*length;
    }

    
}
