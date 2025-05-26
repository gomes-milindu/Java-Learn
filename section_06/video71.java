import java.util.Scanner;


public class video71 {
    public static void main(String[] args) {
            // wrapper method
            /*String byear = "2000";
            String fyear = "2022";

            int birthday = Integer.parseInt(fyear) - Integer.parseInt(byear);
            System.out.println(birthday);

            String weight = "25.32";
            double weight1 = Double.parseDouble(weight);
            System.out.println("weight: " + weight1);*/
            
            int currentYear = 2022;
           // System.out.println(getInputFromConsole(currentYear));
            System.out.println(getInputFromScanner(currentYear));

            // catch and try eka blnna 
            

    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi whats your Name? ");
        System.out.println("My name is " + name + "Im " + currentYear + "Years Old");
        
        return "";
    }

    public static String getInputFromScanner(int currentYear){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name: ");
        String name2 = scanner.nextLine();
        System.out.println(name2);
        return "";
    }
}
