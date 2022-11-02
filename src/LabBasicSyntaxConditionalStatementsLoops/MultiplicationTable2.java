package LabBasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int multi = Integer.parseInt(scanner.nextLine());
        if (multi > 10) {
            System.out.printf("%d X %d = %d%n", n, multi, n * multi);
        } else {
            for (int i = multi; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", n, i, n * i);
            }
        }
    }
}
