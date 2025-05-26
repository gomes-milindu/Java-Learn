public class App {
    public static void main(String[] args) throws Exception {
        information("Hello World");
    }

    public static void information(String string){
        int length = string.length();
        System.out.println("Length: " + length);
        System.out.println("First Char = "  + string.charAt(0));
        System.out.println("Last Char = "  + string.charAt(length-1));

        // java methods tika blnna
        

    }
}
