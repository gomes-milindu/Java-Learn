import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            // two dimensional array

       /* int[][] arr = {{2,3}, {5,7}, {10,11}};

        // initializing

        int[][] arr2 = new int[3][2];

        // 3 means outer arrays
        // 2 means element in one array

        // declaration

        int[][] myDoubleArray;
        int[] myDoubleArray2[];*/

        int[][] arr2 = new int[4][4];
        System.out.println(Arrays.toString(arr2));
        System.out.println("array2.length = " + arr2.length);

        for(int[] outer : arr2){
            System.out.println(Arrays.toString(outer));
        }

        for(var outer : arr2){
            for(var element : outer){
                System.out.println(element + " ");
            }
            System.out.println();
        }

 //       for(int i =0; i<arr2.length; i++){
//            var innerArray:int[] = arr2[i];
//            for(int j=0; j<innerArray.length; j++){
//                System.out.println(arr2[i][j]);
//            }
//            System.out.println();
//        }

        System.out.println(Arrays.deepToString(arr2));
    }
}