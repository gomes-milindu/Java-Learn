//package udemy_java.section_06;

public class video63 {
    public static void main(String[] args) {
        
        int sum = 0;
        int count = 0; 
        
        for(int i =1; i<=1000; i++){
            if(i%3 == 0 && i%5 == 0){
                sum += i;
                count ++;
                System.out.println(i);
            }

            if(count == 5){
                break;
            }
        }

        System.out.println("count is: " + count);
        System.out.println("sum is: " + sum);
    }

}
