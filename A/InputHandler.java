package A;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {

    private Scanner scanner = new Scanner(System.in);

    public char getChoice() {
        while (true) {
            try {
                System.out.print("선택 (a~d): ");
                String input = scanner.next().toLowerCase();

                if (input.length() != 1)
                    throw new InputMismatchException();

                char choice = input.charAt(0);

                if (choice < 'a' || choice > 'd')
                    throw new InputMismatchException();

                return choice;

            } catch (InputMismatchException e) {
                System.out.println("⚠ a, b, c, d 중 하나만 입력해주세요.");
                scanner.nextLine();
            }
        }
    }
}
