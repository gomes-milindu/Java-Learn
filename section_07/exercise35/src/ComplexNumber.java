public class ComplexNumber{
    
    private double real;
    private double imaginary;

    
    
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }
    
    public double getImaginary() {
        return imaginary;
    }

    public double addWith(double real, double imaginary){
        return real + imaginary;
    } 

    public int add(ComplexNumber complexNumber){

    }

}
