import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Values: ");
        String input = scanner.nextLine();
        String[] value = input.split(",");

        for(int i =0; i<value.length; i++){
            array[i] = Integer.parseInt(value[i].trim());
        }

        int maxValue = array.length - 1;
        int middle = array.length/2;

        for(int i=0; i<middle; i++){
             int temp = array[i];
             array[i] = array[maxValue - i];
             array[maxValue - i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
