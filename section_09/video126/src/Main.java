//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String... args) {
        System.out.println("Hello World Again");
        String[] splitStrings = "Hello World Again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello","World","again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first","second","third","fourth","fifth"};
        System.out.println(String.join(",",sArray));


    }

    private static void printText(String... textList) {
        for(String text : textList) {
            System.out.println(text);
        }
    }
}