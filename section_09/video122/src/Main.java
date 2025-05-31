import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] sArray = {"Able","Jane","Mark","Ralph","David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        if(Arrays.binarySearch(sArray,"Mark") >= 0){  // binary search work for only sorted arrays
            System.out.println("Found Mark in the array");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        if(Arrays.equals(s1, s2)){
            System.out.println("Borth Arrays are equal");
        }else{
            System.out.println("Borth Arrays are not equal");
        }


    }
}