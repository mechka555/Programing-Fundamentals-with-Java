package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("Start")) {
            switch (input) {
                case "0.1":
                    sum += 0.1;
                    break;
                case "0.2":
                    sum += 0.2;
                    break;
                case "0.5":
                    sum += 0.5;
                    break;
                case "1":
                    sum += 1;
                    break;
                case "2":
                    sum += 2;
                    break;
                default:
                    System.out.printf("Cannot accept %.2f%n", Double.parseDouble(input));
                    break;
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (sum >= 2.0) {
                        sum -= 2.0;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        sum -= 0.7;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        sum -= 1.5;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        sum -= 0.8;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum >= 1.0) {
                        sum -= 1.0;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
