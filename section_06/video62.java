//package udemy_java.section_06;

public class video62 {
    public static void main(String[] args) {
        
        boolean output = isPrime(4);
        if(output){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is Not prime");
        }
    }   
    
    public static boolean isPrime(int wholeNumber) {
        
        if(wholeNumber>=2){
            for(int i = 2; i<=Math.sqrt(wholeNumber); i++){
                if(wholeNumber%i == 0){
                    return false;
                }
            }
        }else{
            return false;    
        }
        return true;
    }
}
