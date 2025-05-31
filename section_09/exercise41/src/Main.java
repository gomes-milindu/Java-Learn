import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        printArray(sortIntegers(getIntegers()));
    }

    public static int[] getIntegers(){
        Scanner scanner = new Scanner(System.in);
        int[] unsorted = new int[5];

        for(int i = 0; i < unsorted.length; i++){
            System.out.print("Enter an integer: ");
            unsorted[i] = scanner.nextInt();
        }
        return unsorted;
    }

    public static int[] sortIntegers(int[] unsorted){
        int[] sorted = Arrays.copyOf(unsorted, unsorted.length);
        Arrays.sort(sorted);
        return sorted;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element: " + i +"  contents " +array[i]);
        }
    }

}