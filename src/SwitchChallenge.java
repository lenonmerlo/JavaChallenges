import java.util.Scanner;

public class SwitchChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter (A-E): ");
        char letter = Character.toUpperCase(scanner.next().charAt(0));

        switch (letter) {
            case 'A' -> System.out.println("A = Able");
            case 'B' -> System.out.println("B = Baker");
            case 'C' -> System.out.println("C = Charlie");
            case 'D' -> System.out.println("D = Dog");
            case 'E' -> System.out.println("E = Easy");
            default -> System.out.println("Letter not found in the NATO phonetic alphabet (A-E).");
        }

        scanner.close();
    }
}
