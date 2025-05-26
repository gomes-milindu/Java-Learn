//package udemy_java.section_06;

public class video67 {
    public static void main(String[] args) {
        
        int count = Count(9164);
        System.out.println("Count of digit: " + count);
        
    }
    
    public static int Count(int value){
        int con = 0;
        int sum = 0;
        // do{
        //     value=value/10;
        //     con++;
        // }while(value != 0);
        
        while(value != 0 ){
            value=value/10;
            con++;
        }
        

        System.out.println("Count" +con);
        for(int i=1; i<=con; i++){
            sum = sum + (value%10);
            value = value/10;
        }

        return sum;
    }

}
