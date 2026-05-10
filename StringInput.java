import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String words;

        System.out.print("Type some words: ");
        words = scanner.nextLine();
        System.out.printf("You Entered: %s\n", words);

        scanner.close();

    }

}