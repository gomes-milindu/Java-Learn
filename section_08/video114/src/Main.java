//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("Burger A","Burger",5.00,"Large");
        Item item2 = new Item("Burger AB","Burger",15.00,"Medium");
        Item item3 = new Item("Burger ABC","Burger",25.00,"Small");

        Burger burger1 = new Burger("Burger A","Burger",5.00,"Large",item1,item2,item3);
        System.out.println(burger1.toString());

    }
}