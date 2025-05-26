public class App {
    public static void main(String[] args) throws Exception {
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World");
        printInformation("helloWorld");
        printInformation(helloWorldBuilder);

    }

    public static void printInformation(String string) {
        System.out.println("String " + string);
        System.out.println("Length: " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("String Builder: " + builder);
        System.out.println("Length: " + builder.length());
    }
}
