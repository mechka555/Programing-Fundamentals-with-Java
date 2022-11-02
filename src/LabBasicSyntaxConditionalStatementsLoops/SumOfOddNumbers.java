package LabBasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(1 + 2 * i);
            sum += 1 + 2 * i;
        }
        System.out.printf("Sum: %d", sum);
    }
}
