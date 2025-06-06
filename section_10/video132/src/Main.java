import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
record GroceryItem(String name, String type, int count){
    public GroceryItem (String name){
        this(name, "Diary", 1);
    }
}


public class Main {
    public static void main(String[] args) {
           Object[] groceryArray = new Object[3];
           groceryArray[0] = new GroceryItem("milk");
           groceryArray[1] = new GroceryItem("apple","PRODUCE",6);

           groceryArray[2] = new GroceryItem("Oranges","PRODOCE",5);
           System.out.println(Arrays.toString(groceryArray));

           ArrayList objectList = new ArrayList();
           objectList.add(new GroceryItem("Butter"));
           objectList.add("Yogurt");

            ArrayList<GroceryItem> groceryList = new ArrayList<>();
           // ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();

            ArrayList<GroceryItem> groceryList = new ArrayList<>();
            groceryList.add(new GroceryItem("Butter"));
            groceryList.add(new GroceryItem("Yogurt"));


    }
}