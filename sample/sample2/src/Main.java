import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values with commas: ");
        String input = scanner.nextLine();

        System.out.println(input);

        String[] splits = input.split(",");
        System.out.println(Arrays.toString(splits));
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        System.out.println("Values: " + Arrays.toString(values));

        //return values;
    }
}