package MoreExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        int max = 0;
        int mid = 0;
        int min = 0;

        if (n1 > n2 && n1 > n3) {
            max = n1;
            if (n2 > n3) {
                mid = n2;
                min = n3;
            } else {
                mid = n3;
                min = n2;
            }
        } else if (n2 > n1 && n2 > n3) {
            max = n2;
            if (n1 > n3) {
                mid = n1;
                min = n3;
            } else {
                mid = n3;
                min = n1;
            }
        } else {
            max = n3;
            if (n2 > n1) {
                mid = n2;
                min = n1;
            } else {
                mid = n1;
                min = n2;
            }
        }
        System.out.printf("%d%n%d%n%d", max, mid, min);
    }
}
