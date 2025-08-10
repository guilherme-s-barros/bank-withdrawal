import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter an amount to withdraw: ");

        try (final var scanner = new Scanner(System.in)) {
            var amount = scanner.nextInt();

            if (amount % 5 != 0 || amount < 5) {
                System.out.println(
                        "Please enter an amount that is divisible by 5 and positive.");
                System.exit(0);
            }

            var notes50 = Math.divideExact(amount, 50);
            var rest = amount % 50;

            var notes25 = Math.divideExact(rest, 25);
            rest = rest % 25;

            var notes5 = Math.divideExact(rest, 5);

            if (notes50 > 0) {
                System.out.println("- note(s) of 50: " + notes50);
            }

            if (notes25 > 0) {
                System.out.println("- note(s) of 25: " + notes25);
            }

            if (notes5 > 0) {
                System.out.println("- note(s) of 5: " + notes5);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Please enter an integer number.");
        }
    }
}
