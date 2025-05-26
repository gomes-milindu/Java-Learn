public class exercise17 {
    public static void main(String[] args) {
        FirstLastDigitSum(1258);
    }

    public static void FirstLastDigitSum(int number) {
        
        int sum = 0;
        int firstDigit = 0;
        int lastDigit = number %10;
        while (number != 0) {
            
            number = number / 10;
            
            if(number == 0){
                break;
            }
            
            firstDigit = number;
            System.out.println("Number: " + number);
            
        }
        
        sum = lastDigit + firstDigit;
        System.out.println("Sum: " + sum);
        
        
    }
}
