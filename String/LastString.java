package String;

public class LastString {
    public static void main(String[] args) {

        String str = "Hello 123 Java 456 Programming 789";

        // Remove digits
        str = str.replaceAll("\\d", "");

        // Remove extra spaces
        str = str.trim().replaceAll("\\s+", " ");

        // Split into words
        String[] words = str.split(" ");

        // Print last word
        System.out.println(words[words.length - 1]);
    }
}
