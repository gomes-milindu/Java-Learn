import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        
        System.out.println("Enter Your Array: ");
        String input  = scanner.nextLine();

        String[] value = input.split(",");

        for(int i=0; i<value.length; i++){
            array[i] = Integer.parseInt(value[i]);
        }

        int maxLength = array.length-1 ;
        int middle = array.length/2;

        for(int i=0; i<middle; i++){
            int temp = array[i];
            array[i] = array[maxLength - i] ;
            array[maxLength - i]= temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
