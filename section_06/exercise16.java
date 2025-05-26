public class exercise16 {
    public static void main(String[] args) {
        boolean true_not = isPalindrome(127);
        System.out.println("True or Not: " + true_not);
    }

    public static boolean isPalindrome(int number){

        int originalNumber = number;
        int reverse = 0;
        
        do {
            int lastDigit = number%10;
            reverse =  reverse*10 + lastDigit;
            number = number / 10;
        } while (number != 0);
        
        System.out.println("Reversed Number: " + reverse);
        System.out.println("Number : " + number);
        
        if(originalNumber == reverse){
            return true;
        }else{
            return false;
        }
        
    }
}
