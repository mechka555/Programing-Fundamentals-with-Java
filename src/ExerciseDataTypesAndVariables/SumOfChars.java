package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < count; i++) {
            char a = scanner.next().charAt(0);
            int input = (int) a;
            sum += input;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
