import java.util.Scanner;

public class MenuProgram {
    public static void displayMenu() {
        System.out.println("\nMenu:\n1. Greet User\n2. Check Even/Odd\n3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println(number + (number % 2 == 0 ? " is an Even number." : " is an Odd number."));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> greetUser();
                case 2 -> checkEvenOrOdd();
                case 3 -> {
                    System.out.println("Exiting program. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }
}


