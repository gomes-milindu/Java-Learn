import java.util.ArrayList;


public class App {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(/*10 */);
        arr.add(0, 5);
        arr.add(1, 30);
        // arr.add(10,15);
        
        // System.out.println(arr);
        // System.out.println(arr.get(1));
        // System.out.println(arr.indexOf(5));

        arr.set(0,10);
        // System.out.println(arr);

        for(int i=0; i<= arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
