import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter an integer: ");

        number = scanner.nextInt();

        System.out.printf("You Entered: %d\n", number);

        scanner.close();
        
    }

}
