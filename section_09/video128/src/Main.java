import java.util.Arrays;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Numbers: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(",");

        for(int i = 0; i < numbers.length; i++){
            array[numbers.length-1-i] = Integer.parseInt(numbers[i]);
        }

        System.out.println(Arrays.toString(array));

    }
}