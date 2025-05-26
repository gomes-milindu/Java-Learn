public class App {
    public static void main(String[] args){
        getEvenDigitSum(123456789);
    }

    public static int getEvenDigitSum(int number){
        
        if(number<0){
            return -1;
        }else{
            int sum = 0;
            while(number != 0){
                
                int value = number % 10;
                
                if(value%2 == 0){
                    sum += value;
                    
                }
                
                number /= 10;
            }

            System.out.println("Sum  " + sum);
        }
        return 1;
    }
}
