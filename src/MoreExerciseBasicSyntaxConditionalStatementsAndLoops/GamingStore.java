package MoreExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentMoney = Double.parseDouble(scanner.nextLine());
        double startMoney = currentMoney;
        String input = scanner.nextLine();

        while (!input.equals("Game Time")) {
            switch (input) {
                case "OutFall 4":
                    currentMoney -= 39.99;
                    if (currentMoney < 0) {
                        currentMoney += 39.99;
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought OutFall 4");
                    }
                    break;
                case "CS: OG":
                    currentMoney -= 15.99;
                    if (currentMoney < 0) {
                        currentMoney += 15.99;
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought CS: OG");
                    }
                    break;
                case "Zplinter Zell":
                    currentMoney -= 19.99;
                    if (currentMoney < 0) {
                        currentMoney += 19.99;
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought Zplinter Zell");
                    }
                    break;
                case "Honored 2":
                    currentMoney -= 59.99;
                    if (currentMoney < 0) {
                        currentMoney += 59.99;
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought Honored 2");
                    }
                    break;
                case "RoverWatch":
                    currentMoney -= 29.99;
                    if (currentMoney < 0) {
                        currentMoney += 29.99;
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought RoverWatch");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    currentMoney -= 39.99;
                    if (currentMoney < 0) {
                        currentMoney += 39.99;
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought RoverWatch Origins Edition");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (currentMoney == 0) {
                System.out.println("Out of money!");
                break;
            } else {
                input = scanner.nextLine();
            }
        }
        if (input.equals("Game Time")) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", startMoney - currentMoney, currentMoney);
        }

    }
}
