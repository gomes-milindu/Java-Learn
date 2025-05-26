//package udemy_java.section_06;
// coding exercise
public class video64 {
    
    public static void main(String[] args) {
        
        int display = sumOdd(13,13);
        System.out.println(display);
    }
    
    
    public static boolean isOdd(int value){
        
        if(value>0){
            if(value%2 == 0){
                //System.out.println(value + "Number is odd");
                return false;
            }    
        }else{
            return true;
        }
        return true;
    }

    
    public static int sumOdd(int start, int end){
        int sum = 0;
        if(end>start && start>0 && end>0){
            for(int i=start; i<=end; i++){
                if(isOdd(i)){
                    sum+=i;
                };
            }
        }else if(start == end){
            if(isOdd(start)){
                return start;
            }else{
            return 0;
            }
        }else{
            return -1;
        }
        
        return sum;
    }

    
}
