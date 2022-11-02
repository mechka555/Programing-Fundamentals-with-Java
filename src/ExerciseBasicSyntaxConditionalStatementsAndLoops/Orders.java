package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sumTotal = 0;
        for (int i = 0; i < n; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            double priceOrder = pricePerCapsule * days * capsulesCount;
            sumTotal += priceOrder;
            System.out.printf("The price for the coffee is: $%.2f%n", priceOrder);
        }
        System.out.printf("Total: $%.2f", sumTotal);
    }
}
