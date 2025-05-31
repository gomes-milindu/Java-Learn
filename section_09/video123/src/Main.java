import java.util.Arrays;
import java.util.Random;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = getRandomNumber(5);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[5];

        for (int i = 0; i<arr.length; i++){
            arr2[i] = arr[arr.length-1-i];
        }

        System.out.println(Arrays.toString(arr2));
    }

    public static int[] getRandomNumber(int length){
        Random random = new Random();
        int[] newInt = new int[5];
        for(int i = 0; i < length; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}