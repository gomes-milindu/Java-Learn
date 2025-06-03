import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println(findMin(readElement(readIntegers())));
    }

    public static int readIntegers(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Value: ");
        int number = scanner.nextInt();
        return number;
    }

    public static int[] readElement(int number){
            int[] array = new int[number];
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter Your Array with Commas: ");
            String input = scanner2.nextLine();

            String[] array2 = input.split(",");

            for(int i=0; i<array2.length; i++){
                array[i] = Integer.parseInt(array2[i].trim());
            }

            return array;
    }

    public static int findMin(int[] array){
        
        int min = array[0]; 
        for(int value: array){
            if(min>value){
                min = value;
            
            }
        }

        return min;
        
    }
}
