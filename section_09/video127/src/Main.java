import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println(findMin(readInteegers()));
    }

    public static int[] readInteegers(){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for(int i =0; i<numbers.length; i++){
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static int findMin(int[] arr2){
        int min = arr2[0];
        for(int value : arr2){
            if(value<min){
                min = value;
            }
        }

        return min;
    }
}