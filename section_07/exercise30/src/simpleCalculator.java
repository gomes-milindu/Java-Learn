public class simpleCalculator {
    private double firstNumber;
    private double secondNumber;
    
    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    
    public  double getAdditionResult(){
        double result = firstNumber + secondNumber ;
        return result;
    }

    public  double getSubtractionResult(){
        double result = secondNumber - firstNumber ;
        return result;
    }

    public  double getMultiplicationResult(){
        double result = secondNumber*firstNumber ;
        return result;
    }

    public  double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }else{
       double result = firstNumber / secondNumber;
        return result;
        }
    }


    
}
